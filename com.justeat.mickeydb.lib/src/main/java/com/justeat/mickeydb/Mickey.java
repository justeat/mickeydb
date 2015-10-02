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

import com.justeat.mickeydb.util.Uris;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;

public class Mickey {
	
	static final String TAG = Mickey.class.getSimpleName();
	
	private static Mickey sInstance;

	private Context mApplicationContext;
	private AsyncQueryManager mAsyncManager;

	private boolean mDebug;
		
	public static Mickey get() {
		if(sInstance == null) {
			throw new MickeyNotInitializedException();
		}
		return sInstance;
	}
	
	private Mickey(Context context){
		this(context, false);
	}
	
	private Mickey(Context context, boolean debug){
		mApplicationContext = context.getApplicationContext();
		mAsyncManager = new AsyncQueryManager(mApplicationContext);
		mDebug = debug;
	}
	
	/**
	 * <p>Initialize Mickey, this should be the very first thing called in onCreate of an
	 * Android application implementation.</p>
	 * 
	 * @param context
	 */
	public static void initMickey(Context context) {
		if(sInstance == null) {
			sInstance = new Mickey(context);
		}
	}

	/**
	 * <p>Initialize Mickey with debug logging, this should be the very first thing called in onCreate of an
	 * Android application implementation.</p>
	 * 
	 * @param context
	 */
	public static void initMickey(Context context, boolean debug) {
		if(sInstance == null) {
			sInstance = new Mickey(context, debug);
		}
	}
	
	protected Query _query() {
		return new Query(mApplicationContext, mAsyncManager);
	}
	
	public static Query query() {
		return get()._query();
	}

	protected Context _getApplicationContext() {
		return mApplicationContext;
	}
	
	public static Context getApplicationContext() {
		return get()._getApplicationContext();
	}

	protected ContentResolver _getContentResolver() {
		return mApplicationContext.getContentResolver();
	}
	
	public static ContentResolver getContentResolver() {
		return get()._getContentResolver();
	}
	
	protected AsyncQueryManager _getAsyncQueryManager() {
		return mAsyncManager;
	}
	
	public static AsyncQueryManager getAsyncQueryManager() {
		return get()._getAsyncQueryManager();
	}
		
	protected void _notifyContentChange(Uri uri, ContentObserver observer) {
		if(mDebug) {
			MickeyLogger.d(TAG, "Notify(User)", "%s", Uris.getPathAndQueryAsString(uri));
			get()._getContentResolver().notifyChange(uri, observer);
		}
	}
	
	public static void notifyContentChange(Uri uri, ContentObserver observer) {
		get()._notifyContentChange(uri, observer);
	}

	public static void notifyContentChange(Uri uri) {
		get()._notifyContentChange(uri, null);
	}
}
