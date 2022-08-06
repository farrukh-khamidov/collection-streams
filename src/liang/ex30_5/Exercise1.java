package liang.ex30_5;

import java.util.stream.IntStream;

public class Exercise1 {
    public static void main(String[] args) {

        int[] values = {1, 2, 3, 4};
        System.out.println(IntStream.of(values)
                .reduce(0, (e1, e2) -> e1 + e2)); // 10

        System.out.println(IntStream.of(values)
                .reduce(1, (e1, e2) -> e1 * e2)); // 24

        System.out.println(IntStream.of(values).map(e -> e * e)
                .reduce(0, (e1, e2) -> e1 + e2)); // 30

        System.out.println(IntStream.of(values).mapToObj(e -> "" + e)
                .reduce((e1, e2) -> e1 + " " + e2).get()); // 1 2 3 4

        System.out.println(IntStream.of(values).mapToObj(e -> "" + e)
                .reduce((e1, e2) -> e1 + ", " + e2).get()); // 1, 2, 3, 4
    }
}
