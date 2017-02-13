package com.example.yellow_umbrella.androidhiveslider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button showSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final PrefManager pref = new PrefManager(this);

        showSlider = (Button) findViewById(R.id.btn_show_slider);

        showSlider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pref.setFirstTimeLaunch(true);
                Intent goSlider = new Intent(MainActivity.this, WelcomeActivity.class);
                startActivity(goSlider);
            }
        });
    }
}
