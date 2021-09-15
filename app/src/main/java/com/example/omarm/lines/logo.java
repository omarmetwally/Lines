package com.example.omarm.lines;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class logo extends AppCompatActivity {

    ImageView i,i2,i3,i4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_logo);
        AlertDialog.Builder b = new AlertDialog.Builder(logo.this).setMessage("Short Click to View the Design\nLong Click to Edit the Design").setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        b.create();
        b.show();

        i=(ImageView)findViewById(R.id.log1);
        i2=(ImageView)findViewById(R.id.log2);
        i3=(ImageView)findViewById(R.id.log3);
        i4=(ImageView)findViewById(R.id.log4);


        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image = new ImageView(getApplication());
                image.setImageResource(R.drawable.logo1_real);

                AlertDialog.Builder builder =
                        new AlertDialog.Builder(logo.this).

                                setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                }).
                                setView(image);
                builder.create().show();
            }
        });



        i.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                startActivity(new Intent(logo.this, logo1.class));

                return true;
            }
        });


        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image = new ImageView(getApplication());
                image.setImageResource(R.drawable.logo2_real);

                AlertDialog.Builder builder =
                        new AlertDialog.Builder(logo.this).

                                setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                }).
                                setView(image);
                builder.create().show();
            }
        });



        i2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                startActivity(new Intent(logo.this, logo2.class));

                return true;
            }
        });


        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image = new ImageView(getApplication());
                image.setImageResource(R.drawable.logo3_real);

                AlertDialog.Builder builder =
                        new AlertDialog.Builder(logo.this).

                                setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                }).
                                setView(image);
                builder.create().show();
            }
        });





        i3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                startActivity(new Intent(logo.this, logo3.class));

                return true;
            }
        });


        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image = new ImageView(getApplication());
                image.setImageResource(R.drawable.logo4_real);

                AlertDialog.Builder builder =
                        new AlertDialog.Builder(logo.this).

                                setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                }).
                                setView(image);
                builder.create().show();
            }
        });
        i4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                startActivity(new Intent(logo.this, logo4.class));

                return true;
            }
        });


    }
}
