package com.mieczkowskidev.detailslookup;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.mieczkowskidev.detailslookup.room.MyDatabase;

/**
 * Created by Patryk Mieczkowski on 26.03.2018
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        createRoomDb();
    }

    private void createRoomDb() {
        Room.databaseBuilder(getApplicationContext(), MyDatabase.class, "my_database").build();
    }
}
