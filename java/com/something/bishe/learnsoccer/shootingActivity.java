package com.something.bishe.learnsoccer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shootingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shooting);

        Button buttonPassShot = (Button) findViewById(R.id.passShot);
        Button buttonInsideCurveShot = (Button) findViewById(R.id.insideCurveShot);
        Button buttonOutsideCurveShot = (Button) findViewById(R.id.outsideCurveShot);
        Button buttonPowerShot = (Button) findViewById(R.id.powerShot);
        Button buttonChipShot = (Button) findViewById(R.id.chipShot);
        Button buttonVolley = (Button) findViewById(R.id.volley);
        Button buttonShootingDrill1 = (Button) findViewById(R.id.shootingDrill1);
        Button buttonShootingDrill2 = (Button) findViewById(R.id.shootingDrill2);
        Button buttonShootingDrill3 = (Button) findViewById(R.id.shootingDrill3);
        Button buttonShootingDrill4 = (Button) findViewById(R.id.shootingDrill4);


        buttonPassShot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(shootingActivity.this, passShotActivity.class);
                startActivity(int1);
            }
        });

        buttonInsideCurveShot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(shootingActivity.this, insideCurveShotActivity.class);
                startActivity(int2);
            }
        });

        buttonOutsideCurveShot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(shootingActivity.this, outsideCurveShotActivity.class);
                startActivity(int3);
            }
        });

        buttonPowerShot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(shootingActivity.this, powerShotActivity.class);
                startActivity(int4);
            }
        });

        buttonChipShot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(shootingActivity.this, chipShotActivity.class);
                startActivity(int5);
            }
        });

        buttonVolley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(shootingActivity.this, volleyActivity.class);
                startActivity(int6);
            }
        });

        buttonShootingDrill1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7 = new Intent(shootingActivity.this, shootingDrill1.class);
                startActivity(int7);
            }
        });

        buttonShootingDrill2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8 = new Intent(shootingActivity.this, shootingDrill2.class);
                startActivity(int8);
            }
        });

        buttonShootingDrill3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int9 = new Intent(shootingActivity.this, shootingDrill3.class);
                startActivity(int9);
            }
        });

        buttonShootingDrill4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int10 = new Intent(shootingActivity.this, shootingDrill4.class);
                startActivity(int10);
            }
        });

    }
}
