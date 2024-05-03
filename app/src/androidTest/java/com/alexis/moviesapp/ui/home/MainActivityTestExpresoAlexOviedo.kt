package com.alexis.moviesapp.ui.home


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.alexis.moviesapp.R
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTestExpresoAlexOviedo {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun mainActivityTestExpresoAlexOviedo() {
        val appCompatImageView = onView(
            allOf(
                withId(R.id.iv_poster_item_movie),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.rv_movies),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView.perform(click())

        val floatingActionButton = onView(
            allOf(
                withId(R.id.iv_bookmarked),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        floatingActionButton.perform(click())

        val floatingActionButton2 = onView(
            allOf(
                withId(R.id.iv_back),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        floatingActionButton2.perform(click())

        val appCompatImageView2 = onView(
            allOf(
                withId(R.id.iv_poster_item_movie),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.rv_movies),
                        2
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView2.perform(click())

        val floatingActionButton3 = onView(
            allOf(
                withId(R.id.iv_bookmarked),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        floatingActionButton3.perform(click())

        val floatingActionButton4 = onView(
            allOf(
                withId(R.id.iv_back),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        floatingActionButton4.perform(click())

        val appCompatImageView3 = onView(
            allOf(
                withId(R.id.iv_poster_item_movie),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.rv_movies),
                        2
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView3.perform(click())

        val floatingActionButton5 = onView(
            allOf(
                withId(R.id.iv_bookmarked),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        floatingActionButton5.perform(click())

        val floatingActionButton6 = onView(
            allOf(
                withId(R.id.iv_back),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        floatingActionButton6.perform(click())

        val appCompatImageView4 = onView(
            allOf(
                withId(R.id.iv_poster_item_movie),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.rv_movies),
                        5
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView4.perform(click())

        val floatingActionButton7 = onView(
            allOf(
                withId(R.id.iv_bookmarked),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        floatingActionButton7.perform(click())

        val floatingActionButton8 = onView(
            allOf(
                withId(R.id.iv_back),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        floatingActionButton8.perform(click())

        val bottomNavigationItemView = onView(
            allOf(
                withId(R.id.bookmarkedFragment), withContentDescription("Bookmarked"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.bottom_navigation_menu),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        bottomNavigationItemView.perform(click())

        val appCompatImageView5 = onView(
            allOf(
                withId(R.id.iv_poster_item_movie),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.rv_movies_bookmarked),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView5.perform(click())

        val floatingActionButton9 = onView(
            allOf(
                withId(R.id.iv_bookmarked),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        floatingActionButton9.perform(click())

        val floatingActionButton10 = onView(
            allOf(
                withId(R.id.iv_back),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        floatingActionButton10.perform(click())

        val appCompatImageView6 = onView(
            allOf(
                withId(R.id.iv_poster_item_movie),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.rv_movies_bookmarked),
                        2
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView6.perform(click())

        val floatingActionButton11 = onView(
            allOf(
                withId(R.id.iv_bookmarked),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        floatingActionButton11.perform(click())

        val floatingActionButton12 = onView(
            allOf(
                withId(R.id.iv_back),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        floatingActionButton12.perform(click())

        val appCompatImageView7 = onView(
            allOf(
                withId(R.id.iv_poster_item_movie),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.rv_movies_bookmarked),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView7.perform(click())

        val floatingActionButton13 = onView(
            allOf(
                withId(R.id.iv_bookmarked),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        floatingActionButton13.perform(click())

        val floatingActionButton14 = onView(
            allOf(
                withId(R.id.iv_back),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        floatingActionButton14.perform(click())

        val appCompatImageView8 = onView(
            allOf(
                withId(R.id.iv_poster_item_movie),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.rv_movies_bookmarked),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView8.perform(click())

        val floatingActionButton15 = onView(
            allOf(
                withId(R.id.iv_bookmarked),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        floatingActionButton15.perform(click())

        val floatingActionButton16 = onView(
            allOf(
                withId(R.id.iv_back),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        floatingActionButton16.perform(click())

        val bottomNavigationItemView2 = onView(
            allOf(
                withId(R.id.movieFragment), withContentDescription("Movies"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.bottom_navigation_menu),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        bottomNavigationItemView2.perform(click())

        val appCompatImageView9 = onView(
            allOf(
                withId(R.id.iv_poster_item_movie),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.rv_movies),
                        3
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView9.perform(click())

        val floatingActionButton17 = onView(
            allOf(
                withId(R.id.iv_bookmarked),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        floatingActionButton17.perform(click())

        val floatingActionButton18 = onView(
            allOf(
                withId(R.id.iv_back),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        floatingActionButton18.perform(click())
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}
