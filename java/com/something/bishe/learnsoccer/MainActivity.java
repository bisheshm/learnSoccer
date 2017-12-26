package com.something.bishe.learnsoccer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonShooting = (Button) findViewById(R.id.shootingButton);
        Button buttonPassing = (Button) findViewById(R.id.passingButton);
        Button buttonDribbling = (Button) findViewById(R.id.dribblingButton);
        Button buttonControl = (Button) findViewById(R.id.controlButton);

        buttonShooting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity.this, shootingActivity.class);
                startActivity(int1);
            }
        });

        buttonPassing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(MainActivity.this, passingActivity.class);
                startActivity(int2);
            }
        });

        buttonDribbling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(MainActivity.this, dribblingActivity.class);
                startActivity(int3);
            }
        });

        buttonControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(MainActivity.this, controlActivity.class);
                startActivity(int4);
            }
        });

    }
}
