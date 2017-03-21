package com.justeat.mickeydb;

import android.net.Uri;

public class MickeyUriBuilder {
	
	private Uri.Builder mUriBuilder;

	public MickeyUriBuilder() {
		this(new Uri.Builder());
	}
	
	public MickeyUriBuilder(Uri.Builder builder) {
		mUriBuilder = builder;
	}
	
	public Uri.Builder getUriBuilder() {
		return mUriBuilder;
	}
	
	public MickeyUriBuilder limit(int limit) {
		mUriBuilder.appendQueryParameter(MickeyContentProvider.PARAM_LIMIT, String.valueOf(limit));
		return this;
	}
	
	public MickeyUriBuilder offset(int limit) {
		mUriBuilder.appendQueryParameter(MickeyContentProvider.PARAM_OFFSET, String.valueOf(limit));
		return this;
	}
	
	public MickeyUriBuilder notify(boolean notify) {
		mUriBuilder.appendQueryParameter(MickeyContentProvider.PARAM_NOTIFY, String.valueOf(notify));
		return this;
	}
	
	public MickeyUriBuilder groupBy(String groupBy) {
		mUriBuilder.appendQueryParameter(MickeyContentProvider.PARAM_GROUP_BY, String.valueOf(groupBy));
		return this;
	}
	
	public Uri build() {
		return mUriBuilder.build();
	}
}
