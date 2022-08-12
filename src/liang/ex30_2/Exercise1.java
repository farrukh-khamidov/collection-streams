package liang.ex30_2;

import java.util.Optional;
import java.util.stream.Stream;

public class Exercise1 {
    public static void main(String[] args) {
        Character[] chars = {'D', 'B', 'A', 'C', 'A', 'D'};

        Character c = Stream.of(chars).sorted().findFirst().orElse(null); // A
        System.out.println(c);

        System.out.println(Stream.of(chars).sorted().findFirst().get()); // A

        System.out.println(Stream.of(chars).sorted(java.util.Comparator.reverseOrder())
                .findFirst().get()); // D

        System.out.println(Stream.of(chars)
                .limit(2).sorted().findFirst().get()); // B

        System.out.println(Stream.of(chars).distinct()
                .skip(2).filter(e -> e > 'A').findFirst().get()); // C

        System.out.println(Stream.of(chars)
                .max(Character::compareTo).get()); // D

        System.out.println(Stream.of(chars)
                .max(java.util.Comparator.reverseOrder()).get()); // A

        System.out.println(Stream.of(chars)
                .filter(e -> e > 'A').findFirst().get()); // D

        System.out.println(Stream.of(chars)
                .allMatch(e -> e >= 'A')); // true

        System.out.println(Stream.of(chars)
                .anyMatch(e -> e > 'F')); // false

        System.out.println(Stream.of(chars)
                .noneMatch(e -> e > 'F')); // true

        Stream.of(chars).map(e -> e + "").map(e -> e.toLowerCase())
                .forEach(System.out::println); // d b a c a d

        Object[] temp = Stream.of(chars).map(e -> e + "Y")
                .map(e -> e.toLowerCase()).distinct().sorted().toArray();

        System.out.println(java.util.Arrays.toString(temp)); // [ay, ay, by, cy, dy, dy]
    }
}
