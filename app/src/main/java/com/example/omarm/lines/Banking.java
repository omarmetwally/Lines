package com.example.omarm.lines;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class Banking extends AppCompatActivity {

    ImageView v3, v4,vv3,v7,v5,v6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_banking);


        v3 = (ImageView) findViewById(R.id.i3);
        v4 = (ImageView) findViewById(R.id.i5);
        vv3=(ImageView) findViewById(R.id.vv3);
        v5=(ImageView)findViewById(R.id.imageView13);



        v6=(ImageView)findViewById(R.id.imageView14);
        v6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Banking.this, interFace.class));

            }
        });
        v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Banking.this, store.class));

            }
        });


        v7=(ImageView)findViewById(R.id.iss);
        v7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Banking.this, company.class));

            }
        });

        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Banking.this, logo.class));
            }
        });

        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Banking.this, rest_flyers.class));
                //Toast.makeText(Banking.this, "Flyers", Toast.LENGTH_LONG).show();
            }
        });

        vv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Banking.this, commercial.class));

            }
        });
    }
}

