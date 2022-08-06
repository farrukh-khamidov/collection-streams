package liang.ex30_5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise3 {
    public static void main(String[] args) {

        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {1, 3}};
        Stream.of(m).map(e -> IntStream.of(e))
                .reduce((e1, e2) -> IntStream.concat(e1, e2))
                .get().distinct()
                .forEach(e -> System.out.print(e + " ")); // 1 2 3 4 5 6
    }
}
