package com.johnz.recallsearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ViewGroup;

import com.johnz.recallsearch.adapters.RecallsAdapter;
import com.johnz.recallsearch.models.CombinedCPSCResponse;
import com.johnz.recallsearch.models.RecallResponse;
import com.johnz.recallsearch.presenters.ListPresenter;
import com.johnz.recallsearch.utilities.CPSCClient;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DisplayResultsActivity extends AppCompatActivity {
    private ArrayList<RecallResponse> recallsList = new ArrayList<RecallResponse>();
    private Set<RecallResponse> recallSet = new HashSet<RecallResponse>();
    RecallsAdapter adapter;
    ListPresenter mListPresenter;
    CPSCClient mCPSCClient;

    /*
    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://www.saferproducts.gov/RestWebServices/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build();
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_display_results);

        Intent intent = getIntent();
        String keyword = intent.getExtras().getString("keyword");

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recalls_recycler_view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //MainActivity.recallsApp app = (MainActivity.recallsApp) getApplicationContext();
        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_results);

        adapter = new RecallsAdapter(R.layout.list_item_recall, getApplicationContext());
        recyclerView.setAdapter(adapter);

        mCPSCClient = new CPSCClient(keyword);

        mListPresenter = new ListPresenter(DisplayResultsActivity.this, mCPSCClient);
        mListPresenter.loadRecalls();


        /*
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

        combined.subscribe(new Subscriber<CombinedCPSCResponse>() {

            @Override
            public void onNext(CombinedCPSCResponse o) {

                recallSet.clear();
                recallsList.clear();
                recallSet.addAll(o.productNames);
                recallSet.addAll(o.descriptions);
                recallsList.addAll(recallSet);

                if (!recallsList.isEmpty()) {

                    for (RecallResponse i : recallsList) {
                        Log.d("RecallID: ", i.getRecallID().toString());
                    }
                    adapter.setRecalls(recallsList);
                }
            }

            @Override
            public void onCompleted() {
                Log.d("Complete", "Complete");
            }

            public void onError(Throwable t) {
                Log.d("RXERROR", "onError: Error ocurred in rxjava");
                Log.d("MESSAGE", t.getMessage().toString());
            }
        });
        */

    }

    public void displayRecalls(CombinedCPSCResponse o) {
        recallSet.clear();
        recallsList.clear();
        recallSet.addAll(o.productNames);
        recallSet.addAll(o.descriptions);
        recallsList.addAll(recallSet);

        if (!recallsList.isEmpty()) {

            for (RecallResponse i : recallsList) {
                Log.d("RecallID: ", i.getRecallID().toString());
            }
            adapter.setRecalls(recallsList);
        }

    }


}
