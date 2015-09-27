package com.justeat.mickeydb;

import android.net.Uri;
import android.util.Log;

public class MickeyLogger {

	private final boolean mEnabled;

	public MickeyLogger(boolean enabled) {
		mEnabled = enabled;
	}
	
	public void d(String tag, String state, String format, Object... args) {
		if(mEnabled) {
			Log.d(tag, String.format("[%s] %s", state, String.format(format, args)));
		}
	}

	public void logAction(String tag, String state, ContentProviderActions actions, Uri uri) {
		if(mEnabled) {
			d(tag, state, "%s (%s)", uri, actions.getClass().getSimpleName());
		}
	}
}
