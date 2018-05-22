package com.example.julianharty.logindemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static String TAG = "LoginDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void addDigit(View view) {
        Button b = (Button) findViewById(view.getId());
        String buttonText = b.getText().toString();

        Log.d(TAG, "Clicked:" + buttonText);
        TextView answer = (TextView) findViewById(R.id.textView2);
        String answerText = answer.getText().toString();
        answerText = answerText + buttonText;
        answer.setText(answerText);

        TextView answerToMatch = (TextView) findViewById(R.id.textView);
        String answerToMatchText = answerToMatch.getText().toString();

        if (answerText.equals(answerToMatchText)) {
            Log.i(TAG, "Match found, exiting this challenge." + answerToMatchText);
            finish();
        }
    }

    public void clearAnswer(View view) {
        Log.d(TAG, "Clearing the answer field");
        TextView answer = (TextView) findViewById(R.id.textView2);
        answer.setText("");
    }

}
