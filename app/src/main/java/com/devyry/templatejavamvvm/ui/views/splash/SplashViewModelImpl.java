package com.devyry.templatejavamvvm.ui.views.splash;

import android.app.Application;

import com.devyry.templatejavamvvm.model.User;
import com.devyry.templatejavamvvm.ui.base.BaseViewModel;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import timber.log.Timber;

/**
 * Created by Yeray Rguez on 04/03/2019.
 */
public class SplashViewModelImpl extends BaseViewModel implements SplashViewModel {

    private LiveData<User> user;

    public SplashViewModelImpl(@NonNull Application application) {
        super(application);
    }

    @Override
    public void getSession() {
        Timber.i("Get session call");
    }

}
