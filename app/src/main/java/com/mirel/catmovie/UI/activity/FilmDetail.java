package com.mirel.catmovie.UI.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ImageButton;

import android.widget.TextView;

import com.mirel.catmovie.R;
import com.mirel.catmovie.data.Film;
import com.mirel.catmovie.viewmodel.model_detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;



public class FilmDetail extends AppCompatActivity {

    public static final String EXTRA_FILMS = "extra_films";


    private ImageView gmbarposter;
    private TextView tividesk;
    private TextView tivijudul;

////////////////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layar_detail);
////////////////////////////////////
        //viewModel
        model_detail viewModel = ViewModelProviders.of(this).get(model_detail.class);

        //init views
        ImageButton btnBack = findViewById(R.id.kembali);

////////////////////////////////////
        gmbarposter = findViewById(R.id.gambar_po);
        tivijudul = findViewById(R.id.tv_judul);
        tividesk = findViewById(R.id.tv_dek);


        //btnBackOnClick
        btnBack.setOnClickListener(v -> {
            onBackPressed();
            finish();
        });


////////////////////////////////////
        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            String movieId = extras.getString(EXTRA_FILMS);

            if (movieId != null) {
                viewModel.setId_film(movieId);
            }
            if (viewModel.getFilm() != null) {
                makeView(viewModel.getFilm());
            }

        }
    }

///////////////////////////////////
    private void makeView(Film film) {


        tividesk.setText(film.getDek());
        gmbarposter.setImageResource(film.getgambar());

        tivijudul.setText(film.getjudul());
    }
}
