package org.dz.solution;

import org.junit.Test;

public class NumberReverserTest {
    @Test
    public void reversAndPrintFor1234() {
        NumberReverser reverser = new NumberReverser();
        reverser.reversAndPrint(1234, 4);
    }

    @Test
    public void reversAndPrintFor0() {
        NumberReverser reverser = new NumberReverser();
        reverser.reversAndPrint(443934, 6);
    }

    @Test
    public void reversAndPrintFor1() {
        NumberReverser reverser = new NumberReverser();
        reverser.reversAndPrint(1, 1);
    }

    @Test
    public void reversAndPrintFor1050806() {
        NumberReverser reverser = new NumberReverser();
        reverser.reversAndPrint(1050806, 7);
    }

}