package com.lodz.android.junitdemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by zhouL on 2018/7/25.
 */
public class CalcTest {

    private Calc mCalc;

    @Before
    public void setUp() throws Exception {
        mCalc = new Calc();
    }

    @Test
    public void sum() {
        Assert.assertEquals(6, mCalc.sum(1, 5));
    }

    @Test
    public void sub() {
        Assert.assertEquals(2, mCalc.sub(7, 5));
    }
}