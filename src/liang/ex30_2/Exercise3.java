package liang.ex30_2;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Exercise3 {
    public static void main(String[] args) {
        Character[] chars = {'D', 'B', 'A', 'C'};
        Stream.of(chars).map(e -> e + " ")
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2)) // a
                .forEach(System.out::print); // b

        System.out.println();

        // a
        Stream.of(chars).map(e -> e + " ")
                .sorted(String::compareToIgnoreCase) // a
                .forEach(System.out::print); // b

        System.out.println();

        Stream.of(chars).map(e -> e + " ")
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        return s1.compareToIgnoreCase(s2);
                    }
                }) // a
                .forEach(System.out::print); // b

        System.out.println();
        System.out.println();

        Stream.of(chars).map(e -> e + " ")
                .sorted(String::compareToIgnoreCase) // a
                .forEach(s -> System.out.print(s)); // b

        System.out.println();

        Stream.of(chars).map(e -> e + " ")
                .sorted(String::compareToIgnoreCase) // a
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.print(s);
                    }
                }); // b

    }
}
