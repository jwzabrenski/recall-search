package com.johnz.recallsearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String keyword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user clicks the Fetch button
     */
    public void sendResults(View view) {
        //Input for keyword search
        EditText editText = (EditText) findViewById(R.id.editText);
        keyword = editText.getText().toString();

        Intent intent = new Intent(getApplicationContext(), DisplayResultsActivity.class);
        intent.putExtra("keyword", keyword);
        startActivity(intent);
    }

    /*
    private List<RecallResponse> validateRecalls(List<RecallResponse> recalls){
        //TODO: test at 100
        if (recalls.size() > 50){
            return recalls.subList(0, 50);
        }
        return recalls;
    }
    */
}
