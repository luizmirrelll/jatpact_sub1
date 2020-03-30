package com.mirel.catmovie.UI.fragment;

import androidx.test.rule.ActivityTestRule;

import com.mirel.catmovie.R;
import com.mirel.catmovie.testing.SingleFragmentActivity;
import com.mirel.catmovie.utils.viewitem;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class FfilmTest {
    @Rule
    public ActivityTestRule<SingleFragmentActivity> activityRule = new ActivityTestRule<>(SingleFragmentActivity.class);
    private F_film ffilm = new F_film();

    @Before
    public void setUp() {
        activityRule.getActivity().setFragment(ffilm);
    }

    @Test
    public void loadCourses() {
        onView(withId(R.id.film_rv)).check(matches(isDisplayed()));
        onView(withId(R.id.film_rv)).check(new viewitem(10));
    }

}