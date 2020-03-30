package com.mirel.catmovie.UI.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.mirel.catmovie.R;
import com.mirel.catmovie.adapter.FilmAdapter;
import com.mirel.catmovie.data.Film;
import com.mirel.catmovie.viewmodel.model_films;

import java.util.ArrayList;

public class F_film extends Fragment {

    private RecyclerView lihat_recley;


    @Override
    public void onViewCreated(
            @NonNull View view,
            @Nullable Bundle savedInstanceState) {
        super.onViewCreated(
                view, savedInstanceState
        );
        ////////////////////////////
        lihat_recley = view.findViewById(
                R.id.film_rv
        );
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.film_bagian, container, false);
    }


//////////////////////////////////////////////////
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (
                getActivity() != null
        ) {


/////////////////////////////////////////////////
            //define viewModel
            model_films mViewModel = ViewModelProviders.of(this).get(model_films.class);
            ArrayList<Film> films = mViewModel.getFilm();



//////////////////////////////////////////////////////////
            //adapter
            FilmAdapter filmAdapter = new FilmAdapter(getActivity());
            filmAdapter.setMovieList(films);


/////////////////////////////////////////////////
            //recyclerView
            lihat_recley.setLayoutManager(new GridLayoutManager(getContext(), 2));
            lihat_recley.setHasFixedSize(true);
            lihat_recley.setAdapter(filmAdapter);


        }
    }

}
