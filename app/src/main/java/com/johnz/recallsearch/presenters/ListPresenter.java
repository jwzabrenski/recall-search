package com.johnz.recallsearch.presenters;

import android.util.Log;

import com.johnz.recallsearch.DisplayResultsActivity;
import com.johnz.recallsearch.models.CombinedCPSCResponse;
import com.johnz.recallsearch.utilities.CPSCClient;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by John on 2/21/2017.
 */
public class ListPresenter {
    DisplayResultsActivity mView;
    CPSCClient mCPSC;
    Observable<CombinedCPSCResponse> combined;

    public ListPresenter(DisplayResultsActivity view, CPSCClient client) {

        mView = view;
        mCPSC = client;
    }

    public void loadRecalls() {
        combined = mCPSC.getCombined();

        combined.subscribe(new Subscriber<CombinedCPSCResponse>() {

            @Override
            public void onNext(CombinedCPSCResponse o) {

                mView.displayRecalls(o);
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


    }
}

