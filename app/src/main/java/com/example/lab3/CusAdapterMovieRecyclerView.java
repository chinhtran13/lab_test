package com.example.lab3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CusAdapterMovieRecyclerView extends RecyclerView.Adapter<CusAdapterMovieRecyclerView.MyViewHolder> {

    ArrayList<Movies> dataMovies = new ArrayList<>();

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_movies_list, null, true);
        return new MyViewHolder(itemView);
    }
    public CusAdapterMovieRecyclerView(ArrayList<Movies> dataMovies) {
        this.dataMovies = dataMovies;
    }
    @Override
    public void onBindViewHolder(@NonNull CusAdapterMovieRecyclerView.MyViewHolder holder, int position) {
        Movies movies = dataMovies.get(position);
        holder.title.setText(movies.getTitle());
        holder.fprodencer.setText(movies.getFproducer());
        holder.year.setText(movies.getYear());
    }

    @Override
    public int getItemCount() {
        return dataMovies.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title, fprodencer, year;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.tvTitle);
            fprodencer = (TextView) itemView.findViewById(R.id.tvFproducer);
            year = (TextView) itemView.findViewById(R.id.tvYear);
        }
    }
}
