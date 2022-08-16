package org.dz.solution;

public class NumberReverser {
    public int[] revers(final int number) {
        if (number == 0) {
            return new int[]{0};
        }
        String numberStr = String.valueOf(number);
        int[] reversedNumber = new int[numberStr.length()];
        int result;
        int delimiter = 1;
        for (int i = 0; delimiter <= number; i++) {
            delimiter = delimiter * 10;
            result = number % delimiter;
            result = result / (delimiter / 10);
            reversedNumber[i] = result;

        }
        return reversedNumber;
    }
}
