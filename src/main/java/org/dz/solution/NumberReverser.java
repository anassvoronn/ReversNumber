package org.dz.solution;

public class NumberReverser {
    public void reversAndPrint(final int number) {
        int result;
        int delimiter = 1;
        String strNumber = String.valueOf(number);
        int length = strNumber.length();
        for (int i = 1; i <= length ; i++) {
            delimiter = delimiter * 10;
            result = number % delimiter;
            result = result / (delimiter / 10);
            System.out.print(result);

        }
    }
}
