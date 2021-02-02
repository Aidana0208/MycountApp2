package com.example.mycountapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    int countt = 0;
    private static final String KEY_COUNT = "counter";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter",countt);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        countt = savedInstanceState.getInt("counter");
        displaycount(countt);
    }

    public void count_App(View v) {
        countt++;
        displaycount(countt);
    }
    public void reset_Button(View v) {
        countt = 0;
        displayreset(countt);
    }


    public void displaycount(int score) {
        TextView scoreView = (TextView) findViewById(R.id.counT);
        scoreView.setText(String.format("%04d",countt));
    }
    public void displayreset(int res) {
        TextView resView = (TextView) findViewById(R.id.counT);
        resView.setText(String.format("%04d",countt));
    }


}