package com.example.ausaafapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView sunImage = findViewById(R.id.sunImageView);
        ImageView rainImage = findViewById(R.id.rainImageView);

        sunImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Select Your Genre",
                                Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, FavGenreScreen.class);
                        startActivity(intent);
                    }
                }
        );

    rainImage.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Rain is an awesome choice!",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,Screen2.class);
                    startActivity(intent);
                }
            }
    );

//        rainImage.setOnClickListener(
//                v -> {
//                    Toast.makeText(MainActivity.this, "Rain is an awesome choice!",
//                            Toast.LENGTH_SHORT).show();
//                    Intent intent = new Intent(MainActivity.this,Screen4.class);
//                    startActivity(intent);
//                }
//        );
    }


}