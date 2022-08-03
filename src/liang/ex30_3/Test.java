package liang.ex30_3;

import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
                "George", "Alan", "Stacy", "Michelle", "john"};
        Stream.of(names).mapToInt(e -> e.length()).sum();

        Stream.of(names).mapToInt(new ToIntFunction<String>() {
            @Override
            public int applyAsInt(String value) {
                return value.length();
            }
        }).sum();

        Stream.of(names).mapToInt(String::length).sum();

















    }
}
