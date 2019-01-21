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

public class FootballActivity extends AppCompatActivity {
    Button btn1, btn2;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setIcon(R.mipmap.football);
        actionBar.setTitle(" Football ");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int goals;
                btn1.setVisibility(View.GONE);
                Random random = new Random();
                goals = random.nextInt(100) + 1;

                if (goals < 25) {
                    tv1.setText("0");
                } else if (goals < 48 && goals > 24) {
                    tv1.setText("1");
                } else if (goals < 59 && goals > 47) {
                    tv1.setText("2");
                } else if (goals < 75 && goals > 58) {
                    tv1.setText("3");
                } else if (goals < 87 && goals > 74) {
                    tv1.setText("4");
                } else if (goals < 93 && goals > 86) {
                    tv1.setText("5");
                } else if (goals < 96 && goals > 92) {
                    tv1.setText("6");
                } else if (goals < 99 && goals > 95) {
                    tv1.setText("7");
                    Toast.makeText(FootballActivity.this, "WOW", LENGTH_SHORT).show();
                } else if (goals > 98) {
                    tv1.setText("8");
                    Toast.makeText(FootballActivity.this, "WOW", LENGTH_SHORT).show();
                }
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setVisibility(View.GONE);
                Random random = new Random();
                int goals;
                goals = random.nextInt(100) + 1;

                if (goals < 24) {
                    tv2.setText("0");
                } else if (goals < 45 && goals > 23) {
                    tv2.setText("1");
                } else if (goals < 62 && goals > 44) {
                    tv2.setText("2");
                } else if (goals < 75 && goals > 61) {
                    tv2.setText("3");
                } else if (goals < 84 && goals > 74) {
                    tv2.setText("4");
                } else if (goals < 92 && goals > 83) {
                    tv2.setText("5");
                } else if (goals < 96 && goals > 91) {
                    tv2.setText("6");
                } else if (goals < 99 && goals > 95) {
                    tv2.setText("7");
                    Toast.makeText(FootballActivity.this, "WOW", LENGTH_SHORT).show();
                } else if (goals > 98) {
                    tv2.setText("8");
                    Toast.makeText(FootballActivity.this, "WOW", LENGTH_SHORT).show();
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
}
