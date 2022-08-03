package liang.ex1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        double[] numbers = {2.4, 55.6, 90.12, 26.6};

        System.out.println("Count is " + Arrays.stream(numbers).filter(e -> e > 50).count());
    }
}
