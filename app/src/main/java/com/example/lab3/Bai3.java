package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Bai3 extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<Movies> dataMovies = new ArrayList<>();
    CusAdapterMovieRecyclerView adapterMovieRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        rv = (RecyclerView) findViewById(R.id.rv);
        //----------------------------------------
        initData();

        adapterMovieRecyclerView = new CusAdapterMovieRecyclerView(dataMovies);

        rv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, true);
        GridLayoutManager layoutManager2 = new GridLayoutManager(this, 1, RecyclerView.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        rv.setLayoutManager(layoutManager2);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(adapterMovieRecyclerView);
    }
    void initData() {
        dataMovies.add(new Movies("Avengers: Endgame", "Action", "2019"));
        dataMovies.add(new Movies("Avatar", "Adventure", "2009"));
        dataMovies.add(new Movies("Titanic", "Drama", "1997"));
        dataMovies.add(new Movies("Star Wars: The Force Awakens", "Action", "2015"));
        dataMovies.add(new Movies("Avengers: Infinity War", "Action", "2018"));
        dataMovies.add(new Movies("Jurassic World", "Action", "2015"));
        dataMovies.add(new Movies("The Lion King", "Animation", "1994"));
        dataMovies.add(new Movies("The Dark Knight", "Action", "2008"));
        dataMovies.add(new Movies("Frozen", "Animation", "2013"));
        dataMovies.add(new Movies("Beauty and the Beast", "Fantasy", "2017"));
        dataMovies.add(new Movies("Incredibles 2", "Animation", "2018"));
        dataMovies.add(new Movies("Iron Man 3", "Action", "2013"));
        dataMovies.add(new Movies("Minions", "Animation", "2015"));
        dataMovies.add(new Movies("Aquaman", "Action", "2018"));
        dataMovies.add(new Movies("Spider-Man: Far From Home", "Action", "2019"));
        dataMovies.add(new Movies("Harry Potter and the Deathly Hallows – Part 2", "Fantasy", "2011"));
        dataMovies.add(new Movies("The Lord of the Rings: The Return of the King", "Adventure", "2003"));
        dataMovies.add(new Movies("Toy Story 4", "Animation", "2019"));
        dataMovies.add(new Movies("Joker", "Crime", "2019"));
        dataMovies.add(new Movies("Finding Dory", "Animation", "2016"));
    }
}