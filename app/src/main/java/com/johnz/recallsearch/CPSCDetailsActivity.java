package com.johnz.recallsearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.johnz.recallsearch.models.RecallResponse;

public class CPSCDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpscdetails);

        TextView titleText = (TextView) findViewById(R.id.textViewTitle);
        TextView titleDescription = (TextView) findViewById(R.id.textViewDescription);
        titleDescription.setMovementMethod(new ScrollingMovementMethod());

        Intent intent = getIntent();
        RecallResponse current = intent.getParcelableExtra("current_details");

        titleText.setText(current.getTitle());
        titleDescription.setText(current.getDescription());

    }

}
