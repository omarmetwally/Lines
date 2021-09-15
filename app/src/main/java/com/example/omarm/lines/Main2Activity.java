package com.example.omarm.lines;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
Spinner sn;
    List<String> lstspinner=new ArrayList<String>();
    List<String> lstspinnerid=new ArrayList<String>();
    ArrayAdapter adapterspinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);

        sn = (Spinner) findViewById(R.id.spn);
        lstspinner.add("Please choose the Category");
        lstspinner.add("Restaurants and Cafes");
        //lstspinnerid.add("0");
        lstspinner.add("Banking and Financial Institutions");
        //lstspinnerid.add("1");
        lstspinner.add("Traning and Education");
        //lstspinnerid.add("2");
        lstspinner.add("Travel and Transportation");
       // lstspinnerid.add("3");
        lstspinner.add("Real Tstate and Development");
       // lstspinnerid.add("4");
        lstspinner.add("Media and Tv");
        //lstspinnerid.add("5");
        adapterspinner = new ArrayAdapter(Main2Activity.this, android.R.layout.simple_spinner_dropdown_item, lstspinner);
        sn.setAdapter(adapterspinner);

        sn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case(1):
                        startActivity(new Intent(Main2Activity.this, Resturant.class));
                    break;
                    case(2):
                        startActivity(new Intent(Main2Activity.this, Banking.class));
                        break;
                    case(3):
                        startActivity(new Intent(Main2Activity.this, Traning.class));
                        break;
                    case(4):
                        startActivity(new Intent(Main2Activity.this, Travel.class));
                        break;
                    case(5):
                        startActivity(new Intent(Main2Activity.this, Real.class));
                        break;
                    case(6):
                        startActivity(new Intent(Main2Activity.this, Media.class));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }
}
