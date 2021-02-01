package com.example.new_recycler_view;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AnimeListAdapter animeListAdapter;
    ArrayList<Anime> animeList;
    private RecyclerView.LayoutManager linearLayoutManager, gridLayoutManager;
    Boolean layoutType = false;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recyclerView = findViewById(R.id.recyclerView);
        animeList = new ArrayList<>();
        animeListAdapter = new AnimeListAdapter(animeList, this);
        linearLayoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(animeListAdapter);

        animeList.add(new Anime(R.drawable.naruto, "Naruto", "anime", "senen", 205));
        animeList.add(new Anime(R.drawable.hunter, "HunterXHunter", "manga", "sci-fi", 307));
        animeList.add(new Anime(R.drawable.bleach, "Bleach", "manga", "romantic", 442));
        animeList.add(new Anime(R.drawable.onepunch, "OnePunchMan", "anime", "senen", 704));
        animeList.add(new Anime(R.drawable.fullmetal, "FMA", "manga", "ramen", 992));
        animeList.add(new Anime(R.drawable.sao, "SAO", "anime", "fantasy", 301));

    }
}