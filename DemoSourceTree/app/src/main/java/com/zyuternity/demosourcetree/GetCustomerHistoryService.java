package com.zyuternity.demosourcetree;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by ZYuTernity on 7/22/2016.
 */
public interface GetCustomerHistoryService {
    @FormUrlEncoded
    @POST("/service/primary")
    @Headers({"Content-Type: application/json;charset=UTF-8"})
    Call<JSONCustomerHistoryList> callJsonCustomerHistoryList(@Field("Id") int id);
}
