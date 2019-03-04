package com.devyry.templatejavamvvm.data;

import android.text.TextUtils;

import com.devyry.templatejavamvvm.BuildConfig;
import com.devyry.templatejavamvvm.data.api.ApiGenerator;
import com.devyry.templatejavamvvm.data.api.ApiService;
import com.devyry.templatejavamvvm.model.response.SessionResponse;
import com.devyry.templatejavamvvm.utils.Constants;

import org.jetbrains.annotations.NotNull;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

import static com.devyry.templatejavamvvm.utils.Constants.GeneralResponseCode.CODE_ERROR;
import static com.devyry.templatejavamvvm.utils.Constants.GeneralResponseCode.CODE_SUCCESS;

/**
 * Created by Yeray Rguez on 04/03/2019.
 */
public class SessionRepositoryImpl implements SessionRepository {

    private ApiService apiService;

    public SessionRepositoryImpl() {
        this.apiService = ApiGenerator.createService(BuildConfig.BASE_URL);
    }

    @Override
    public void doLogin() {

    }

    @Override
    public void doLogout() {

    }

    @Override
    public void doSignup() {

    }

    @Override
    public void doRefresh() {

    }

    @Override
    public void doRememberPassword() {

    }

    @Override
    public void getUser() {

    }

    @Override
    public void updateUser() {

    }

    @Override
    public LiveData<String> getSession() {
        final String bearerToken = ""; //TODO Get bearer token from preferences
        final MutableLiveData<String> data = new MutableLiveData<>();

        this.apiService.getSessionInfo(bearerToken).enqueue(new Callback<SessionResponse>() {
            @Override
            public void onResponse(@NotNull Call<SessionResponse> call,
                                   @NotNull Response<SessionResponse> response)
            {
                if (response.body() != null && TextUtils.equals(response.body().getCode(), CODE_SUCCESS))
                {
                    //TODO Save data in database
                    data.setValue(CODE_SUCCESS);
                }
                else
                {
                    data.setValue(CODE_ERROR);
                }
            }
            @Override
            public void onFailure(@NotNull Call<SessionResponse> call, @NotNull Throwable throwable)
            {
                Timber.e(throwable);
                data.setValue(CODE_ERROR);
            }
        });

        return data;
    }

}
