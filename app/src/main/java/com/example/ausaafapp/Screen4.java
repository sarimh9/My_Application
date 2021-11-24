package com.example.ausaafapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Screen4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);

        ImageView treeA = findViewById(R.id.treeA);
        ImageView treeB = findViewById(R.id.treeB);
        ImageView treeC = findViewById(R.id.treeC);

        /**
         *  Setting up click listener on image of first tree
         */
        treeA.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Screen4.this,FavGenreScreen.class);
                        startActivity(intent);
                    }
                }
        );

        /**
         *  Setting up click listener on image of second tree
         */
        treeB.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Screen4.this,FavGenreScreen.class);
                        startActivity(intent);
                    }
                }
        );

        /**
         *  Setting up click listener on image of third tree
         */
        treeC.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Screen4.this,FavGenreScreen.class);
                        startActivity(intent);
                    }
                }
        );

    }
}
