package com.himanshumauri.nallebache;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class OfflineCapability extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
