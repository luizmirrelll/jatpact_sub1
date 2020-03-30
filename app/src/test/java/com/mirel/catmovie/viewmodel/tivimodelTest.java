package com.mirel.catmovie.viewmodel;

import com.mirel.catmovie.data.TiviLoc;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class tivimodelTest {
    private tivi_model viewModel;

    @Test
    public void getTivi() {
        List<TiviLoc> tvList = viewModel.getTv();
        assertNotNull(tvList);
        assertEquals(10, tvList.size());
    }
    @Before
    public void settest() {
        viewModel = new tivi_model();
    }


}