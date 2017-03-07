package com.johnz.recallsearch.utilities;

import com.johnz.recallsearch.models.CombinedCPSCResponse;
import com.johnz.recallsearch.models.RecallResponse;
import com.johnz.recallsearch.rest.CPSCDescription;
import com.johnz.recallsearch.rest.CPSCProductName;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func2;
import rx.schedulers.Schedulers;

/**
 * Created by John on 2/18/2017.
 */
public class CPSCClient {
    private static Retrofit retrofit;
    private static CPSCClient instance = null;
    public static final String BASE_URL = "http://www.saferproducts.gov/RestWebServices/";

    //TODO: make CPSCClient singleton instance


    public CPSCClient() {
        if (retrofit == null) {
            buildRetrofit();
        }
    }

    public static CPSCClient getInstanceOf() {
        if (instance == null){
            instance = new CPSCClient();
        }
        return instance;
    }

    private void buildRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public Observable<CombinedCPSCResponse> getCombined(String keyword) {
            Observable<List<RecallResponse>> CPSCProductNameObservable = retrofit
                    .create(CPSCProductName.class)
                    .getCPSCProductName(keyword)
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread());

            Observable<List<RecallResponse>> CPSCDescriptionObservable = retrofit
                    .create(CPSCDescription.class)
                    .getCPSCDescription(keyword)
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread());

            Observable<CombinedCPSCResponse> combined = Observable.zip(CPSCProductNameObservable, CPSCDescriptionObservable, new Func2<List<RecallResponse>, List<RecallResponse>, CombinedCPSCResponse>() {
                @Override
                public CombinedCPSCResponse call(List<RecallResponse> list1, List<RecallResponse> list2) {
                    return new CombinedCPSCResponse(list1, list2);
                }
            });

            return combined;
        }
}
