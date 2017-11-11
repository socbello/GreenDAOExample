package com.sbello.greendaoexample;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by socbe on 11/4/2017.
 */

public class MyApp extends Application {
    DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "items-db");
        SQLiteDatabase database = devOpenHelper.getWritableDatabase();
        daoSession = new DaoMaster(database).newSession();

    }
 public DaoSession getDaoSession() {
     return daoSession;
 }
}
