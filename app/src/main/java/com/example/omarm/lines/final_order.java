package com.example.omarm.lines;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class final_order extends AppCompatActivity {

    int count=0,item=2;
    TextView v;
    Button inc,dec;
    EditText s;
    String num;
    View vshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_final_order);

        displayQuantity(count);




    }


    public  void dec(View view)
    {

        count--;

        if(count<0)
        {
            count=0;
            Toast.makeText(final_order.this,"can't be less than zero",Toast.LENGTH_SHORT).show();
        }

            displayQuantity(count);
        price();
    }
public  void inc(View view)
{
    count++;

    if(count>100)
    {
        count=100;
        Toast.makeText(final_order.this,"can't be more than 100",Toast.LENGTH_SHORT).show();
    }

        displayQuantity(count);
    price();
}


    public void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.countNum);
        quantityTextView.setText("" + number);
    }

    public void cc_number(final View view)
    {

       //
        LayoutInflater lay=LayoutInflater.from(final_order.this);
         vshow=lay.inflate(R.layout.credit,null);
        s=(EditText)vshow.findViewById(R.id.num_cc);
        AlertDialog.Builder builder =
                new AlertDialog.Builder(final_order.this);
        builder.setView(vshow);

        builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {



                num=s.getText().toString();
                view();

            }
        });
        builder.create();
        builder.show();







    }

    public void view()
    {
        TextView number = (TextView) findViewById(R.id.cc_num);
        number.setText("CC number :"+num);
    }
    public void dd(View view)
    {
        TextView number = (TextView) findViewById(R.id.cc_num);
        number.setText("");
    }

    public void price()
    {

        int price=0;
        price=item*count;
        TextView pric = (TextView) findViewById(R.id.price);
        pric.setText("" + price+" $");

    }

    public void done(View view)
    {
        RadioButton r1,r2;
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        EditText a,a1;
        a=(EditText)findViewById(R.id.address);
        a1=(EditText)findViewById(R.id.phone);

        if(count==0)
            Toast.makeText(this,"can't order 0 Quantity",Toast.LENGTH_SHORT).show();
        else if(!(r1.isChecked())&&!(r2.isChecked()))
            Toast.makeText(this,"please choose payment method",Toast.LENGTH_SHORT).show();
        else if(((a.getText().toString().trim().length()==0))||((a1.getText().toString().trim().length()==0)))
            Toast.makeText(this,"please fill the missing parts ",Toast.LENGTH_SHORT).show();
        else
        {
            Toast.makeText(this,"order successful ",Toast.LENGTH_LONG).show();

            startActivity(new Intent(final_order.this, Main3Activity.class));


        }






    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
