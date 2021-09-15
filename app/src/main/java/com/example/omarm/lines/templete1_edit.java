package com.example.omarm.lines;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class templete1_edit extends AppCompatActivity {

    Button s;
    Boolean x=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_templete1_edit);

        s=(Button)findViewById(R.id.save);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(templete1_edit.this, final_order.class));

            }
        });
    }

   /* @Override
    public void onBackPressed() {


       AlertDialog.Builder msg=new AlertDialog.Builder(templete1_edit.this);
        msg.setMessage("Do you want to save changes");
        msg.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                startActivity(new Intent(templete1_edit.this, final_order.class));

            }
        });
        msg.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                x=true;

               }
        });
        msg.create();
        msg.show();


        if(x)
        super.onBackPressed();




    }*/
}
