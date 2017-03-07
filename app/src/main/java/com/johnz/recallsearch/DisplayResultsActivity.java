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

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_display_results);
        Intent intent = getIntent();
        String keyword = intent.getExtras().getString("keyword");

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recalls_recycler_view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_results);

        adapter = new RecallsAdapter(R.layout.list_item_recall, getApplicationContext());
        recyclerView.setAdapter(adapter);

        mCPSCClient = new CPSCClient();

        mListPresenter = new ListPresenter(DisplayResultsActivity.this, mCPSCClient, keyword);
        mListPresenter.loadRecalls();
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
