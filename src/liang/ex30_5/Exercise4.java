package liang.ex30_5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise4 {
    public static void main(String[] args) {

        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {1, 3}};
        System.out.println(
                Stream.of(m).map(e -> IntStream.of(e))
                        .reduce((e1, e2) -> IntStream.concat(e1, e2))
                        .get().distinct().mapToObj(e -> e + "")
                        .reduce((e1, e2) -> e1 + ", " + e2).get()); // 1, 2, 3, 4, 5, 6
    }
}
