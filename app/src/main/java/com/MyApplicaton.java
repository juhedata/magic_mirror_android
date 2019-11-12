package com;

import android.app.Application;

import com.manager.RequestManager;
import com.net.RetrofitManager;

public class MyApplicaton extends Application {

    @Override
    public void onCreate() {

        super.onCreate();
        initRetrofit();
        LogcatHelper.getInstance(this).start();
    }

    /**
     * 初始Retrofit
     */
    private void initRetrofit() {
        RequestManager.mRetrofitManager = new RetrofitManager.Builder()
                .baseUrl(RequestManager.mBaseUrl)
                .connectTimeout(20 * 1000)
                .readTimeout(20 * 1000)
                .writeTimeout(20 * 1000)
                .build();
    }
}
