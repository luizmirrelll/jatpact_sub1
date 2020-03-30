package com.mirel.catmovie.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mirel.catmovie.R;
import com.mirel.catmovie.data.Film;
import com.mirel.catmovie.UI.activity.FilmDetail;

import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.MyViewHolder> {

///////////////////////////
    private ArrayList<Film> list_film;
    private final Activity activity;

    public FilmAdapter(Activity activity) {

        this.activity = activity;
    }

    public void setMovieList(ArrayList<Film> list_film) {

        this.list_film = list_film;
    }

    private ArrayList<Film> getFilmList() {

        return list_film;
    }


//////////////////////////
    @NonNull
    @Override
    public FilmAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.tipe_rv, viewGroup, false);

        return new MyViewHolder(view);
    }
/////////////////////
    @Override
    public void onBindViewHolder(@NonNull FilmAdapter.MyViewHolder holder, int i) {

        holder.film_des.setText(list_film.get(i).getDek());
        holder.film_judul.setText(list_film.get(i).getjudul());
        holder.gmbar_film.setImageResource(list_film.get(i).getgambar());
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(activity, FilmDetail.class);
            intent.putExtra(FilmDetail.EXTRA_FILMS, getFilmList().get(i).getidfilm());
            activity.startActivity(intent);

        });

    }
///////////////////////
    @Override
    public int getItemCount() {
        return list_film.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView film_des;
        ImageView gmbar_film;
        TextView film_judul;

/////////////////////////
        MyViewHolder(View view) {
            super(view);

            film_des = itemView.findViewById(R.id.tv_dek);
            film_judul = itemView.findViewById(R.id.tv_judul);
            gmbar_film = itemView.findViewById(R.id.iv_gambar);

        }
    }
}