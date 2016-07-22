package com.zyuternity.demosourcetree;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

/**
 * Created by ZYuTernity on 7/22/2016.
 */
public interface GetCustomerHistoryService {
    @POST("/service/primary")
    @Headers({"Content-Type: application/json;charset=UTF-8"})
    Call<JSONCustomerHistoryList> callJsonCustomerHistoryList(@Body Id id);
}
