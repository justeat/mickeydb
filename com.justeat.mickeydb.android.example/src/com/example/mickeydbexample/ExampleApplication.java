package com.example.mickeydbexample;

import android.app.Application;

import com.justeat.mickeydb.Mickey;

public class ExampleApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		
		Mickey.init(this);
		
	}
}
