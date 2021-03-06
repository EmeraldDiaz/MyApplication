package com.example.acer.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.net.URL;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Acer on 12/19/2017.
 */

public class BaseActivity extends AppCompatActivity {

    private APIService api;
    private static final String URL = "http://192.168.43.15/android-backend-pelatihan/web/index.php/";

    @Override
    protected void onCreate(@Nullable Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);


        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder client = new  OkHttpClient.Builder();
        client.addInterceptor(interceptor);

        Retrofit base = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client.build())
                .build();
        api = base.create(APIService.class);

    }

    public APIService getApi() {
        return api;
    }
}