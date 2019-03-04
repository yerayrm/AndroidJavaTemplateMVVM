package com.devyry.templatejavamvvm.data;

import com.devyry.templatejavamvvm.BuildConfig;
import com.devyry.templatejavamvvm.data.api.ApiGenerator;
import com.devyry.templatejavamvvm.data.api.ApiService;
import com.devyry.templatejavamvvm.model.User;
import com.devyry.templatejavamvvm.model.response.SessionResponse;

import org.jetbrains.annotations.NotNull;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
    public LiveData<User> getSession() {
        String bearerToken = "";

        final MutableLiveData<User> data = new MutableLiveData<>();

        apiService.getSessionInfo(bearerToken).enqueue(new Callback<SessionResponse>() {
            @Override
            public void onResponse(@NotNull Call<SessionResponse> call,
                                   @NotNull Response<SessionResponse> response) {
                User user = new User("Yeray", "domingo.rodriguez@iecisa.com");
                data.setValue(user);
            }

            @Override
            public void onFailure(@NotNull Call<SessionResponse> call, @NotNull Throwable t) {

            }
        });

        return data;
    }

}
