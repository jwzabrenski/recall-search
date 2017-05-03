package com.johnz.recallsearch;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ProgressBar;
import android.view.View;
import android.widget.Toast;

import com.johnz.recallsearch.adapters.RecallsAdapter;
import com.johnz.recallsearch.models.cpsc.CPSCResponse;
import com.johnz.recallsearch.models.cpsc.CombinedCPSCResponse;
import com.johnz.recallsearch.presenters.ListPresenter;
import com.johnz.recallsearch.utilities.CPSCClient;
import com.johnz.recallsearch.utilities.FDAClient;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DisplayResultsActivity extends AppCompatActivity {
    private ArrayList<CPSCResponse> recallsList = new ArrayList<CPSCResponse>();
    private Set<CPSCResponse> recallSet = new HashSet<CPSCResponse>();
    RecallsAdapter adapter;
    ListPresenter mListPresenter;
    CPSCClient mCPSCClient;
    FDAClient mFDAClient;
    private ProgressBar spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Context context = getApplicationContext();
        setContentView(R.layout.activity_display_results);

        //Get keyword to search for from intent
        Intent intent = getIntent();
        String keyword = intent.getExtras().getString("keyword");

        //Get agency to use in search from intent
        String agency = intent.getExtras().getString("agency");
        spinner=(ProgressBar)findViewById(R.id.progressBar1);
        spinner.setVisibility(View.VISIBLE);

        Toast toast = Toast.makeText(context, "Agency selected is: " + agency, Toast.LENGTH_SHORT);
        toast.show();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recalls_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_results);

        adapter = new RecallsAdapter(R.layout.list_item_recall, context);
        recyclerView.setAdapter(adapter);

        //mCPSCClient = new CPSCClient();
        mFDAClient = new FDAClient();
        //mFDAClient.getInstanceOf();
        mFDAClient.testRetrofit();

        //mListPresenter = new ListPresenter(DisplayResultsActivity.this, mCPSCClient, keyword);
        //mListPresenter.loadRecalls();
    }

    //Add CPSC results to set and set adapter if results != NULL
    public void displayRecalls(CombinedCPSCResponse o) {
        spinner.setVisibility(View.GONE);
        recallSet.clear();
        recallsList.clear();
        recallSet.addAll(o.productNames);
        recallSet.addAll(o.descriptions);
        recallsList.addAll(recallSet);

        if (!recallsList.isEmpty()) {

            for (CPSCResponse i : recallsList) {
                Log.d("RecallID: ", i.getRecallID().toString());
            }
            adapter.setRecalls(recallsList);
        }

    }

    public void displayAgency(String agency){

    }


}
