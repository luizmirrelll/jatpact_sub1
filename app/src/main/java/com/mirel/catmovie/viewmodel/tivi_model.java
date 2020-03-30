package com.mirel.catmovie.viewmodel;

import androidx.lifecycle.ViewModel;

import com.mirel.catmovie.data.TiviLoc;
import com.mirel.catmovie.utils.data;

import java.util.ArrayList;

public class tivi_model extends ViewModel {
    // TODO: Implement the ViewModel
    public ArrayList<TiviLoc> getTv() {
        return data.generateDummyTivi();
    }
}
