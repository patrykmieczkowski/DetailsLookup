package com.mieczkowskidev.detailslookup.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Patryk Mieczkowski on 26.03.2018
 */

@Database(entities = {Product.class}, version = 1)
public abstract class MyDatabase extends RoomDatabase {

    public abstract ProductDao productDao();
}
