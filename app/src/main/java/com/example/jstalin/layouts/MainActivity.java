package com.example.jstalin.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void boton1(View view){
        Intent i = new Intent(this, RealtiveLayout1.class);
        startActivity(i);
    }

    public void boton2(View view){
        Intent i = new Intent(this, TableLayout1.class);
        startActivity(i);
    }


    public void boton3(View view){
        Intent i = new Intent(this, LinearLayout1.class);
        startActivity(i);
    }



}
