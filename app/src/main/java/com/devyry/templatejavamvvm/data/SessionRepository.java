package com.devyry.templatejavamvvm.data;

/**
 * Created by Yeray Rguez on 04/03/2019.
 */
public interface SessionRepository {

    void doLogin();

    void doLogout();

    void doSignup();

    void doRefresh();

    void getUser();

    void updateUser();

    void getSession();

}
