package liang.ex30_5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise2 {
    public static void main(String[] args) {

        int[][] m = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(Stream.of(m)
                .map(e -> IntStream.of(e).reduce(1, (e1, e2) -> e1 * e2))
                .reduce(1, (e1, e2) -> e1 * e2)); // 720
    }
}
