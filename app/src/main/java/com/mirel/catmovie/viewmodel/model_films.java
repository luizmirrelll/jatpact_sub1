package com.mirel.catmovie.viewmodel;

import androidx.lifecycle.ViewModel;

import com.mirel.catmovie.data.Film;
import com.mirel.catmovie.utils.data;

import java.util.ArrayList;

public class model_films extends ViewModel {
    // TODO: Implement the ViewModel
    public ArrayList<Film> getFilm() {

        return data.generateDummyFilms();
    }
}
