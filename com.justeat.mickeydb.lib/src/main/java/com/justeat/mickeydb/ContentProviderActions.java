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

import java.util.List;
import java.util.Map;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;

public class ContentProviderActions {
	public int delete(MickeyContentProvider provider, Uri uri, String selection, String[] selectionArgs){
		return -1;
	}
	
	public Uri insert(MickeyContentProvider provider, Uri uri, ContentValues values){
		return null;
	}
	
	public Cursor query(MickeyContentProvider provider, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder){
		return null;
	}
	
	public int update(MickeyContentProvider provider, Uri uri, ContentValues values, String selection, String[] selectionArgs){
		return -1;
	}
	
    public int bulkInsert(MickeyContentProvider provider, Uri uri, ContentValues[] values) {		
        int numValues = values.length;
        for (int i = 0; i < numValues; i++) {
            insert(provider, uri, values[i]);
        }
        return numValues;
    }
    
	public <T extends ActiveRecord> List<T> selectRecords(MickeyContentProvider provider, Uri uri, Query sQuery, String sortOrder) {
		return null;
	}
	
	public <T extends ActiveRecord> Map<String, T> selectRecordMap(MickeyContentProvider provider, Uri uri, Query sQuery, String keyColumnName) {
		return null;
	}
}
