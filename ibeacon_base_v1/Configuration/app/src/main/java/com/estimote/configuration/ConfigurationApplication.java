package com.estimote.configuration;

import android.app.Application;
import android.util.Log;

import com.estimote.sdk.EstimoteSDK;

public class ConfigurationApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        EstimoteSDK.initialize(getApplicationContext(), "ytriago26-gmail-com-s-conf-ljo", "b5d90994ea55bd24ddf1f0a94c8e91c1");
        EstimoteSDK.enableDebugLogging(false);
    }
}
