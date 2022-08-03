package liang.ex1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example2 {
    public static void main(String[] args) {
        Double[] numbers = {2.4, 55.6, 90.12, 26.6};
        Set<Double> set = new HashSet<>(Arrays.asList(numbers));

        System.out.println("Count is " + set.stream().filter(e -> e > 60).count());
    }
}
