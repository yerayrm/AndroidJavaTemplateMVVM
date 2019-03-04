package com.devyry.templatejavamvvm.data.database;

import com.devyry.templatejavamvvm.model.User;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/**
 * Created by Yeray Rguez on 04/03/2019.
 */
@Database(entities = {User.class}, version = 1)
public abstract class UserDatabase extends RoomDatabase {

    public abstract UserDao userDao();

}
