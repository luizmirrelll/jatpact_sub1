package com.mirel.catmovie.viewmodel;

import androidx.lifecycle.ViewModel;

import com.mirel.catmovie.data.Film;
import com.mirel.catmovie.data.TiviLoc;
import com.mirel.catmovie.utils.data;

public class model_detail extends ViewModel {
    private TiviLoc modeltivi;
    private Film modelfilm;
    private String id_tivi;
    private String id_film;

    public Film getFilm() {
        for (int i = 0; i < data.generateDummyFilms().size(); i++) {


            Film film = data.generateDummyFilms().get(i);
            if (film.getidfilm().equals(id_film)) {
                modelfilm = film;
            }
        }
        return modelfilm;
    }

    public TiviLoc getTivi() {
        for (int i = 0; i < data.generateDummyTivi().size(); i++) {


            TiviLoc tivi = data.generateDummyTivi().get(i);
            if (tivi.getidtivi().equals(id_tivi)) {
                modeltivi = tivi;
            }
        }
        return modeltivi;
    }

    public String getId_film() {

        return id_film;
    }

    public void setId_film(String id_film) {

        this.id_film = id_film;
    }

    public String getId_tivi() {

        return id_tivi;
    }

    public void setId_tivi(String id_tivi) {

        this.id_tivi = id_tivi;
    }


}
