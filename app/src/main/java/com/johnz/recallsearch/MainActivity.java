package com.johnz.recallsearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private String keyword;
    private String agency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton rbCPSC;

        rbCPSC = (RadioButton) findViewById(R.id.cpsc);

        if (rbCPSC.isChecked()){
            agency = "CPSC";
        }

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
        intent.putExtra("agency", agency);
        startActivity(intent);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.cpsc:
                if (checked)
                    agency = "CPSC";
                break;
            case R.id.fda:
                if (checked)
                    agency = "FDA";
                break;
        }
    }

}
