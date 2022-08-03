package liang.ex30_3;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise4 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(Stream.of(m)
                .mapToInt(e -> IntStream.of(e).sum()).sum());

    }
}
