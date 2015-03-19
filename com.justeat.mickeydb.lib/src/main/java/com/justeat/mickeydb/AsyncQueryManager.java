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

import java.lang.ref.WeakReference;

import android.content.AsyncQueryHandler;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class AsyncQueryManager extends AsyncQueryHandler {

	int mTokens = 0;
	
	protected synchronized int createToken() {
		mTokens++;
		return mTokens;
	}
	
    public AsyncQueryManager() {
        super(Mickey.getContentResolver());
    }
    
    public AsyncQueryManager(Context context) {
        super(context.getContentResolver());
    }
    
    public AsyncQuery query(AsyncQueryCallback callback, Uri uri,
    		String[] projection, String selection, String[] selectionArgs,
    		String orderBy) {
    	
    	AsyncQuery query = new AsyncQuery(this, createToken(), callback);
    	
    	WeakReference<AsyncQuery> queryRef = new WeakReference<AsyncQuery>(query);

    	startQuery(query.token, queryRef, uri, projection, selection, selectionArgs, orderBy);
    	
    	return query;
    }

    @Override
    protected void onQueryComplete(int token, Object cookie, Cursor cursor) {
        super.onQueryComplete(token, cookie, cursor);

        WeakReference<?> queryRef = (WeakReference<?>) cookie;
        AsyncQuery query = (AsyncQuery) queryRef.get();
        
        if(query != null) {
        	query.completeQuery(cursor);
        }
    }
}