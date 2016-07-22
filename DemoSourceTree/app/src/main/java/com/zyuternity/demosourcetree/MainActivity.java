package com.zyuternity.demosourcetree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();
        getFucked();
    }

    private void getFucked(){
        GetCustomerHistoryService getCustomerHistoryService = ServiceFactory.getInstance().createService(GetCustomerHistoryService.class);
        Call<JSONCustomerHistoryList> call = getCustomerHistoryService.callJsonCustomerHistoryList(100);
        call.enqueue(new Callback<JSONCustomerHistoryList>() {
            @Override
            public void onResponse(Call<JSONCustomerHistoryList> call, Response<JSONCustomerHistoryList> response) {
                JSONCustomerHistoryList jsonCustomerHistoryList = response.body();
                Log.d("FUCK", response.code()+"");
            }

            @Override
            public void onFailure(Call<JSONCustomerHistoryList> call, Throwable t) {
                Log.d("FUCK", t.toString());
            }
        });
    }

}