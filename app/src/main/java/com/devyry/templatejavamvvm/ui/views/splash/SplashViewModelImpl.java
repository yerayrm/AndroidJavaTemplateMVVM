package com.devyry.templatejavamvvm.ui.views.splash;

import android.app.Application;

import com.devyry.templatejavamvvm.data.SessionRepository;
import com.devyry.templatejavamvvm.data.SessionRepositoryImpl;
import com.devyry.templatejavamvvm.model.User;
import com.devyry.templatejavamvvm.ui.base.BaseViewModel;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import timber.log.Timber;

/**
 * Created by Yeray Rguez on 04/03/2019.
 */
public class SplashViewModelImpl extends BaseViewModel implements SplashViewModel {

    private SessionRepository sessionRepository;
    private LiveData<User> user;


    public SplashViewModelImpl(@NonNull Application application) {
        super(application);
        this.sessionRepository = new SessionRepositoryImpl();
    }

    @Override
    public void init() {
        if (this.user != null) {
            return;
        }
        user = sessionRepository.getSession();
    }

    @Override
    public LiveData<User> getSession() {
        Timber.i("Get session call");
        return user;
    }

}
