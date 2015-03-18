package com.example.mickeydbexample;

import com.example.mickeydbexample.data.TakeawaysDBContract.Restaurants;

import android.app.Application;
import static com.justeat.mickeydb.Mickey.*;

public class ExampleApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		
		initMickey(this);
		
		query().select(Restaurants.CONTENT_URI);
		
	}
}
