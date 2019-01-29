package com.example.project.project4;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Soundtrack3 extends AppCompatActivity {
    public MediaPlayer soundtrack1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soundtrack);
        ImageView poster = (ImageView) findViewById(R.id.poster);
        poster.setImageResource(R.drawable.inception);
        TextView info = (TextView) findViewById(R.id.info);
        info.setText(R.string.inception);
        ImageView play = (ImageView) findViewById(R.id.play);

// Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                soundtrack1 = MediaPlayer.create(getApplicationContext(), R.raw.inception);
                soundtrack1.start();
            }
        });
        ImageView stop = (ImageView) findViewById(R.id.stop);

// Set a click listener on that View
        stop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                soundtrack1.stop();
            }
        });
        ImageView back = (ImageView) findViewById(R.id.back);

// Set a click listener on that View
        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                soundtrack1.stop();
                Intent collectionIntent = new Intent(Soundtrack3.this, Items.class);
                startActivity(collectionIntent);
            }
        });
    }
}



