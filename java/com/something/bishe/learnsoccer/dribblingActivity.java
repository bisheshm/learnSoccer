package com.something.bishe.learnsoccer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dribblingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dribbling);

        Button buttonStepDribbling = (Button) findViewById(R.id.stepDribbling);
        Button buttonSoleRole = (Button) findViewById(R.id.soleRole);
        Button buttonInsideOutside = (Button) findViewById(R.id.insideOutside);
        Button buttonCones = (Button) findViewById(R.id.cones);
        Button buttonStepovers = (Button) findViewById(R.id.stepovers);
        Button buttonDrag = (Button) findViewById(R.id.drag);
        Button buttonChop = (Button) findViewById(R.id.chop);
        Button buttonCruyff = (Button) findViewById(R.id.cruyff);
        Button buttonDragStepover = (Button) findViewById(R.id.dragStepover);
        Button buttonCones2 = (Button) findViewById(R.id.cones2);


        buttonStepDribbling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(dribblingActivity.this, stepdribbleActivity.class);
                startActivity(int1);
            }
        });

        buttonSoleRole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2= new Intent(dribblingActivity.this, soleRoleActivity.class);
                startActivity(int2);
            }
        });

        buttonInsideOutside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3= new Intent(dribblingActivity.this, insideOutsideActivity.class);
                startActivity(int3);
            }
        });

        buttonCones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4= new Intent(dribblingActivity.this, cones.class);
                startActivity(int4);
            }
        });

        buttonStepovers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(dribblingActivity.this, stepoversActivity.class);
                startActivity(int5);
            }
        });

        buttonDrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(dribblingActivity.this, dragActivity.class);
                startActivity(int6);
            }
        });

        buttonChop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7 = new Intent(dribblingActivity.this, chopActivity.class);
                startActivity(int7);
            }
        });

        buttonCruyff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8 = new Intent(dribblingActivity.this, cruyffActivity.class);
                startActivity(int8);
            }
        });

        buttonDragStepover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int9 = new Intent(dribblingActivity.this, dragStepover.class);
                startActivity(int9);
            }
        });

        buttonCones2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int10 = new Intent(dribblingActivity.this, cones2Activity.class);
                startActivity(int10);
            }
        });

    }
}
