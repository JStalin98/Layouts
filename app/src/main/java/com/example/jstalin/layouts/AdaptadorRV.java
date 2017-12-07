package com.example.jstalin.layouts;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by JStalin on 07/12/2017.
 */

public class AdaptadorRV extends RecyclerView.Adapter<AdaptadorRV.PersonaViewHolder> {

    @Override
    public PersonaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_view1, parent, false);
        PersonaViewHolder pvh = new PersonaViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonaViewHolder holder, int position) {
        holder.nombrePersona.setText(personas.get(position).nombre);
        holder.edadPersona.setText(personas.get(position).edad);
        holder.fotoPersona.setImageResource(personas.get(position).idFoto);
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return personas.size();
    }

    public static class PersonaViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView nombrePersona;
        TextView edadPersona;
        ImageView fotoPersona;

        PersonaViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            nombrePersona = (TextView)itemView.findViewById(R.id.nombre_persona);
            edadPersona = (TextView)itemView.findViewById(R.id.edad_persona);
           fotoPersona = (ImageView)itemView.findViewById(R.id.foto_persona);
        }



    }

    List<ReyclerView1.Persona> personas;

    AdaptadorRV(List<ReyclerView1.Persona> personas){
        this.personas = personas;
    }

}
