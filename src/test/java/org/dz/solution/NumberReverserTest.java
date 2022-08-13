package org.dz.solution;

import org.junit.Test;

public class NumberReverserTest {
    @Test
    public void reversAndPrintFor1234() {
        NumberReverser reverser = new NumberReverser();
        reverser.reversAndPrint(1234);
    }

    @Test
    public void reversAndPrintFor0() {
        NumberReverser reverser = new NumberReverser();
        reverser.reversAndPrint(0);
    }

    @Test
    public void reversAndPrintFor1() {
        NumberReverser reverser = new NumberReverser();
        reverser.reversAndPrint(2);
    }

    @Test
    public void reversAndPrintFor1050806() {
        NumberReverser reverser = new NumberReverser();
        reverser.reversAndPrint(1050806);
    }

    @Test
    public void reversAndPrintFor10() {
        NumberReverser reverser = new NumberReverser();
        reverser.reversAndPrint(11);
    }

    @Test
    public void reversAndPrintFor12() {
        NumberReverser reverser = new NumberReverser();
        reverser.reversAndPrint(12);
    }
}