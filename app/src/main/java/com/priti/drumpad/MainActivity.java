package com.priti.drumpad;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    MediaPlayer n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.imageButton1);
        b2= findViewById(R.id.imageButton2);
        b3 = findViewById(R.id.imageButton3);
        b4 = findViewById(R.id.imageButton4);
        b5= findViewById(R.id.imageButton5);
        b6 = findViewById(R.id.imageButton6);
        b7= findViewById(R.id.imageButton7);
        b8 = findViewById(R.id.imageButton8);
        b9 = findViewById(R.id.imageButton9);
        b10= findViewById(R.id.imageButton10);
        b11= findViewById(R.id.imageButton11);
        b12= findViewById(R.id.imageButton12);

        n1 = MediaPlayer.create(this,R.raw.one);
        n2 = MediaPlayer.create(this,R.raw.two);
        n3 = MediaPlayer.create(this,R.raw.three);
        n4 = MediaPlayer.create(this,R.raw.four);
        n5 = MediaPlayer.create(this,R.raw.fv);
        n6 = MediaPlayer.create(this,R.raw.sixth);
        n7 = MediaPlayer.create(this,R.raw.seventh);
        n8 = MediaPlayer.create(this,R.raw.eighth);
        n9 = MediaPlayer.create(this,R.raw.guitar);
        n10 = MediaPlayer.create(this,R.raw.happy);
        n11 = MediaPlayer.create(this,R.raw.flute);
        n12 = MediaPlayer.create(this,R.raw.musical);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n1.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n2.start();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n3.start();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n4.start();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n5.start();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n6.start();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n7.start();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n8.start();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n9.start();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n10.start();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n11.start();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n12.start();
            }
        });


    }
}