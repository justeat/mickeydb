package com.justeat.mickeydb;

import android.net.Uri;

public class Test {
	public class CustomUriBuilder extends MickeyUriBuilder {
		public <T extends CustomUriBuilder> T setCustom(int qux) {
			getUriBuilder().appendQueryParameter("qux", String.valueOf(qux));
			return (T) this;
		}
	}
	
	public void qux() {
		Uri uri = new CustomUriBuilder()
			.setCustom(123)
			.groupBy("qux")
			.notify(true)
			.build();
	}
}
