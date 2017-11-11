package com.sbello.greendaoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApp myApp = (MyApp) getApplication();
        DaoSession daoSession = myApp.getDaoSession();

        ItemDao itemDao = daoSession.getItemDao();

        Item item = new Item();
        item.setId(null);
        item.setLabel("Some label");
        item.setDescription("Some desc");
        item.setPriority(10);

        long insert = itemDao.insert(item);
        Log.d("MainActivity","INSERT: " +insert);

        List<Item> items = itemDao.loadAll();
        Log.d("MainActivity", "ITEMS: " + items);

        List<Item> list = itemDao.queryBuilder().where(ItemDao.Properties.Id.eq(2)).build().list();
        Log.d("MainActivity", "LIST ITEMS: " + list);

        Item item2 = itemDao.queryBuilder().where(ItemDao.Properties.Id.eq(2)).build().unique();
        Log.d("MainActivity", "ITEMS 2 : " + item2);


    }
}
