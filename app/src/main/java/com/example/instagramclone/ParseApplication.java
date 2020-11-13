package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("xHlxlpSJ1XMlCwRSZ4MxS54k2d6QPGTCPioXW96Y")
                .clientKey("SmQMhNSa7E4TZixdmqKOpU8nIswz6m1xyjQrB3Nj")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
