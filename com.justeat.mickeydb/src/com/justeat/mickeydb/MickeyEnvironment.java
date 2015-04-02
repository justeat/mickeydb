package com.justeat.mickeydb;

import com.google.inject.Singleton;

@Singleton
public class MickeyEnvironment {

	private boolean mStandalone;

	public boolean isStandalone() {
		return mStandalone;
	}
	
	public void setStandalone(boolean standalone) {
		this.mStandalone = standalone;
	}

}
