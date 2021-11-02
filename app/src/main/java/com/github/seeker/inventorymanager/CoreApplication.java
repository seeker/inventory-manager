package com.github.seeker.inventorymanager;

import android.app.Application;

import dagger.hilt.android.HiltAndroidApp;

@HiltAndroidApp
public class CoreApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
