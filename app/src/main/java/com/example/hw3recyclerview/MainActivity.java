package com.example.hw3recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Countries> countries;
    RecyclerView recyclerView;
    CountryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createCountries();
        initViews();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recycler_view);
        adapter = new CountryAdapter();
        adapter.setlist(countries);
        recyclerView.setAdapter(adapter);
    }

    private void createCountries() {
        countries = new ArrayList<>();

        Countries argentina = new Countries("Argentina", "Buenos Aires", R.drawable.argentina);
        Countries australia = new Countries("Australia", "Canberra", R.drawable.australia);
        Countries china = new Countries("China", "Beijing", R.drawable.kyrgyzstan);
        Countries domba = new Countries("Domba", "Bomba", R.drawable.domba);
        Countries ecuador = new Countries("Ecuador", "Ecuador", R.drawable.ecuador);
        Countries ethiopia = new Countries("Ethiopia", "Ethiopia", R.drawable.ethiopia);
        Countries kazakhstan = new Countries("Kazakhstan", "Nursultan", R.drawable.kazakhstan);
        Countries kyrgyzstan = new Countries("Kyrgyzstan", "Bishkek", R.drawable.kyrgyzstan);
        Countries madagascar = new Countries("Madagascar", "Alex", R.drawable.madagascar);
        Countries romania = new Countries("Romania", "Bucharest", R.drawable.romania);

        countries.add(argentina);
        countries.add(australia);
        countries.add(domba);
        countries.add(china);
        countries.add(ecuador);
        countries.add(kazakhstan);
        countries.add(ethiopia);
        countries.add(kyrgyzstan);
        countries.add(madagascar);
        countries.add(romania);
        countries.add(kazakhstan);
        countries.add(romania);
        countries.add(ecuador);
        countries.add(argentina);
        countries.add(china);
    }
}