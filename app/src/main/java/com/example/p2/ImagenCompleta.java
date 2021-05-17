package com.example.p2;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.p2.adaptador.GaleriaFotosAdapter;

public class ImagenCompleta extends AppCompatActivity {

    ImageView imageView;
    GaleriaFotosAdapter galeriaFotosAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen_completa);

        imageView = (ImageView)findViewById(R.id.iv_foto);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Foto Completa");

        Intent intent = getIntent();
        int posicion = intent.getExtras().getInt("misImagenes");
        galeriaFotosAdapter = new GaleriaFotosAdapter(this);
        imageView.setImageResource(galeriaFotosAdapter.imageArray[posicion]);

    }
}