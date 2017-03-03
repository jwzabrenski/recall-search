package com.johnz.recallsearch.rest;

import com.johnz.recallsearch.models.RecallResponse;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by John on 9/24/2016.
 */
public interface CPSCProductName {
    @GET("Recall?format=json")
    Observable<List<RecallResponse>> getCPSCProductName(@Query("ProductName") String searchTerm);
}
