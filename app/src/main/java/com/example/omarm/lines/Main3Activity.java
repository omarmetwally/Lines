package com.example.omarm.lines;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main3Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageView indvidiual,company;
    String flos="omar";
    public Database db=new Database();
    public Connection con=db.ConnectDB(Main3Activity.this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main3);


        indvidiual=(ImageView)findViewById(R.id.ind);
        company=(ImageView)findViewById(R.id.coro);



        indvidiual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Database db=new Database();
               // Connection con=db.ConnectDB(Main3Activity.this);
                startActivity(new Intent(Main3Activity.this, Main2Activity.class));

             /*   if(con==null)
                    Toast.makeText(Main3Activity.this,"Check Your Internet",Toast.LENGTH_SHORT).show();
                else
                {
                    ResultSet rlogin=db.RunSearch("Select * from omar where lines='"+flos+"'");
                    try {
                        if(rlogin.next())
                        {
                            String status =rlogin.getString(3);
                            if(status.equals("1"))
                            {
                                startActivity(new Intent(Main3Activity.this, Main2Activity.class));

                            }
                        }
                        else
                        {
                            Toast.makeText(Main3Activity.this,"",Toast.LENGTH_SHORT).show();

                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }*/

            }
        });

        company.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Database db=new Database();
            //    Connection con=db.ConnectDB(Main3Activity.this);
                startActivity(new Intent(Main3Activity.this, Main2Activity.class));

              /*  if(con==null)
                    Toast.makeText(Main3Activity.this,"Check your internet",Toast.LENGTH_SHORT).show();
                else
                {
                    ResultSet rlogin=db.RunSearch("Select * from omar where lines='"+flos+"'");
                    try {
                        if(rlogin.next())
                        {
                            String status =rlogin.getString(3);
                            if(status.equals("1"))
                            {
                                startActivity(new Intent(Main3Activity.this, Main2Activity.class));

                            }
                        }
                        else
                        {
                            Toast.makeText(Main3Activity.this,"",Toast.LENGTH_SHORT).show();

                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }*/


            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_my_orders) {
            // Handle the camera action
        } else if (id == R.id.nav_designs) {

        } else if (id == R.id.nav_my_account) {



            LayoutInflater lay=LayoutInflater.from(Main3Activity.this);
            View vshow = lay.inflate(R.layout.for_account_nav,null);
            AlertDialog.Builder msg=new AlertDialog.Builder(Main3Activity.this);
            msg.setView(vshow);
            msg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            msg.create();
            msg.show();


        }
        else if (id == R.id.nav_about_us) {



        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
