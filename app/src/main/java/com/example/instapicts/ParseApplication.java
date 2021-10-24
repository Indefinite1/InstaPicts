package com.example.instapicts;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ZZJHQBMltagSTTbUnvTOq6tpvO9l8kAGBHXhFuTl")
                .clientKey("ZftQ8QhH4fghPr1Z2Pou77xuT7NPsb51nNLJqO9q")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
