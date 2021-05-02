package com.testmaximum.generics;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class testMaximum {
    /**
     * testcase when all integer has different value
     */
    @Test
    public void testCase1() {
        MaximumValue t = new MaximumValue();
        Integer max = t.findMax(1,2,3);
        Assert.assertSame(3, max);
    }

    /**
     * testcase when all elements have same value
     */
    @Test
    public void testCase2() {
        MaximumValue t = new MaximumValue();
        Integer max = t.findMax(9,9,9);
        Assert.assertSame(1, max);
    }

    /**
     * UC1.1, UC1.2 and UC1.3
     */
    @Test
    public void MaxValueAtFirstPosition() {
        MaximumValue t = new MaximumValue();
        Integer max = t.findMax(9,3,2);
        Assert.assertSame(9, max);
    }

    @Test
    public void MaxValueAtSecondPosition() {
        MaximumValue t = new MaximumValue();
        Integer max = t.findMax(3,7,2);
        Assert.assertSame(7, max);
    }

    @Test
    public void MaxValueAtThirdPosition() {
        MaximumValue t = new MaximumValue();
        Integer max = t.findMax(2,3,8);
        Assert.assertSame(8, max);
    }

    /**
     * UC2..testcases
     */
    @Test
    public void firstFloatMaxValueReturnFirst() {
        Float max = MaximumValue.findMax(9.01f, 6.01f, 3.01f);
        Assert.assertThat(max, CoreMatchers.equalTo(9.01f));
    }

    @Test
    public void secondFloatMaxValueReturnSecond() {
        Float max = MaximumValue.findMax(3.01f, 9.01f, 6.01f);
        Assert.assertThat(max, CoreMatchers.equalTo(9.01f));
    }

    @Test
    public void thirdFloatMaxValueReturnThird() {
        Float max = MaximumValue.findMax(6.01f, 3.01f, 9.01f);
        Assert.assertThat(max, CoreMatchers.equalTo(9.01f));
    }

    /**
     * UC3: testcases..
     */
    @Test
    public void firstStringMaxReturnFirst() {
        String max = MaximumValue.findMax("Girl","Boy","Animal");
        Assert.assertThat(max, CoreMatchers.equalTo("Girl"));
    }

    @Test
    public void secondStringMaxReturnSecond() {
        String max = MaximumValue.findMax("Boy","Girl","Animal");
        Assert.assertThat(max, CoreMatchers.equalTo("Girl"));
    }

    @Test
    public void thirdStringMaxReturnThird() {
        String max = MaximumValue.findMax("Boy","Animal","Girl");
        Assert.assertThat(max, CoreMatchers.equalTo("Girl"));
    }

    /**
     * After refactor the code : testcases
     */
    @Test
    public void ReturnMaxFloat() {
        Float max = MaximumValue.findAnyMax(9.01f, 6.01f, 3.01f);
        Assert.assertThat(max, CoreMatchers.equalTo(9.01f));
    }
    @Test
    public void ReturnMaxString() {
        String max = MaximumValue.findAnyMax("Boy","Girl","Animal");
        Assert.assertThat(max, CoreMatchers.equalTo("Girl"));
    }
    @Test
    public void ReturnMaxInteger() {
        Integer max = MaximumValue.findAnyMax(1, 2, 3);
        Assert.assertThat(max, CoreMatchers.equalTo(3));
    }
}
