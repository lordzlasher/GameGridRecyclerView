package com.example.gamerecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterRecylerView adapterRecylerView;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ItemModel> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);

        data = new ArrayList<>();
        for (int i = 0; i < GameData.gameNames.length; i++){
            data.add(new ItemModel(
                    GameData.gameNames[i],
                    GameData.gameYear[i],
                    GameData.gameDetail[i],
                    GameData.gameImages[i]
            ));
        }

        adapterRecylerView = new AdapterRecylerView(data);
        recyclerView.setAdapter(adapterRecylerView);
    }
}