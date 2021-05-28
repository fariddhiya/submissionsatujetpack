package com.dicoding.imbb

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.imbb.utils.DataDummy
import org.junit.Rule
import org.junit.Test


class MainActivityTest {

    private val dummyMovie = DataDummy.generateDummyMovie()
    private val dummyTvShow = DataDummy.generateDummyTvShow()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovie() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadDetailMovie(){
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.text_description)).check(matches(isDisplayed()))
        onView(withId(R.id.text_description)).check(matches(withText(dummyMovie[0].description)))
        onView(withId(R.id.text_director)).check(matches(isDisplayed()))
        onView(withId(R.id.text_director)).check(matches(withText(dummyMovie[0].director)))
        onView(withId(R.id.text_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.text_duration)).check(matches(withText(dummyMovie[0].duration)))
        onView(withId(R.id.text_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.text_genre)).check(matches(withText(dummyMovie[0].genre)))
        onView(withId(R.id.text_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.text_rating)).check(matches(withText(dummyMovie[0].rating)))
        onView(withId(R.id.text_rating_user)).check(matches(isDisplayed()))
        onView(withId(R.id.text_rating_user)).check(matches(withText(dummyMovie[0].ratingUser)))
        onView(withId(R.id.text_title)).check(matches(isDisplayed()))
        onView(withId(R.id.text_title)).check(matches(withText(dummyMovie[0].title)))
        onView(withId(R.id.text_writer)).check(matches(isDisplayed()))
        onView(withId(R.id.text_writer)).check(matches(withText(dummyMovie[0].writer)))
    }

    @Test
    fun loadTvShow(){
        onView(withId(R.id.navigation_tvseries)).perform(click())
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }

    @Test
    fun loadDetailTvShow(){
        onView(withId(R.id.navigation_tvseries)).perform(click())
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.text_description)).check(matches(isDisplayed()))
        onView(withId(R.id.text_description)).check(matches(withText(dummyTvShow[0].description)))
        onView(withId(R.id.text_director)).check(matches(isDisplayed()))
        onView(withId(R.id.text_director)).check(matches(withText(dummyTvShow[0].director)))
        onView(withId(R.id.text_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.text_duration)).check(matches(withText(dummyTvShow[0].duration)))
        onView(withId(R.id.text_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.text_genre)).check(matches(withText(dummyTvShow[0].genre)))
        onView(withId(R.id.text_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.text_rating)).check(matches(withText(dummyTvShow[0].rating)))
        onView(withId(R.id.text_rating_user)).check(matches(isDisplayed()))
        onView(withId(R.id.text_rating_user)).check(matches(withText(dummyTvShow[0].ratingUser)))
        onView(withId(R.id.text_title)).check(matches(isDisplayed()))
        onView(withId(R.id.text_title)).check(matches(withText(dummyTvShow[0].title)))
        onView(withId(R.id.text_year)).check(matches(isDisplayed()))
        onView(withId(R.id.text_year)).check(matches(withText(dummyTvShow[0].year)))
        onView(withId(R.id.text_season)).check(matches(isDisplayed()))
        onView(withId(R.id.text_season)).check(matches(withText(dummyTvShow[0].season)))
        onView(withId(R.id.text_episode)).check(matches(isDisplayed()))
        onView(withId(R.id.text_episode)).check(matches(withText(dummyTvShow[0].episode)))
    }
}