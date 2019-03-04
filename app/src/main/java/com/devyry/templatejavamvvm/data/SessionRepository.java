package com.devyry.templatejavamvvm.data;

import com.devyry.templatejavamvvm.model.User;

import androidx.lifecycle.LiveData;

/**
 * Created by Yeray Rguez on 04/03/2019.
 */
public interface SessionRepository {

    void doLogin();

    void doLogout();

    void doSignup();

    void doRefresh();

    void doRememberPassword();

    void getUser();

    void updateUser();

    LiveData<User> getSession();

}
