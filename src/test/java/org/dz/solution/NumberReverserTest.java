package org.dz.solution;

import org.junit.Assert;
import org.junit.Test;

public class NumberReverserTest {

    @Test
    public void reversAndPrintFor1234() {
        NumberReverser reverser = new NumberReverser();
        int[] result = reverser.revers(1234);
        Assert.assertArrayEquals(new int[]{4, 3, 2, 1}, result);
    }

    @Test
    public void reversAndPrintFor0() {
        NumberReverser reverser = new NumberReverser();
        int[] result = reverser.revers(0);
        Assert.assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void reversAndPrintFor1() {
        NumberReverser reverser = new NumberReverser();
        int[] result = reverser.revers(1);
        Assert.assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void reversAndPrintFor2() {
        NumberReverser reverser = new NumberReverser();
        int[] result = reverser.revers(2);
        Assert.assertArrayEquals(new int[]{2}, result);
    }

    @Test
    public void reversAndPrintFor1050806() {
        NumberReverser reverser = new NumberReverser();
        int[] result = reverser.revers(1050806);
        Assert.assertArrayEquals(new int[]{6, 0, 8, 0, 5, 0, 1}, result);
    }

    @Test
    public void reversAndPrintFor10() {
        NumberReverser reverser = new NumberReverser();
        int[] result = reverser.revers(10);
        Assert.assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void reversAndPrintFor100() {
        NumberReverser reverser = new NumberReverser();
        int[] result = reverser.revers(100);
        Assert.assertArrayEquals(new int[]{0, 0, 1}, result);
    }

    @Test
    public void reversAndPrintFor1200() {
        NumberReverser reverser = new NumberReverser();
        int[] result = reverser.revers(1200);
        Assert.assertArrayEquals(new int[]{0, 0, 2, 1}, result);
    }

    @Test
    public void reversAndPrintFor200() {
        NumberReverser reverser = new NumberReverser();
        int[] result = reverser.revers(200);
        Assert.assertArrayEquals(new int[]{0, 0, 2}, result);
    }

    @Test
    public void reversAndPrintFor11() {
        NumberReverser reverser = new NumberReverser();
        int[] result = reverser.revers(11);
        Assert.assertArrayEquals(new int[]{1, 1}, result);
    }

    @Test
    public void reversAndPrintFor12() {
        NumberReverser reverser = new NumberReverser();
        int[] result = reverser.revers(12);
        Assert.assertArrayEquals(new int[]{2, 1}, result);
    }
}