package com.example.jstalin.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
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

    public void boton4(View view){
        Intent i = new Intent(this, GridLayout1.class);
        startActivity(i);
    }

    public void boton5(View view){
        Intent i = new Intent(this, ConstraintLayout1.class);
        startActivity(i);
    }

    public void boton6(View view){
        Intent i = new Intent(this, CardView1.class);
        startActivity(i);
    }

    public void boton7(View view){
        Intent i = new Intent(this, ReyclerView1.class);
        startActivity(i);
    }

}
