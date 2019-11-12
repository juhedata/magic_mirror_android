/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.manager;

import com.google.gson.Gson;
import com.net.RetrofitManager;

import java.util.Map;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * Created by maqing on 2017/8/11.
 * Email:2856992713@qq.com
 * RequestManager
 */
public class RequestManager {
    public static RetrofitManager mRetrofitManager;

    //public static final String mBaseUrl = "http://47.106.166.255:9080/";
    public static final String mBaseUrl = "http://10.0.49.26/api/";
    public static final String mYouLocalUrl = "http://10.5.21.95:8081/";
    public static final String mGangLocalUrl = "http://10.5.63.249:1010/";
    // public static final String mInterfacePrefix = "fwms/";

    public static final String mInterfacePrefix = "70/";
//
    public static RequestBody encryptParams(Map<String, Object> map) {

        final RequestBody requestBody = RequestBody.create(MediaType.parse("Content-Type, application/json"),
                new Gson().toJson(map));
        return requestBody;
    }


}
