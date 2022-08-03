package liang.ex30_3;

import java.util.stream.Stream;

public class Exercise5 {
    public static void main(String[] args) {
        String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
                "George", "Alan", "Stacy", "Michelle", "john"};

        System.out.println("Total character count for all names is "
                + Stream.of(names).mapToInt(e -> e.length()).sum());

    }
}
