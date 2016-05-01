package com.cristian.curso3_tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    ArrayList mascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar miActionBar= (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        ((TextView) findViewById(R.id.toolbar_title)).setText("Pentagram");

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Mascota 1",0,R.drawable.perro1));
        mascotas.add(new Mascota("Mascota 2",0,R.drawable.perro2));
        mascotas.add(new Mascota("Mascota 3",0,R.drawable.perro3));
        mascotas.add(new Mascota("Mascota 4",0,R.drawable.perro4));

        ArrayList nombre_mascota=new ArrayList<String>();


        for(Iterator<Mascota> i = mascotas.iterator(); i.hasNext(); ) {
            nombre_mascota.add(i.next().getNombre());
        }

        ListView lstMascota= (ListView)findViewById(R.id.listView);
        lstMascota.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nombre_mascota));


    }

    public void irDetalle(View v){
        Intent intent= new Intent(this,Detalle.class);
        startActivity(intent);

    }
}