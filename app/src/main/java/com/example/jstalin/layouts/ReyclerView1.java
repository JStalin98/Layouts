package com.example.jstalin.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ReyclerView1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reycler_view1);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        rv.setHasFixedSize(false);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        inicializarDatos();

        AdaptadorRV adaptador = new AdaptadorRV(personas);
        rv.setAdapter(adaptador);


    }

    class Persona {

        String nombre;
        String edad;
        int idFoto;

        public Persona(String nombre, String edad, int idFoto) {
            this.nombre = nombre;
            this.edad = edad;
            this.idFoto = idFoto;
        }

    }

    private List<Persona> personas;

    private void inicializarDatos() {

        personas = new ArrayList<>();

        personas.add(new Persona("Pedro", "23 años", R.drawable.foto_pedro));
        personas.add(new Persona("Carmen", "27 años", R.drawable.foto_carmen));
        personas.add(new Persona("Luis", "60 años", R.drawable.foto_luisjpg));

    }

}






