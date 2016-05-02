package com.cristian.curso3_tp1;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asusn56 on 02/05/16.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MascotaViewHolder>{

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView mascotaName;
        TextView mascotaRanting;
        ImageView mascotaPhoto;

        MascotaViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            mascotaName = (TextView)itemView.findViewById(R.id.nombre_perro);
            mascotaRanting = (TextView)itemView.findViewById(R.id.rating);
            mascotaPhoto = (ImageView)itemView.findViewById(R.id.imagenPerro);
        }
    }
    ArrayList<Mascota> mascotas;

    RVAdapter(ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;
    }
    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_mascota, viewGroup, false);
        MascotaViewHolder pvh = new MascotaViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int i) {
        mascotaViewHolder.mascotaName.setText(mascotas.get(i).getNombre());
        mascotaViewHolder.mascotaRanting.setText(String.valueOf(mascotas.get(i).getRanting()));
        mascotaViewHolder.mascotaPhoto.setImageResource(mascotas.get(i).getImagen());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}