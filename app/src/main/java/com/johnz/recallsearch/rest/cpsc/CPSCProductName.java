package com.johnz.recallsearch.rest.cpsc;

import com.johnz.recallsearch.models.cpsc.CPSCResponse;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by John on 9/24/2016.
 */
public interface CPSCProductName {
    @GET("Recall?format=json")
    Observable<List<CPSCResponse>> getCPSCProductName(@Query("ProductName") String searchTerm);
}
