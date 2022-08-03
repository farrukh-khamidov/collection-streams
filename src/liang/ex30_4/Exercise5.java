package liang.ex30_4;

import java.util.stream.IntStream;

public class Exercise5 {
    public static void main(String[] args) {

        int[] values = {3, 4, 1, 5, 20, 1, 3, 3, 4, 6};
        System.out.print("The values are ");
        IntStream.of(values).parallel()
                .forEach(e -> System.out.print(e + " "));
    }
}
