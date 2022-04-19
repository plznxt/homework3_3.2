package com.geektechhw.homework3_32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> characters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        loadData();
        CharactersAdapter adapter = new CharactersAdapter(characters);
        recyclerView.setAdapter(adapter);
    }
    private void loadData(){
        characters = new ArrayList<>();
        characters.add("char");
        characters.add("char1");
        characters.add("char2");
        characters.add("char3");
        characters.add("char4");
        characters.add("char5");
        characters.add("char6");
        characters.add("char7");
        characters.add("char8");
        characters.add("char9");
        characters.add("char10");
        characters.add("char11");
        characters.add("char12");
        characters.add("char13");
        characters.add("char14");
        characters.add("char15");
        characters.add("char16");
        characters.add("char17");
    }
}