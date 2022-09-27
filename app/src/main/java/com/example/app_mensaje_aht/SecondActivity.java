package com.example.app_mensaje_aht;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tvDato;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvDato = (TextView) findViewById(R.id.tvDato);

        Intent intent = getIntent();
        if (intent.getStringExtra("dato") != null) {
            tvDato.setText(intent.getStringExtra("dato"));

            }
        }
    }

