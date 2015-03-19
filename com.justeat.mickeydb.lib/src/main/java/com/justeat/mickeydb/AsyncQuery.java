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

import android.database.Cursor;

public class AsyncQuery {
	final AsyncQueryCallback callback;
	final int token;
	private AsyncQueryManager manager;
	private boolean mComplete;
	private Cursor mResult;
	
	public AsyncQuery(AsyncQueryManager manager, int token, AsyncQueryCallback callback) {
		this.token = token;
		this.callback = callback;
		this.manager = manager;
	}
	
	public void cancel() {
		manager.cancelOperation(token);
	}
	
	public boolean isComplete() {
		return mComplete;
	}
	
	public Cursor getResult() {
		return mResult;
	}
	
	void completeQuery(Cursor cursor) {
		mComplete = true;
		mResult = cursor;
		callback.onQueryComplete(cursor);
	}
}