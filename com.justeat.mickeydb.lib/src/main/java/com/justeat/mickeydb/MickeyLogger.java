package com.justeat.mickeydb;

import android.net.Uri;
import android.util.Log;

public class MickeyLogger {	
	public static void d(String tag, String state, String format, Object... args) {
		Log.d(tag, String.format("[%s] %s", state, String.format(format, args)));
	}

	public static void logAction(String tag, String state, ContentProviderActions actions, Uri uri) {
		d(tag, state, "%s (%s)", uri, actions.getClass().getSimpleName());
	}
}
