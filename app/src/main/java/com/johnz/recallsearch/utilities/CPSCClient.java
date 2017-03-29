package com.johnz.recallsearch.utilities;

import com.johnz.recallsearch.models.cpsc.CPSCResponse;
import com.johnz.recallsearch.models.cpsc.CombinedCPSCResponse;
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

    public CPSCClient() {
        if (retrofit == null) {
            buildRetrofit();
        }
    }

    public static CPSCClient getInstanceOf() {
        if (instance == null) {
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

    //Return combined results of CPSC searches for Product Name and Descriptions
    public Observable<CombinedCPSCResponse> getCombined(String keyword) {
        Observable<List<CPSCResponse>> CPSCProductNameObservable = retrofit
                .create(CPSCProductName.class)
                .getCPSCProductName(keyword)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());

        Observable<List<CPSCResponse>> CPSCDescriptionObservable = retrofit
                .create(CPSCDescription.class)
                .getCPSCDescription(keyword)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());

        Observable<CombinedCPSCResponse> combined = Observable.zip(CPSCProductNameObservable, CPSCDescriptionObservable, new Func2<List<CPSCResponse>, List<CPSCResponse>, CombinedCPSCResponse>() {
            @Override
            public CombinedCPSCResponse call(List<CPSCResponse> list1, List<CPSCResponse> list2) {
                return new CombinedCPSCResponse(list1, list2);
            }
        });

        return combined;
    }
}
