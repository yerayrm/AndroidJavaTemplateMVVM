package com.devyry.templatejavamvvm.data.api;

import com.devyry.templatejavamvvm.BuildConfig;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Yeray Rguez on 04/03/2019.
 */
public class ApiGenerator {

    private static final long TIMEOUT = 30;


    public static ApiService createService(String url) {
        // Logging level
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        if (BuildConfig.DEBUG) {
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        } else {
            logging.setLevel(HttpLoggingInterceptor.Level.NONE);
        }

        // Create OkHttpClient with timeout
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(TIMEOUT, TimeUnit.SECONDS);

        // Set log interceptor
        httpClient.addInterceptor(logging);

        // Build OkHttpClient instance
        OkHttpClient client = httpClient.build();

        // Build retrofit instance
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create()) //Extract this
                //.addCallAdapterFactory(RxJava2CallAdapterFactory.create()) //Extract this
                .client(client);
        Retrofit retrofit = builder.build();

        return retrofit.create(ApiService.class);
    }


}
