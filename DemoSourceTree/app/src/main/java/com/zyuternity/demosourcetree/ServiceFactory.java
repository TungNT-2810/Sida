package com.zyuternity.demosourcetree;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ZYuTernity on 7/21/2016.
 */
public class ServiceFactory {
    private Retrofit retrofit;

    private static ServiceFactory instance = new ServiceFactory();

    public static ServiceFactory getInstance(){
        return instance;
    }

    private ServiceFactory() {
        OkHttpClient httpClient = new OkHttpClient.Builder().build();

        retrofit = new Retrofit.Builder()
                .baseUrl("http://api.30shine.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public <ServiceClass> ServiceClass createService(Class<ServiceClass> serviceClass){
        return retrofit.create(serviceClass);
    }


}
