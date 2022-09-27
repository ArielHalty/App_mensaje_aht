package com.example.app_mensaje_aht;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SixthActivity extends AppCompatActivity {

    private int progress = 0;
    private Button button_incr;
    private Button button_decr;
    private ProgressBar progressBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth_activity);

        button_incr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress <= 90) {
                    progress += 10;
                    updateProgressBar();

                }
            }
        });
        button_decr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress >= 90) {
                    progress -= 10;
                    updateProgressBar();
                }
            }
        });
    }
    private void updateProgressBar(){
        progressBar.setProgress(progress);
        textView.setText(String.valueOf(progress));
    }

}
