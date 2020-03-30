package com.mirel.catmovie.UI.fragment;

import androidx.test.rule.ActivityTestRule;

import com.mirel.catmovie.R;
import com.mirel.catmovie.testing.SingleFragmentActivity;
import com.mirel.catmovie.utils.viewitem;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;



public class FtiviTest {
    @Rule
    public ActivityTestRule<SingleFragmentActivity> activityRule = new ActivityTestRule<>(SingleFragmentActivity.class);
    private F_tivi ftivi = new F_tivi();

    @Test
    public void loadCourses() {
        onView(withId(R.id.tivi)).check(matches(isDisplayed()));
        onView(withId(R.id.tivi)).check(new viewitem(10));
    }
    @Before
    public void setUp() {
        activityRule.getActivity().setFragment(ftivi);
    }


}