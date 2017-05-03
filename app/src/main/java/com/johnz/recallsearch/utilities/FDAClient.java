package com.johnz.recallsearch.utilities;

import android.util.Log;

import com.johnz.recallsearch.BuildConfig;
import com.johnz.recallsearch.models.fda.food.enforcement.FDAResponse;
import com.johnz.recallsearch.models.fda.food.enforcement.Result;
import com.johnz.recallsearch.models.fda.food.enforcement.Results;
import com.johnz.recallsearch.rest.fda.FDAFood;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by john on 4/25/17.
 */

public class FDAClient {
    private static Retrofit retrofit;
    private static FDAClient instance = null;
    private static final String BASE_URL = "https://api.fda.gov/food/";
    private static final String API_KEY = BuildConfig.FDA_API_KEY;


    public FDAClient() {
        if (retrofit == null) {
            buildRetrofit();
        }

        Log.i("TAG", "FDAClient: " + API_KEY);
    }


    public static FDAClient getInstanceOf() {
        if (instance == null) {
            instance = new FDAClient();
        }
        return instance;
    }

    //add call adapter factory later
    private void buildRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public void testRetrofit(){
        FDAFood apiService = retrofit.create(FDAFood.class);
        Call<FDAResponse> call = apiService.getFDAFoodEnforcement(API_KEY, "product_description:spinach");

        call.enqueue(new Callback<FDAResponse>() {

            @Override
            public void onResponse(Call<FDAResponse> call, Response<FDAResponse> response) {

                FDAResponse enforcements = response.body();
                List<Result> results = enforcements.getResults();
                String reason = results.get(0).getReasonForRecall();
                Log.i("fda_test", results.toString());

            }

            @Override
            public void onFailure(Call<FDAResponse> call, Throwable t) {

                // Log error here since request failed
                Log.i("fda_test", "failure");
                //Log.i("cause:", t.getCause().toString());
                String message = t.getMessage();
                Log.d("message ", message);
            }

        });

    }

}
