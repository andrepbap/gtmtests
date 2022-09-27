package com.example.gtmtests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_1).setOnClickListener(view -> {

        });

        findViewById(R.id.button_2).setOnClickListener(view -> {

        });

        findViewById(R.id.button_3).setOnClickListener(view -> {

        });
    }
}