package com.mirel.catmovie.utils;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.ViewAssertion;

import static junit.framework.TestCase.assertNotNull;
import static androidx.test.espresso.matcher.ViewMatchers.assertThat;
import static org.hamcrest.Matchers.is;

public class viewitem implements ViewAssertion {
    private final int expectedCount;

    public viewitem(int expectedCount) {

        this.expectedCount = expectedCount;
    }

    @Override
    public void check(View view, NoMatchingViewException noViewFoundException) {
        if (noViewFoundException != null) {
            throw noViewFoundException;
        }

        RecyclerView recyclerView = (RecyclerView) view;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        assertNotNull(adapter);
        assertThat(adapter.getItemCount(), is(expectedCount));

    }
}