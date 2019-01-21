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

public class FootballCupActivity extends AppCompatActivity {
    Button btn1, btn2, btnET1, btnET2, btnPen1, btnPen2;
    TextView tv1, tv2, tvPen1, tvPen2;
    Boolean ET1btn, ET2btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football_cup);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setIcon(R.mipmap.football);
        actionBar.setTitle(" Football ");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tvPen1 = findViewById(R.id.tvPen1);
        tvPen1.setVisibility(View.GONE);
        tvPen2 = findViewById(R.id.tvPen2);
        tvPen2.setVisibility(View.GONE);
        btnET1 = findViewById(R.id.btnET1);
        btnET1.setVisibility(View.GONE);
        ET1btn = false;
        btnET2 = findViewById(R.id.btnET2);
        btnET2.setVisibility(View.GONE);
        ET2btn = false;
        btnPen1 = findViewById(R.id.btnPen1);
        btnPen1.setVisibility(View.GONE);
        btnPen2 = findViewById(R.id.btnPen2);
        btnPen2.setVisibility(View.GONE);

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
                    Toast.makeText(FootballCupActivity.this, "WOW", LENGTH_SHORT).show();
                } else if (goals > 98) {
                    tv1.setText("8");
                    Toast.makeText(FootballCupActivity.this, "WOW", LENGTH_SHORT).show();
                }
                if(tv1.getText().toString().equals(tv2.getText().toString())){
                    btnET1.setVisibility(View.VISIBLE);
                    ET1btn=true;
                    btnET2.setVisibility(View.VISIBLE);
                    ET2btn=true;
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
                    Toast.makeText(FootballCupActivity.this, "WOW", LENGTH_SHORT).show();
                } else if (goals > 98) {
                    tv2.setText("8");
                    Toast.makeText(FootballCupActivity.this, "WOW", LENGTH_SHORT).show();
                }
                if(tv1.getText().toString().equals(tv2.getText().toString())){
                    btnET1.setVisibility(View.VISIBLE);
                    ET1btn=true;
                    btnET2.setVisibility(View.VISIBLE);
                    ET2btn=true;
                }
            }
        });

        btnET1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int etgoals;
                int ftgoals = Integer.parseInt((String) tv1.getText());
                btnET1.setVisibility(View.GONE);
                ET1btn=false;
                Random random = new Random();
                etgoals = random.nextInt(100) + 1;

                if (etgoals < 55) {
                    etgoals =0;
                    tv1.setText("" + (etgoals+ftgoals));
                } else if (etgoals < 85 && etgoals > 54) {
                    etgoals =1;
                    tv1.setText("" + (etgoals+ftgoals));
                } else if (etgoals < 97 && etgoals > 84) {
                    etgoals =2;
                    tv1.setText("" + (etgoals+ftgoals));
                } else if (etgoals > 96) {
                    etgoals =3;
                    tv1.setText("" + (etgoals+ftgoals));
                }

                if(ET2btn == false && tv1.getText().toString().equals(tv2.getText().toString())){
                    btnPen1.setVisibility(View.VISIBLE);
                    tvPen1.setVisibility(View.VISIBLE);
                    btnPen2.setVisibility(View.VISIBLE);
                    tvPen2.setVisibility(View.VISIBLE);
                }
            }
        });

        btnET2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int etgoals;
                int ftgoals = Integer.parseInt((String) tv2.getText());
                btnET2.setVisibility(View.GONE);
                ET2btn=false;
                Random random = new Random();
                etgoals = random.nextInt(100) + 1;

                if (etgoals < 55) {
                    etgoals =0;
                    tv2.setText("" + (etgoals+ftgoals));
                } else if (etgoals < 85 && etgoals > 54) {
                    etgoals =1;
                    tv2.setText("" + (etgoals+ftgoals));
                } else if (etgoals < 97 && etgoals > 84) {
                    etgoals =2;
                    tv2.setText("" + (etgoals+ftgoals));
                } else if (etgoals > 96) {
                    etgoals =3;
                    tv2.setText("" + (etgoals+ftgoals));
                }

                if(ET1btn == false && tv1.getText().toString().equals(tv2.getText().toString())){
                    btnPen1.setVisibility(View.VISIBLE);
                    tvPen1.setVisibility(View.VISIBLE);
                    btnPen2.setVisibility(View.VISIBLE);
                    tvPen2.setVisibility(View.VISIBLE);
                }
            }
        });

        btnPen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int penalties1;
                Random random = new Random();
                penalties1 = random.nextInt(5);
                tvPen1.setText("" + penalties1);
                btnPen1.setVisibility(View.GONE);

                if(tvPen1.getText().toString().equals(tvPen2.getText().toString())){
                    Toast.makeText(FootballCupActivity.this,"Extra penalties being taken", Toast.LENGTH_LONG).show();
                    if (random.nextBoolean())
                    {
                        tvPen1.setText("" + (penalties1+1));
                    }
                    else
                    {
                        tvPen2.setText("" + (penalties1+1));
                    }
                }
            }
        });

        btnPen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int penalties2;
                Random random = new Random();
                penalties2 = random.nextInt(5);
                tvPen2.setText("" + penalties2);
                btnPen2.setVisibility(View.GONE);

                if(tvPen1.getText().toString().equals(tvPen2.getText().toString())){
                    Toast.makeText(FootballCupActivity.this,"Extra penalties being taken", Toast.LENGTH_LONG).show();
                    if (random.nextBoolean())
                    {
                        tvPen1.setText("" + (penalties2+1));
                    }
                    else
                    {
                        tvPen2.setText("" + (penalties2+1));
                    }
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
                btnPen1.setVisibility(View.GONE);
                btnPen2.setVisibility(View.GONE);
                tvPen1.setText("?");
                tvPen1.setVisibility(View.GONE);
                tvPen2.setText("?");
                tvPen2.setVisibility(View.GONE);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}