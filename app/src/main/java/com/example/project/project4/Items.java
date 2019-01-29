package com.example.project.project4;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Items extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collection);

        ArrayList<Collection> items = new ArrayList<Collection>();
        items.add(new Collection(R.drawable.tlou, "THE LAST OF US"));
        items.add(new Collection(R.drawable.hp, "Harry Potter"));
        items.add(new Collection(R.drawable.inception, "Inception"));
        items.add(new Collection(R.drawable.lis, "Life is strange"));
        items.add(new Collection(R.drawable.interstellar, "Interstellar"));

        CollectionAdapter adapter = new CollectionAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
                                                if (position == 0) {
                                                    Intent collectionIntent = new Intent(Items.this, Soundtrack1.class);
                                                    startActivity(collectionIntent);
                                                } else if (position == 1) {
                                                    Intent collectionIntent = new Intent(Items.this, Soundtrack2.class);
                                                    startActivity(collectionIntent);
                                                } else if (position == 2) {
                                                    Intent collectionIntent = new Intent(Items.this, Soundtrack3.class);
                                                    startActivity(collectionIntent);
                                                } else if (position == 3) {
                                                    Intent collectionIntent = new Intent(Items.this, Soundtrack4.class);
                                                    startActivity(collectionIntent);
                                                } else if (position == 4) {
                                                    Intent collectionIntent = new Intent(Items.this, Soundtrack5.class);
                                                    startActivity(collectionIntent);
                                                }
                                            }

                                        }
        );

    }
}