package liang.ex30_4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class Exercise3 {
    public static void main(String[] args) {

        String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
                "George", "Alan", "Stacy", "Michelle", "john"};

        Set<String> set = new HashSet<>(List.of(names));

        Object[] s = set.parallelStream().filter(e -> e.length() > 3)
        .sorted().toArray();

        Object[] s2 = set.parallelStream().sorted()
                .filter(e -> e.length() > 3).toArray();
    }
}
