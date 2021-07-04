package com.example.intent_you_2_apps_app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveActivity extends AppCompatActivity {


    private TextView mtvTextFromApp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        mtvTextFromApp1 = findViewById(R.id.tvTextFromApp1);
         if(getIntent() != null && getIntent().getExtras()!=null){
             mtvTextFromApp1.setText(getIntent().getStringExtra("Name"));
         }

    }
}