package com.mirel.catmovie.UI.activity;

import android.content.Context;
import android.content.Intent;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import com.mirel.catmovie.R;
import com.mirel.catmovie.data.TiviLoc;
import com.mirel.catmovie.utils.data;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.assertion.ViewAssertions.matches;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class TiviDetailTest {
    private TiviLoc dum = data.generateDummyTivi().get(0);

    @Rule
    public ActivityTestRule<TiviDetail> activityRule = new ActivityTestRule<TiviDetail>(TiviDetail.class) {
        @Override
        protected Intent getActivityIntent() {
            Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
            Intent result = new Intent(targetContext, TiviDetail.class);
            result.putExtra(TiviDetail.EXTRA_TIVI, dum.getidtivi());
            return result;
        }
    };

    @Test
    public void loadTv() {
        onView(withId(R.id.tv_judul)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_dek)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_judul)).check(matches(withText(dum.getjudul())));
        onView(withId(R.id.tv_dek)).check(matches(withText(dum.getDek())));
        onView(withId(R.id.iv_gambar)).check(doesNotExist());
    }


}