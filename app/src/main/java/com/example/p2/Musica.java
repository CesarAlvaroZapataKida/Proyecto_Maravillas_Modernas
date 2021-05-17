package com.example.p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Musica extends AppCompatActivity {
    MediaPlayer musica;
    ImageButton btnplay,btnpause;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_musica);
        musica= MediaPlayer.create(this,R.raw.musica);
        btnpause = findViewById(R.id.btnpause);
        btnplay = findViewById(R.id.btnplay);
        btn1= findViewById(R.id.galeriabtn);

        //pause
        btnpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                musica.pause();

            }
        });


        //play
        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                musica.start();
            }
        });
        btn1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent llamar= getPackageManager().getLaunchIntentForPackage("com.android.camera2");
               startActivity(llamar);
            }
        }));


    }
}