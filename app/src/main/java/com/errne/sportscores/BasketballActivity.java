package com.errne.sportscores;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.widget.Toast.LENGTH_SHORT;

public class BasketballActivity extends AppCompatActivity {
    Button btn1, btn2, btnOT1, btnOT2;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setIcon(R.mipmap.basketball);
        actionBar.setTitle(" Basketball ");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btnOT1 = findViewById(R.id.btnOT1);
        btnOT1.setVisibility(View.GONE);
        btnOT2 = findViewById(R.id.btnOT2);
        btnOT2.setVisibility(View.GONE);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setVisibility(View.GONE);
                int score = generatePoints();

                tv1.setText("" + score);
                if(tv1.getText().toString().equals(tv2.getText().toString())){
                    btnOT1.setVisibility(View.VISIBLE);
                    btnOT2.setVisibility(View.VISIBLE);
                }
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setVisibility(View.GONE);

                int score = generatePoints();
                    tv2.setText("" + score);
                if(tv1.getText().toString().equals(tv2.getText().toString())){
                    btnOT1.setVisibility(View.VISIBLE);
                    btnOT2.setVisibility(View.VISIBLE);
                }
            }
        });

        btnOT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oldScore = (String) tv1.getText();
                Random random = new Random();
                int oldpoints= Integer.parseInt(oldScore);
                int otpoints = 0;
                otpoints = random.nextInt(11) + 1;
                otpoints+= oldpoints;
                tv1.setText("" + otpoints);
                btnOT1.setVisibility(View.GONE);
                if(tv1.getText().toString().equals(tv2.getText().toString())){
                    btnOT1.setVisibility(View.VISIBLE);
                    btnOT2.setVisibility(View.VISIBLE);
                }
        }
    });

        btnOT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oldScore = (String) tv2.getText();
                Random random = new Random();
                int oldpoints= Integer.parseInt(oldScore);
                int otpoints = 0;
                otpoints = random.nextInt(11) + 1;
                otpoints+= oldpoints;
                tv2.setText("" + otpoints);
                btnOT2.setVisibility(View.GONE);
                if(tv1.getText().toString().equals(tv2.getText().toString())){
                    btnOT1.setVisibility(View.VISIBLE);
                    btnOT2.setVisibility(View.VISIBLE);
                }
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.football, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.home:
                Toast.makeText(this, "Going back home", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,MainActivity.class));
                break;
            case R.id.reset:
                Toast.makeText(this, "Score was reset", LENGTH_SHORT).show();
                tv1.setText("?");
                tv2.setText("?");
                btn1.setVisibility(View.VISIBLE);
                btn2.setVisibility(View.VISIBLE);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public Integer generatePoints(){
        Random random = new Random();
        int points;
        points = random.nextInt(42) + 60;

        return points;
    }
}
