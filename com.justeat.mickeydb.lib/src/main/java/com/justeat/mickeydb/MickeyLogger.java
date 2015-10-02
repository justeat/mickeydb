package com.justeat.mickeydb;

import android.net.Uri;
import android.util.Log;

public class MickeyLogger {	
	public static void d(String tag, String state, String format, Object... args) {
		Log.d(tag, String.format("[%s] %s", state, String.format(format, args)));
	}

	public static void logAction(String tag, String state, ContentProviderActions actions, Uri uri) {
		String shortUriString = uri.getPath() + (uri.getQuery() == null ? "" : "?" + uri.getQuery());
		d(tag, state, "%s > %s", shortUriString, actions.getClass().getSimpleName());
	}
}
