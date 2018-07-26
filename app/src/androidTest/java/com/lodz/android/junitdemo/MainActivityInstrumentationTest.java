package com.lodz.android.junitdemo;


import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;

import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * Created by zhouL on 2018/7/25.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentationTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityInstrumentationTest() {
        super(MainActivity.class);
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
    }

    @Test
    public void onCreate() {
        getActivity();
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

        Espresso.onView(ViewMatchers.withId(R.id.input_edit))
                .perform(ViewActions.typeText("abc123"), ViewActions.closeSoftKeyboard());

        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

        Espresso.onView(ViewMatchers.withText("OK"))
                .perform(ViewActions.click());

        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

        String expectedText  = "result : abc123";
        Espresso.onView(ViewMatchers.withId(R.id.result_tv))
                .check(ViewAssertions.matches(ViewMatchers.withText(expectedText)));
    }

}