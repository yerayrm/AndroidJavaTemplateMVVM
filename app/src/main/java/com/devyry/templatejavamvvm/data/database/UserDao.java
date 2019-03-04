package com.devyry.templatejavamvvm.data.database;

import com.devyry.templatejavamvvm.model.User;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import static androidx.room.OnConflictStrategy.REPLACE;

/**
 * Created by Yeray Rguez on 04/03/2019.
 */
@Dao
public interface UserDao {

    @Insert(onConflict = REPLACE)
    void save(User user);

    @Query("SELECT * FROM user WHERE id = :userId")
    LiveData<User> load(int userId);

}
