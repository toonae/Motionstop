package com.example.computer.motionstop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {
    TextView  detailTextView;

    private String[]  detailStrings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        detailTextView = findViewById(R.id.txvDetail);
        detailTextView.setText(getIntent().getStringExtra("Detail"));




    }



    }

