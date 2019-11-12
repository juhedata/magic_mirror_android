/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.net;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by maqing on 2017/8/10.
 * Email:2856992713@qq.com
 * 自定义Retrofit请求回调
 */
public abstract class RetrofitCallBack implements Callback<String> {

    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        if (response.code() == 200) {
            String data = response.body();
            onSuccess(data);

        } else {
            try {
                onError(new Throwable(response.errorBody().string()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        onError(t);
    }

    public abstract void onSuccess(String response);

    public abstract void onError(Throwable t);

}
