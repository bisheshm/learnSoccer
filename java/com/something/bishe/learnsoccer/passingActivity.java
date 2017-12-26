package com.something.bishe.learnsoccer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class passingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing);

        Button buttonInsidePass = (Button) findViewById(R.id.insidePass);
        Button buttonOutsidePass = (Button) findViewById(R.id.outsidePass);
        Button buttonDrivenPass = (Button) findViewById(R.id.drivenPass);
        Button buttonLoftedPass = (Button) findViewById(R.id.loftedPass);
        Button buttonInsideCurvePass = (Button) findViewById(R.id.insideCurvePass);
        Button buttonOutsideCurvePass = (Button) findViewById(R.id.outsideCurvePass);
        Button buttonPassingDrill1 = (Button) findViewById(R.id.passingDrill1);
        Button buttonPassingDrill2 = (Button) findViewById(R.id.passingDrill2);
        Button buttonPassingDrill3 = (Button) findViewById(R.id.passingDrill3);
        Button buttonPassingDrill4 = (Button) findViewById(R.id.passingDrill4);

        buttonInsidePass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(passingActivity.this, insidePassActivity.class);
                startActivity(int1);
            }
        });

        buttonOutsidePass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(passingActivity.this, outsidePassActivity.class);
                startActivity(int2);
            }
        });

        buttonDrivenPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(passingActivity.this, drivenPassActivity.class);
                startActivity(int3);
            }
        });


        buttonLoftedPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(passingActivity.this, loftedPassActivity.class);
                startActivity(int4);
            }
        });

        buttonInsideCurvePass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(passingActivity.this, insideCurvePass.class);
                startActivity(int5);
            }
        });

        buttonOutsideCurvePass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(passingActivity.this, outsideCurvePass.class);
                startActivity(int6);
            }
        });

        buttonPassingDrill1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7 = new Intent(passingActivity.this, passingDrill1.class);
                startActivity(int7);
            }
        });

        buttonPassingDrill2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8 = new Intent(passingActivity.this, passingDrill2.class);
                startActivity(int8);
            }
        });

        buttonPassingDrill3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int9 = new Intent(passingActivity.this, passingDrill3.class);
                startActivity(int9);
            }
        });

        buttonPassingDrill4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int10 = new Intent(passingActivity.this, passingDrill4.class);
                startActivity(int10);
            }
        });
    }
}
