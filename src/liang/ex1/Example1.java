package liang.ex1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example1 {
    public static void main(String[] args) {
        Double[] numbers = {2.4, 55.6, 90.12, 26.6};
        Set<Double> set = new HashSet<>(Arrays.asList(numbers));
        int count = 0;
        for (double e: set)
            if (e > 60)
                count++;
        System.out.println("Count is " + count);
    }
}
