package com.example.subsexchangeyoutube;

import android.app.Application;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;

public class DatabaseInfo  extends Application {

    public static final String APPLICATION_ID = "5DD31900-CB40-5FA2-FF88-C8BC5BBEC800";
    public static final String API_KEY = "EFE92D7D-708F-4203-9E4F-8B7897153CBE";
    public static final String SERVER_URL = "https://api.backendless.com";
    public static BackendlessUser user;


    @Override
    public void onCreate() {
        super.onCreate();
        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );
    }
}
