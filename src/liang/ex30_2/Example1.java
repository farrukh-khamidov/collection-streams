package liang.ex30_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
                "George", "Alan", "Stacy", "Michelle", "john"};

        // Display the first four names sorted
        Stream.of(names).forEach(s -> System.out.print(s + " "));
        System.out.println();
        Stream.of(names).map(String::toLowerCase).sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));


        Stream.of(names).filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 4;
            }
        }).forEach(s -> System.out.print(s + " "));
        System.out.println();
        Stream.of(names).map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toLowerCase();
            }
        }).forEach(s -> System.out.print(s + " "));


    }
}
