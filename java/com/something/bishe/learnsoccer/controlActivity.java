package com.something.bishe.learnsoccer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class controlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        Button buttonJugglingToes = (Button) findViewById(R.id.jugglingToes);
        Button buttonJugglingLaces = (Button) findViewById(R.id.jugglingLaces);
        Button buttonThighJuggling = (Button) findViewById(R.id.thighJuggling);
        Button buttonHeadJuggling = (Button) findViewById(R.id.headJuggling);
        Button buttonChestControl = (Button) findViewById(R.id.chestControl);
        Button buttonFirstTouchDrill = (Button) findViewById(R.id.firstTouchDrill);
        Button buttonTriangleTouches = (Button) findViewById(R.id.triangleTouches);
        Button buttonPinchTouches = (Button) findViewById(R.id.pinchTouches);
        Button buttonInsideFootControl = (Button) findViewById(R.id.insideFootControl);
        Button buttonRainbow = (Button) findViewById(R.id.rainbow);


        buttonJugglingToes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(controlActivity.this, jugglingToesActivity.class);
                startActivity(int1);
            }
        });

        buttonJugglingLaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(controlActivity.this, jugglingLacesActivity.class);
                startActivity(int2);
            }
        });

        buttonThighJuggling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(controlActivity.this, thighJugglingActivity.class);
                startActivity(int3);
            }
        });

        buttonHeadJuggling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(controlActivity.this, headJugglingActivity.class);
                startActivity(int4);
            }
        });

        buttonChestControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(controlActivity.this, chestControlActivity.class);
                startActivity(int5);
            }
        });

        buttonFirstTouchDrill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(controlActivity.this, firstTouchDrill.class);
                startActivity(int6);
            }
        });

        buttonTriangleTouches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7 = new Intent(controlActivity.this, triangleTouches.class);
                startActivity(int7);
            }
        });

        buttonPinchTouches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8 = new Intent(controlActivity.this, pinchTouches.class);
                startActivity(int8);
            }
        });

        buttonInsideFootControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int9 = new Intent(controlActivity.this, insideFootControl.class);
                startActivity(int9);
            }
        });

        buttonRainbow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int10 = new Intent(controlActivity.this, rainbow.class);
                startActivity(int10);
            }
        });
    }
}
