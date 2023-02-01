package com.example.turistiando;

import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.viewHolder>{

    //atributos
    public ArrayList<Hotel> listaHoteles;

    //constructor


    public Adaptador(ArrayList<Hotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    public class viewHolder {
    }
}
