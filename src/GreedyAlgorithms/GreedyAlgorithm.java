package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class GreedyAlgorithm {
    public static void main(String[] args) {
        int[] digits = {3, 1, 7, 9, 9, 5};
        System.out.println(maxNumberOfDigits(digits));
    }

    // O(n*log(n))
    public static String maxNumberOfDigits(int[] digits) {
        return String.join("", Arrays.stream(digits)
                .boxed().sorted(Collections.reverseOrder())
                .map(String::valueOf).toArray(String[]::new));
    }
}
