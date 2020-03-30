package com.mirel.catmovie.viewmodel;

import com.mirel.catmovie.R;
import com.mirel.catmovie.data.Film;
import com.mirel.catmovie.data.TiviLoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class modeldetailTest {
    private model_detail detail;
    private Film film;
    private TiviLoc tivi;

    @Before
    public void setUp() {
        detail = new model_detail();
        film = new Film("1",
                "Avengers: Infinity War (2018)",
                "Ketika Avengers dan sekutu mereka terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh satu pahlawan, bahaya baru telah muncul dari bayang-bayang kosmik: Thanos. Seorang lalim penghinaan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan tak terbayangkan, dan menggunakannya untuk menimbulkan keinginannya yang terpelintir pada semua kenyataan. Segala yang Avengers telah perjuangkan telah mengarah ke saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                R.drawable.poster_avengerinfinity);
        tivi = new TiviLoc("1",
                "Shameless (2011)",
                "Chicagoan Frank Gallagher adalah ayah tunggal yang bangga dari enam anak yang cerdas, rajin, mandiri, yang tanpanya mungkin lebih baik. Ketika Frank tidak di bar menghabiskan sedikit uang yang mereka miliki, dia pingsan di lantai. Tetapi anak-anak telah menemukan cara untuk tumbuh meskipun dia. Mereka mungkin tidak seperti keluarga yang Anda kenal, tetapi mereka tidak meminta maaf karena menjadi diri mereka yang sebenarnya.",
                R.drawable.poster_shameless);
    }

    @Test
    public void getFilm() {
        detail.setId_film(film.getidfilm());
        Film film = detail.getFilm();
        assertNotNull(film);
        assertEquals(film.getidfilm(), film.getidfilm());
        assertEquals(film.getDek(), film.getDek());
        assertEquals(film.getgambar(), film.getgambar());
        assertEquals(film.getjudul(), film.getjudul());

    }

    @Test
    public void getTivi() {
        detail.setId_tivi(tivi.getidtivi());
        TiviLoc tivi = detail.getTivi();
        assertNotNull(tivi);
        assertEquals(tivi.getidtivi(), tivi.getidtivi());
        assertEquals(tivi.getjudul(), tivi.getjudul());
        assertEquals(tivi.getDek(), tivi.getDek());
        assertEquals(tivi.getgmbar(), tivi.getgmbar());


    }

}