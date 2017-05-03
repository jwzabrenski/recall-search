package com.johnz.recallsearch.rest.fda;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import com.johnz.recallsearch.BuildConfig;
import com.johnz.recallsearch.models.fda.food.enforcement.FDAResponse;
import rx.Observable;

/**
 * Created by john on 4/26/17.
 */

public interface FDAFood {
    @GET("enforcement.json?")
    //Observable<List<FDAResponse>>
    Call<FDAResponse> getFDAFoodEnforcement(
            @Query("api_key")  String key,
            @Query("search") String searchTerm
    );
}
