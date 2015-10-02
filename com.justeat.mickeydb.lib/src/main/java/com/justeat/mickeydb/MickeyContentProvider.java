/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.justeat.mickeydb;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.justeat.mickeydb.util.Uris;

import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.LruCache;


/**
 * <p>Base for all generated mickey content providers</p>
 *
 */
public abstract class MickeyContentProvider extends ContentProvider {
		
	public static final String PARAM_NOTIFY = "mickey_notify";
	public static final String PARAM_GROUP_BY = "mickey_group_by";
	public static final String PARAM_LIMIT = "mickey_limit";
	public static final String PARAM_OFFSET = "mickey_offset";

    private MickeyOpenHelper mOpenHelper;

	private UriMatcher mUriMatcher;
    private String[] mContentTypes;
    private LruCache<Integer, ContentProviderActions> mActionCache = new LruCache<>(10);

	private boolean mDebug;
    
    public MickeyContentProvider(boolean debug) {
		mDebug = true;
	}
    
    public MickeyContentProvider() {
		this(false);
	}
    
    public MickeyOpenHelper getOpenHelper() {
		return mOpenHelper;
	}

	protected int matchUri(Uri uri) {
		return mUriMatcher.match(uri);
	}
    
	@Override
	public boolean onCreate() {
        final Context context = getContext();
        mUriMatcher = createUriMatcher();
        mContentTypes = createContentTypes();
        mOpenHelper = createOpenHelper(context);
		return true;
	}
	
	protected abstract UriMatcher createUriMatcher();
	
	protected abstract String[] createContentTypes();
	
	protected abstract ContentProviderActions createActions(int id);
	
	private ContentProviderActions getActions(int id) {
		ContentProviderActions actions = mActionCache.get(id);
		if(actions == null) {
			actions = createActions(id);
			mActionCache.put(id, actions);
		}
		return actions;
	}

	protected abstract MickeyOpenHelper createOpenHelper(Context context);
	
	protected abstract Set<Uri> getRelatedUris(Uri uri);

    /**
     * Notifies a change (invokes {@link ContentResolver#notifyChange(Uri, android.database.ContentObserver) 
     * if {@link PARAM_NOTIFY} parameter is not present in the given Uri, or, if it
     * is present and set to a value other than the string <em>true</em>.
     * @param uri The uri to notify on.
     */
    protected void tryNotifyChange(Uri uri) {
        boolean notify = shouldNotify(uri);
		
		if(notify) {
			if(mDebug) {
				MickeyLogger.d(Mickey.TAG, "Notify", "%s", uri);
			}	
		    getContext().getContentResolver().notifyChange(uri, null);	
		    
		    if(uri.getPathSegments().size() > 0) {
			    Uri key = new Uri.Builder()
			    	.scheme(uri.getScheme())
			    	.authority(uri.getAuthority())
			    	.appendPath(uri.getPathSegments().get(0))
			    	.build();
			    
			    Set<Uri> relatedUris = getRelatedUris(key);
			    
			    if(relatedUris != null) {
				    for(Uri relatedUri : relatedUris) {
						if(mDebug) {
							MickeyLogger.d(Mickey.TAG, "Notify","%s", relatedUri);
						}
				    	getContext().getContentResolver().notifyChange(relatedUri, null);
				    }
			    }
		    }
		}
    }

	protected boolean shouldNotify(Uri uri) {
		boolean notify = true;
		
		String paramNotify = uri.getQueryParameter(PARAM_NOTIFY);
		
		if(paramNotify != null) {
		    notify = Boolean.valueOf(paramNotify);
		}
		return notify;
	}
    
    /**
     * Sets the Uri as the notification Uri on the given Cursor if the Uri is not null, and
     * the {@link PARAM_NOTIFY} parameter is not present in the given Uri, or, if it is present
     * and set to a value other than the string <em>true</em>
     * @param cursor
     * @param uri
     */
    protected void trySetNotificationUri(Cursor cursor, Uri uri) {
    	if(cursor == null) {
    		return;
    	}
    	
    	boolean notify = shouldNotify(uri);
    	
    	if(notify) {
    		cursor.setNotificationUri(getContext().getContentResolver(), uri);
    	}
    }
    
	private void tryNotifyForActions(Uri uri, ContentProviderActions actions) {
		if(shouldNotify(uri)) {
			List<Uri> notifyUris = actions.getNotifyUris(this, uri);
			if(notifyUris == null || notifyUris.size() == 0) {
				tryNotifyChange(uri);
			} else {
				for(Uri actionNotifyUri : notifyUris) {
					if(mDebug) {
						MickeyLogger.d(Mickey.TAG, "Notify", "%s", Uris.getPathAndQueryAsString(actionNotifyUri));
					}
					getContext().getContentResolver().notifyChange(actionNotifyUri, null);
				}
			}
		}
	}
	   
    @Override
    public String getType(Uri uri) {
        final int match = matchUri(uri);

		if(match == UriMatcher.NO_MATCH) {
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
		
		return mContentTypes[match];
    }
    
	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		final int match = matchUri(uri);
		
		if(match == UriMatcher.NO_MATCH) {
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
		
		ContentProviderActions actions = getActions(match);
		int affected = actions.delete(this, uri, selection, selectionArgs);
		
		if(mDebug) {
			MickeyLogger.logAction(Mickey.TAG, "Delete", actions, uri);
			MickeyLogger.d(Mickey.TAG, "Delete", "%s", selection);
		}
		
		if(affected > 0) {
			tryNotifyForActions(uri, actions);
		}
		
		return affected;
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {	

		final int match = matchUri(uri);

		if(match == UriMatcher.NO_MATCH) {
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
		
		ContentProviderActions actions = getActions(match);
		Uri newUri = actions.insert(this, uri, values);
		
		if(mDebug) {
			MickeyLogger.logAction(Mickey.TAG, "Insert", actions, uri);
			MickeyLogger.d(Mickey.TAG, "Insert", "%s", values);
		}
		
		if(newUri != null) {
			tryNotifyForActions(uri, actions);
		}
				
		return newUri;
	}
	
	@Override
    public int bulkInsert(Uri uri, ContentValues[] values) {    	
		final int match = matchUri(uri);

		if(match == UriMatcher.NO_MATCH) {
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
		
		ContentProviderActions actions = getActions(match);
		int affected = actions.bulkInsert(this, uri, values);
	
		if(mDebug) {
			MickeyLogger.logAction(Mickey.TAG, "Bulk Insert", actions, uri);
		}
		
		if(affected > 0) {
			tryNotifyForActions(uri, actions);
		}
				
		return affected;
    }

	@Override
	public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
		final int match = matchUri(uri);

		if(match == UriMatcher.NO_MATCH) {
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
		
		ContentProviderActions actions = getActions(match);
		Cursor cursor = actions.query(this, uri, projection, selection, selectionArgs, sortOrder);

		trySetNotificationUri(cursor, uri);
		
		if(mDebug) {
			if(projection != null && projection.length > 0 && projection[0].equals(Query.COUNT_TOKEN)) {
				MickeyLogger.logAction(Mickey.TAG, "Count", actions, uri);
				MickeyLogger.d(Mickey.TAG, "Count", "%s", selection);
			} else {
				MickeyLogger.logAction(Mickey.TAG, "Query", actions, uri);
				MickeyLogger.d(Mickey.TAG, "Query", "%s", selection);
			}
		}
		return cursor;
	}

	@Override
	public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
		final int match = matchUri(uri);

		if(match == UriMatcher.NO_MATCH) {
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
		
		ContentProviderActions actions = getActions(match);
		int affected = actions.update(this, uri, values, selection, selectionArgs);

		if(mDebug) {
			MickeyLogger.logAction(Mickey.TAG, "Update", actions, uri);
			MickeyLogger.d(Mickey.TAG, "Update", "sel: %s, values: %s", selection, values);
		}
		
		if(affected > 0) {
			tryNotifyForActions(uri, actions);
		}
		
		return affected;
	}

    public <T extends ActiveRecord> List<T> selectRecords(Uri uri, Query sQuery, String sortOrder) {
        final int match = matchUri(uri);

        if(match == UriMatcher.NO_MATCH) {
            throw new UnsupportedOperationException("Unknown uri: " + uri);
        }
        
        ContentProviderActions actions = getActions(match);
        
        if(mDebug) {
        	MickeyLogger.logAction(Mickey.TAG, "Select Records", actions, uri);
        	MickeyLogger.d(Mickey.TAG, "Select Records", "%s", sQuery.toString());
        }
        
        return actions.selectRecords(this, uri, sQuery, sortOrder);
    }
    
    public <T extends ActiveRecord> Map<String, T> selectRecordMap(Uri uri, Query sQuery, String keyColumnName) {
    	final int match = matchUri(uri);
    	
    	if(match == UriMatcher.NO_MATCH) {
    		throw new UnsupportedOperationException("Unknown uri: " + uri);
    	}
    	
    	ContentProviderActions actions = getActions(match);
    	
    	if(mDebug) {
    		MickeyLogger.logAction(Mickey.TAG, "Select Record Map", actions, uri);
    		MickeyLogger.d(Mickey.TAG, "Select Record Map", "%s", sQuery.toString());
    	}
    	
    	return actions.selectRecordMap(this, uri, sQuery, keyColumnName);
    }
    
    @Override
    public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> operations)
            throws OperationApplicationException {
        final SQLiteDatabase db = getOpenHelper().getWritableDatabase();
        db.beginTransaction();
        try {
            final int numOperations = operations.size();
            final ContentProviderResult[] results = new ContentProviderResult[numOperations];
            for (int i = 0; i < numOperations; i++) {
                results[i] = operations.get(i).apply(this, results, i);
            }
            db.setTransactionSuccessful();
            return results;
        } finally {
            db.endTransaction();
        }
    }
}
