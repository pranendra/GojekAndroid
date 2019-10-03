package com.evanfauzi.gojekandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView goSend,goRide,goFood,goMart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goSend = findViewById(R.id.imageViewGoSend);
        goRide = findViewById(R.id.imageViewGoRide);
        goFood = findViewById(R.id.imageViewGoFood);
        goMart = findViewById(R.id.imageViewGoMart);

        goSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, gosend.class);
                startActivity(i);
            }
        });

        goRide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, goride.class);
                startActivity(i);
            }
        });

        goFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, gofood.class);
                startActivity(i);
            }
        });

        goMart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, gomart.class);
                startActivity(i);
            }
        });
    }
}
