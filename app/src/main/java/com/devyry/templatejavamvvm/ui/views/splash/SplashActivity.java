package com.devyry.templatejavamvvm.ui.views.splash;

import android.os.Bundle;

import com.devyry.templatejavamvvm.R;
import com.devyry.templatejavamvvm.ui.base.BaseActivity;

import androidx.lifecycle.ViewModelProviders;

/**
 * Created by Yeray Rguez on 01/03/2019.
 */
public class SplashActivity extends BaseActivity {

    private SplashViewModel splashViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashViewModel = ViewModelProviders.of(this).get(SplashViewModelImpl.class);
        splashViewModel.getSession();
    }

}
