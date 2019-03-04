package com.devyry.templatejavamvvm.ui.views.splash;

import android.os.Bundle;

import com.devyry.templatejavamvvm.R;
import com.devyry.templatejavamvvm.ui.base.BaseActivity;
import com.devyry.templatejavamvvm.utils.Constants;

import androidx.lifecycle.ViewModelProviders;
import timber.log.Timber;

/**
 * Created by Yeray Rguez on 01/03/2019.
 */
public class SplashActivity extends BaseActivity {

    private SplashViewModel splashViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        this.initView();
    }

    private void initView() {
        splashViewModel = ViewModelProviders.of(this).get(SplashViewModelImpl.class);
        splashViewModel.getSession().observe(this, action -> {
            switch (action) {
                case Constants.GeneralResponseCode.CODE_SUCCESS:
                    Timber.i("Session success");
                    break;
                case Constants.GeneralResponseCode.CODE_ERROR:
                    Timber.i("Session error");
                    break;
            }
        });
    }

}
