/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.net;


import java.util.Map;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Alex on 2018/11/8.
 * 邮箱：15062859867@163.com
 */
public interface RetrofitRequestInterface {


    @POST( "analyze/monitor")
    @Headers("Content-type:application/json;charset=UTF-8")
   Call<ResponseBody> monitor(@Body RequestBody body);

    @FormUrlEncoded
    @POST("analyze/monitor")
    Call<String> monitor(@FieldMap Map<String, String> params);
}
