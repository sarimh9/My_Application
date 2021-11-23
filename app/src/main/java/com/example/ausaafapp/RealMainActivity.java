package com.example.ausaafapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class RealMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_main);

        ConstraintLayout constraintLayout = findViewById(R.id.mainLayoutCL);


//        Log.d(getClass().getName(), "V A L U E  ====== " + temp);

            constraintLayout.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int temp = generateRandomNumber();
                            if (temp == 1){
                                Intent intent = new Intent(RealMainActivity.this, MainActivity.class);
                                startActivity(intent);

                            } else {
                                Intent intent = new Intent(RealMainActivity.this, Screen4.class);
                                startActivity(intent);
                            }
//                            Toast.makeText(RealMainActivity.this, "Temp =="+temp, Toast.LENGTH_LONG).show();
                        }
                    }
            );
            Toast.makeText(this, "Touch Again Please", Toast.LENGTH_SHORT).show();
        }


    public static int generateRandomNumber() {
        return (int) Math.round(Math.random());
    }
}