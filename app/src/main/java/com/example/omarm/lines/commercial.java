package com.example.omarm.lines;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class commercial extends AppCompatActivity {

    ImageView i,i2,i3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_commercial);
        AlertDialog.Builder b = new AlertDialog.Builder(commercial.this).setMessage("Short Click to View the Design\nLong Click to Edit the Design").setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        b.create();
        b.show();

        i=(ImageView)findViewById(R.id.desOne);
        i2=(ImageView)findViewById(R.id.dess2);
        i3=(ImageView)findViewById(R.id.dess3);


        i.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                startActivity(new Intent(commercial.this, Des1com.class));

                return true;
            }
        });


        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image = new ImageView(getApplication());
                image.setImageResource(R.drawable.des1_real);

                AlertDialog.Builder builder =
                        new AlertDialog.Builder(commercial.this).

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
                startActivity(new Intent(commercial.this, des2_comm.class));

                return true;
            }
        });


        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image = new ImageView(getApplication());
                image.setImageResource(R.drawable.des2_real);

                AlertDialog.Builder builder =
                        new AlertDialog.Builder(commercial.this).

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
                startActivity(new Intent(commercial.this, des3_comm.class));

                return true;
            }
        });


        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image = new ImageView(getApplication());
                image.setImageResource(R.drawable.des3_real);

                AlertDialog.Builder builder =
                        new AlertDialog.Builder(commercial.this).

                                setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                }).
                                setView(image);
                builder.create().show();
            }
        });
    }
}
