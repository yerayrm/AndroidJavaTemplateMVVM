package com.devyry.templatejavamvvm.ui.views.splash;

import android.app.Application;

import com.devyry.templatejavamvvm.data.SessionRepository;
import com.devyry.templatejavamvvm.data.SessionRepositoryImpl;
import com.devyry.templatejavamvvm.ui.base.BaseViewModel;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;

/**
 * Created by Yeray Rguez on 04/03/2019.
 */
public class SplashViewModelImpl extends BaseViewModel implements SplashViewModel {

    private SessionRepository sessionRepository;


    public SplashViewModelImpl(@NonNull Application application) {
        super(application);
        this.sessionRepository = new SessionRepositoryImpl();
    }

    @Override
    public LiveData<String> getSession() {
        return sessionRepository.getSession();
    }

}
