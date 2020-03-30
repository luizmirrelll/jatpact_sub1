package com.mirel.catmovie.viewmodel;

import com.mirel.catmovie.data.Film;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class modelfilmsTest {
    private model_films viewModel;

    @Test
    public void getfilm() {
        List<Film> filmList = viewModel.getFilm();
        assertNotNull(filmList);
        assertEquals(10, filmList.size());
    }
    @Before
    public void setUp() {
        viewModel = new model_films();
    }


}