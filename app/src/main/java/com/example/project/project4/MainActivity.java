package com.example.project.project4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView browse = (ImageView) findViewById(R.id.logo);

        browse.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent collectionIntent = new Intent(MainActivity.this, Items.class);
                startActivity(collectionIntent);
            }
        });
    }


}
