package com.devyry.templatejavamvvm.ui.views.splash;


import com.devyry.templatejavamvvm.model.User;

import androidx.lifecycle.LiveData;

/**
 * Created by Yeray Rguez on 04/03/2019.
 */
public interface SplashViewModel {

    LiveData<User> getSession();

}
