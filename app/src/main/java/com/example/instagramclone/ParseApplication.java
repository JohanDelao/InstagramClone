package com.example.instagramclone;

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
                .applicationId("VE1svDXSQzl2vfst0ASuzBF0ddX4zfXT3U9kKPpi")
                .clientKey("Oh3B5aVuVIqQQRO55e97GK1v2i6iAc91uCRPrWDN")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
