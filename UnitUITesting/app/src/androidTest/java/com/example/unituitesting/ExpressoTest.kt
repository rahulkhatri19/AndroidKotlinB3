package com.example.unituitesting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.unituitesting.uiTesting.EspressoTestActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.ext.junit.rules.activityScenarioRule

@RunWith(AndroidJUnit4::class)
class ExpressoTest {
    @get:Rule
    var activiScenario =  activityScenarioRule<EspressoTestActivity>()

    @Test
    fun changeText_sameActivity(){
        onView(withId(R.id.et_email)).perform(typeText("geekyant@gmail.com"))
        onView(withId(R.id.et_password)).perform(typeText("123456"))
        onView(withId(R.id.btn_login)).perform(click())

    }
}