package com.johnz.recallsearch.rest;

import com.johnz.recallsearch.models.cpsc.CPSCResponse;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by John on 12/10/2016.
 */
public interface CPSCDescription {
    @GET("Recall?format=json")
    Observable<List<CPSCResponse>> getCPSCDescription(@Query("RecallDescription") String searchTerm);
}
