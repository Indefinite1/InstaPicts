package com.example.instapicts;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ZZJHQBMltagSTTbUnvTOq6tpvO9l8kAGBHXhFuTl")
                .clientKey("ZftQ8QhH4fghPr1Z2Pou77xuT7NPsb51nNLJqO9q")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
