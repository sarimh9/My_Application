package com.example.ausaafapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        ImageView imageViewA = findViewById(R.id.petrichorImage);
        ImageView imageViewB = findViewById(R.id.darkCloudsImage);

        imageViewA.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Screen2.this,FavGenreScreen.class);
                        startActivity(intent);
                    }
                }
        );

        imageViewB.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Screen2.this,FavGenreScreen.class);
                        startActivity(intent);
                    }
                }
        );
    }
}