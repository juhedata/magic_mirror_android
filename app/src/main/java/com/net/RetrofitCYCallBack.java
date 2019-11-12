/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.net;


import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;

/**
 * created  by  Alex
 * e-mail:15062859867@163.com
 */
public abstract class RetrofitCYCallBack implements Callback<ResponseBody> {

    @Override
    public void onResponse(Call<ResponseBody> call, retrofit2.Response<ResponseBody> response) {
        if (response.code() == 200) {
            try {
                String data = response.body().string();
               onSuccess(data);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                onError(new Throwable(response.errorBody().string()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    public void onFailure(Call<ResponseBody> call, Throwable t) {
        onError(t);
    }


    public abstract void onSuccess(String response);

    public abstract void onError(Throwable t);

}
