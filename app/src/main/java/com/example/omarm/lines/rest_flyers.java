package com.example.omarm.lines;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class rest_flyers extends AppCompatActivity {

    ImageView T1,t2;
    static Boolean flag=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_rest_flyers);


            AlertDialog.Builder b = new AlertDialog.Builder(rest_flyers.this).setMessage("Short Click to View the Design\nLong Click to Edit the Design").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            b.create();
            b.show();


        T1=(ImageView)findViewById(R.id.t1);
        t2=(ImageView)findViewById(R.id.i78);

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ImageView image = new ImageView(getApplication());
                image.setImageResource(R.drawable.temp_real);

                AlertDialog.Builder builder =
                        new AlertDialog.Builder(rest_flyers.this).

                                setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                }).
                                setView(image);
                builder.create().show();
            }
        });
        t2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                startActivity(new Intent(rest_flyers.this, tempTwo.class));


                return true;
            }
        });



        T1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image = new ImageView(getApplication());
                image.setImageResource(R.drawable.templete_real);

                AlertDialog.Builder builder =
                        new AlertDialog.Builder(rest_flyers.this).

                                setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                }).
                                setView(image);
                builder.create().show();
            }
        });


        T1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                startActivity(new Intent(rest_flyers.this, templete1_edit.class));
                return true;
            }
        });
    }
}

