package org.dz.solution;

public class NumberReverser {
    public void reversAndPrint(final int number, final  int amount) {
        int result;
        int delimiter = 1;

        for (int i = delimiter; i <= amount; i++) {
            delimiter = delimiter * 10;
            result = number % delimiter;
            result = result / (delimiter / 10);
            System.out.print(result);
        }



    }
}
