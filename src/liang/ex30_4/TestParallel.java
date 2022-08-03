package liang.ex30_4;

import java.util.stream.IntStream;

public class TestParallel {
    public static void main(String[] args) {
        IntStream.of(1, 2, 3, 4, 5).parallel()
                .forEach(e -> System.out.print(e + " "));

        System.out.println();

        IntStream.of(1, 2, 3, 4, 5)
                .forEach(e -> System.out.print(e + " "));
    }
}
