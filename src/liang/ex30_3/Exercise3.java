package liang.ex30_3;

import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class Exercise3 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 2, 3, 1};
        IntStream.of(numbers).mapToObj(new IntFunction<Object>() {
                    @Override
                    public Object apply(int e) {
                        return (char)(e + 50);
                    }
                })
                .forEach(System.out::println);
    }
}
