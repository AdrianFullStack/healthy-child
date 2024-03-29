package com.ninosano.Activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.ninosano.Config;
import com.ninosano.R;

public class SplashActivity extends AppCompatActivity {
    Boolean isCancelled = false;
    private ProgressBar progressBar;
    private Intent intent = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(!isCancelled) {
                    intent = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(intent);
                    progressBar.setVisibility(View.GONE);
                    finish();
                }
            }
        }, Config.SPLASH_TIME);
    }
}
