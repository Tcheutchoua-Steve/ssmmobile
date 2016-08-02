package com.android.ssm.ssm;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

/**
 * Created by Larry Akah on 8/2/16.
 */
public class SsmApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
        // Initialize the SDK before executing any other operations,
        // especially, if you're using Facebook UI elements.
    }
}
