package com.example.omarm.lines;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Resturant extends AppCompatActivity {


    ImageView v1,v2,v3,v4,v5,v6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_resturant);

        v1=(ImageView)findViewById(R.id.i3);
        v2=(ImageView)findViewById(R.id.i5);
        v3=(ImageView)findViewById(R.id.vv3);
        v4=(ImageView)findViewById(R.id.iss);
        v5=(ImageView)findViewById(R.id.imageView13);
        v6=(ImageView)findViewById(R.id.imageView14);
        v6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Resturant.this, interFace.class));

            }
        });





        v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Resturant.this, store.class));

            }
        });

        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Resturant.this, company.class));

            }
        });



        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Resturant.this, logo.class));
            }
        });

        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Resturant.this,"Flyers",Toast.LENGTH_LONG).show();
                startActivity(new Intent(Resturant.this, rest_flyers.class));

            }
        });

        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Resturant.this, commercial.class));

            }
        });
    }
}
