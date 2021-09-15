package com.example.omarm.lines;

import android.content.Intent;
import android.renderscript.Matrix4f;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Media extends AppCompatActivity {

    ImageView i,i1,i2,v4,v5,v6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_media);


        i=(ImageView)findViewById(R.id.i3);
        i1=(ImageView)findViewById(R.id.vv3);
        i2=(ImageView)findViewById(R.id.i5);
        v5=(ImageView)findViewById(R.id.imageView13);
        v6=(ImageView)findViewById(R.id.imageView14);
        v6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Media.this, interFace.class));

            }
        });



        v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Media.this, store.class));

            }
        });

        v4=(ImageView)findViewById(R.id.iss);
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Media.this, company.class));

            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Media.this, logo.class));

            }
        });


        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Media.this, commercial.class));

            }
        });



        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Media.this, rest_flyers.class));

            }
        });
    }
}
