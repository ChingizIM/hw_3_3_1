package com.example.hw_3_3_1;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);

        ArrayList<Person> namess = new ArrayList<>();
        namess.add(new Person("Isabel", "First Daughter", "Park Avenue 1154"));
        namess.add(new Person("Shirin", "Second Daughter", "St. Mark’s Place 543"));
        namess.add(new Person("SainHan", "First Son", "Broadway 8764"));

        NameAdapter adapter = new NameAdapter(namess);
        recyclerView.setAdapter(adapter);
    }
}