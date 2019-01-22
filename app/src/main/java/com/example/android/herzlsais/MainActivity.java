package com.example.android.herzlsais;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button single, multi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        single = findViewById(R.id.singleplaybtn);
        single.setOnClickListener(this);

        multi = findViewById(R.id.multiplaybtn);
        multi.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if(view == single){
            Intent intent = new Intent(this, GameActivity.class);
            startActivity(intent);
        }
    }
}
