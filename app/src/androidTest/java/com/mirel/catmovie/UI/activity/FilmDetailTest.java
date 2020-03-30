package com.mirel.catmovie.UI.activity;

import android.content.Context;
import android.content.Intent;

import com.mirel.catmovie.R;
import com.mirel.catmovie.data.Film;
import com.mirel.catmovie.utils.data;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;



import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
//sudah

public class FilmDetailTest {
    private Film dum = data.generateDummyFilms().get(0);

    @Rule
    public ActivityTestRule<FilmDetail> activityRule = new ActivityTestRule<FilmDetail>(FilmDetail.class) {
        @Override
        protected Intent getActivityIntent() {
            Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
            Intent result = new Intent(targetContext, FilmDetail.class);
            result.putExtra(FilmDetail.EXTRA_FILMS, dum.getidfilm());
            return result;
        }
    };

    @Test
    public void loadFilm() {

        onView(withId(R.id.tv_judul)).check(matches(withText(dummy.getjudul())));
        onView(withId(R.id.tv_dek)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_dek)).check(matches(withText(dummy.getDek())));
        onView(withId(R.id.iv_gambar)).check(doesNotExist());
        onView(withId(R.id.tv_judul)).check(matches(isDisplayed()));

    }

}