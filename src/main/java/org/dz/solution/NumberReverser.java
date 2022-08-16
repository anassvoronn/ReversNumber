package org.dz.solution;

public class NumberReverser {
    public void reversAndPrint(final int number) {
        if (number == 0){
            System.out.print(0);
        }
        int result;
        int delimiter = 1;
        while (delimiter <= number) {
            delimiter = delimiter * 10;
            result = number % delimiter;
            result = result / (delimiter / 10);
            System.out.print(result);

        }
    }
}
