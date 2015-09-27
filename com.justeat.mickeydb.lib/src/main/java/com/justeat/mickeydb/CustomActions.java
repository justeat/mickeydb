
/*
 * Generated by Mickey DB
 */
package com.justeat.mickeydb;

import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;

import com.justeat.mickeydb.ContentProviderActions;
import com.justeat.mickeydb.MickeyContentProvider;
import com.justeat.mickeydb.Query;
import com.justeat.mickeydb.util.Closeables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class CustomActions extends ContentProviderActions {
	@Override
	public int delete(MickeyContentProvider provider, Uri uri, String selection, String[] selectionArgs){
		final SQLiteDatabase db = provider.getOpenHelper().getWritableDatabase();
							
		Query query = new Query(provider.getContext(), null);
		
		addQueryExpressionsFromUriSegmentParams(uri, query);

		query.append(selection, selectionArgs);
		
		int affected = query.delete(db, getSourceName());
		
		return affected;
	}
	
	@Override
	public int update(MickeyContentProvider provider, Uri uri, ContentValues values, String selection, String[] selectionArgs){
		final SQLiteDatabase db = provider.getOpenHelper().getWritableDatabase();
							
		Query query = new Query(provider.getContext(), null);
		
		addQueryExpressionsFromUriSegmentParams(uri, query);
		addContentValuesFromUri(provider, uri, values);

		query.append(selection, selectionArgs);
		int affected = query.update(db, getSourceName(), values);
		
		return affected;
	}
	
	@Override
	public Uri insert(MickeyContentProvider provider, Uri uri, ContentValues values) {
		final SQLiteDatabase db = provider.getOpenHelper().getWritableDatabase();

		addContentValuesFromUri(provider, uri, values);
		
		long id = db.insertOrThrow(getSourceName(), null, values);
		
		if(id > -1) {
			return ContentUris.withAppendedId(uri, id);
		}
		
		return null;
	}
	
	@Override
	public Cursor query(MickeyContentProvider provider, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder){		
		Query query = new Query(provider.getContext(), null);
		addQueryExpressionsFromUriSegmentParams(uri, query);
		query.append(selection, selectionArgs);
		Cursor result = executeQuery(provider, uri, projection, query, sortOrder);
		return result;
	}
	
	private Cursor executeQuery(MickeyContentProvider provider, Uri uri, String[] projection, Query query, String sortOrder) {
		final SQLiteDatabase db = provider.getOpenHelper().getWritableDatabase();
		String groupBy = uri.getQueryParameter(MickeyContentProvider.PARAM_GROUP_BY);
		String limit = uri.getQueryParameter(MickeyContentProvider.PARAM_LIMIT);
		String offset = uri.getQueryParameter(MickeyContentProvider.PARAM_OFFSET);
		String sortAndLimitClause = buildSortAndClause(sortOrder, limit, offset);		
		return db.query(getSourceName(), projection, query.toString(), query.getArgsArray(),  TextUtils.isEmpty(groupBy) ? null : groupBy, null, sortAndLimitClause);
	}

	private String buildSortAndClause(String sortOrder, String limit, String offset) {
		
		String limitClause = null;
		
		if(!TextUtils.isEmpty(limit)) {
			limitClause = " LIMIT " + limit;
		}
			
		if(!TextUtils.isEmpty(offset)) {
			limitClause = limitClause + " OFFSET " + offset;
		}
		
		if(limitClause != null) {
			return (sortOrder == null ? " 1" + limitClause : sortOrder + limitClause);
		} else {
			return sortOrder;
		}
	}

	@Override
	public int bulkInsert(MickeyContentProvider provider, Uri uri, ContentValues[] values) {
	
		final SQLiteDatabase db = provider.getOpenHelper().getWritableDatabase();
		
		int numValues = values.length;
	
		try {
		
	    	db.beginTransaction();
	    	
	        for (int i = 0; i < numValues; i++) {
	        	db.insertOrThrow(getSourceName(), null, values[i]);
	        }
			
			db.setTransactionSuccessful();
	
			
		} finally {
			db.endTransaction();
		}
		
		return numValues;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T extends ActiveRecord> List<T> selectRecords(MickeyContentProvider provider, Uri uri, Query sQuery, String sortOrder) {
		final ActiveRecordFactory<?> recordFactory = getActiveRecordFactory();
		
		addQueryExpressionsFromUriSegmentParams(uri, sQuery);
		
		Cursor c = null;
		
		ArrayList<T> items = new ArrayList<T>();
		
		try {
			c = executeQuery(provider, uri, recordFactory.getProjection(), sQuery, sortOrder);
			if(c.getCount() > 0) {
			    while(c.moveToNext()) {
			        items.add((T)recordFactory.create(c));
		        }
			}
	    } finally {
	        Closeables.closeSilently(c);
	    }
	    
	    return items;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T extends ActiveRecord> Map<String, T> selectRecordMap(
			MickeyContentProvider provider, Uri uri, Query sQuery,
			String keyColumnName) {
		final ActiveRecordFactory<?> recordFactory = getActiveRecordFactory();
		
		addQueryExpressionsFromUriSegmentParams(uri, sQuery);
		
		Cursor c = null;
		
		HashMap<String, T> items = new HashMap<String, T>();
		
		try {
			c = executeQuery(provider, uri, recordFactory.getProjection(), sQuery, null);
		    int keyColumnIndex = c.getColumnIndexOrThrow(keyColumnName);
		    
		    if(c.getCount() > 0) {
			    while(c.moveToNext()) {
			        items.put(c.getString(keyColumnIndex), (T)recordFactory.create(c));
		        }
		    }
	    } finally {
	        Closeables.closeSilently(c);
	    }
	    
	    return items;
	}
		
	public void addContentValuesFromUri(MickeyContentProvider provider, Uri uir, ContentValues values) {
		
	}
	public void addQueryExpressionsFromUriSegmentParams(Uri uri, Query query) {
		
	}
	public abstract String getSourceName();
	public abstract ActiveRecordFactory<?> getActiveRecordFactory();
}
