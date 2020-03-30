package com.mirel.catmovie.UI.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.mirel.catmovie.R;
import com.mirel.catmovie.UI.fragment.F_tivi;
import com.mirel.catmovie.UI.fragment.F_film;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.os.Bundle;



public class Navignasi extends AppCompatActivity {
//////////////////////////////////
    final Fragment film_fragment = new F_film();
    final FragmentManager nv = getSupportFragmentManager();
    final Fragment tivi_fragment = new F_tivi();
/////////////////////////////////////////////////
    Fragment aktivitas = film_fragment;
    private BottomNavigationView.OnNavigationItemSelectedListener NavigationItem
            = item -> {
        switch (item.getItemId()) {
            case R.id.Tombol_film:

                nv.beginTransaction().hide(aktivitas).show(film_fragment).commit();
                aktivitas = film_fragment;
                return true;

            case R.id.Tombol_tivi:

                nv.beginTransaction().hide(aktivitas).show(tivi_fragment).commit();
                aktivitas = tivi_fragment;
                return true;

        }
        return false;
    };
/////////////////////////////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigator_acc);

        BottomNavigationView navView = findViewById(R.id.bottom_navigation);
        navView.setOnNavigationItemSelectedListener(NavigationItem);

        nv.beginTransaction().add(R.id.nav_container, tivi_fragment, "Tv").hide(tivi_fragment).commit();
        nv.beginTransaction().add(R.id.nav_container, film_fragment, "Movie").commit();

    }

}
