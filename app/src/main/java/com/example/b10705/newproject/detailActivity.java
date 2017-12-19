package com.example.b10705.newproject;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class detailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);



        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            finish();
            return;
        }


        detailFragment details = new detailFragment();

        details.setSelection(getIntent().getIntExtra("index",-1));

        getSupportFragmentManager().beginTransaction().replace(R.id.details,details).commit();

    }
}