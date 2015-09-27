package com.justeat.mickeydb;

import android.content.ContentValues;
import android.net.Uri;

public abstract class ChangeNotifier {
	public abstract void notifyChange(Uri uri, ContentValues values);
}
