package com.justeat.example;

import android.app.Application;

import com.justeat.mickeydb.Mickey;

public class ExampleApplication extends Application {

    @Override
    public void onCreate() {
        Mickey.initMickey(this);
    }
}
