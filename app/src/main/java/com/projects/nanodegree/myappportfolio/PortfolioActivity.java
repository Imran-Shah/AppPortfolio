package com.projects.nanodegree.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_app_one,btn_app_two,btn_app_three,btn_app_four, btn_app_five;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        initiateComponents();
        setListeners();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_app_one:
            case R.id.btn_app_two:
            case R.id.btn_app_three:
            case R.id.btn_app_four:
            case R.id.btn_app_five:

                Button btn = (Button)v;
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.button_launch) + btn.getText() + getResources().getString(R.string.app), Toast.LENGTH_SHORT).show();
                break;

            default:

        }
    }

    private void initiateComponents(){

        btn_app_one = (Button)findViewById(R.id.btn_app_one);
        btn_app_two = (Button)findViewById(R.id.btn_app_two);
        btn_app_three = (Button)findViewById(R.id.btn_app_three);
        btn_app_four = (Button)findViewById(R.id.btn_app_four);
        btn_app_five = (Button)findViewById(R.id.btn_app_five);

    }

    private void setListeners(){

        btn_app_one.setOnClickListener(this);
        btn_app_two.setOnClickListener(this);
        btn_app_three.setOnClickListener(this);
        btn_app_four.setOnClickListener(this);
        btn_app_five.setOnClickListener(this);

    }
}
