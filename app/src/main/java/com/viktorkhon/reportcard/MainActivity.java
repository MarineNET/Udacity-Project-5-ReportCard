package com.viktorkhon.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard word = new ReportCard("Jack", 88, 98);

        Log.v("NumbersActivity", "Current word: " + word);
    }
}
