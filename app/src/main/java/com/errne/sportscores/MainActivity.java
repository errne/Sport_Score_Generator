package com.errne.sportscores;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvWelcome;
    Button btnSoccer, btnSoccerCup, btnBasketball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSoccer = findViewById(R.id.btnSoccer);
        btnSoccerCup = findViewById(R.id.btnSoccerCup);
        btnBasketball = findViewById(R.id.btnBasketball);
        tvWelcome = findViewById(R.id.tvWelcome);

        btnSoccer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,FootballActivity.class));
            }
        });

        btnBasketball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BasketballActivity.class));
            }
        });

        btnSoccerCup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,FootballCupActivity.class));
            }
        });
    }
}
