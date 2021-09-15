package com.example.omarm.lines;

import android.content.Context;
import android.os.StrictMode;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    Connection conn=null;

    public Connection ConnectDB(Context Activity)
    {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:jtds:sqlserver://SQL7003.site4now.net/DB_A3F601_omarmetwally","DB_A3F601_omarmetwally_admin","12345787898omar");

        } catch (ClassNotFoundException e) {
            //Toast.makeText(Activity,"Driver "+e.getMessage(),Toast.LENGTH_LONG).show();

            e.printStackTrace();
        } catch (SQLException e) {
           // Toast.makeText(Activity,"Database "+e.getMessage(),Toast.LENGTH_LONG).show();

            e.printStackTrace();
        }
        return conn;
    }

    public String RunDML(String st,Context activity)
    {
        String result=null;
        try {
            Statement statement=conn.createStatement();
            statement.executeUpdate(st);
            result="ok";

        } catch (SQLException e) {
            Toast.makeText(activity,e.getMessage(),Toast.LENGTH_LONG).show();
            e.printStackTrace();
            result= e.getMessage();
        }
        return result;

    }
    public ResultSet RunSearch(String st)
    {
        ResultSet result=null;
        try {
            Statement statement=conn.createStatement();
            result=statement.executeQuery(st);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  result;

    }












}
