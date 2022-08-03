package liang.ex30_3;

import java.util.stream.IntStream;

public class Exercise1 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 2, 3, 1};
        System.out.println(IntStream.of(numbers)
                .sorted().findFirst().getAsInt()); // 1

        System.out.println(IntStream.of(numbers)
                .limit(2).sorted().findFirst().getAsInt()); // 1

        System.out.println(IntStream.of(numbers).distinct()
                .skip(1).filter(e -> e > 2).sum()); // 7

        System.out.println(IntStream.of(numbers).distinct()
                .skip(1).filter(e -> e > 2).average().getAsDouble()); // 3.5

        System.out.println(IntStream.of(numbers).max().getAsInt()); // 4

        System.out.println(IntStream.of(numbers).max().getAsInt()); // 4

        System.out.println(IntStream.of(numbers)
                .filter(e -> e > 1).findFirst().getAsInt()); // 4

        System.out.println(IntStream.of(numbers)
                .allMatch(e -> e >= 1)); // true

        System.out.println(IntStream.of(numbers)
                .anyMatch(e -> e > 4)); // false

        System.out.println(IntStream.of(numbers).noneMatch(e -> e > 4)); // true

        IntStream.of(numbers).mapToObj(e -> (char)(e + 50))
                .forEach(System.out::println); // char 51 54 52 53 51

        Object[] temp = IntStream.of(numbers)
                .mapToObj(e -> (char)(e + 'A')).toArray();

        System.out.println(java.util.Arrays.toString(temp)); // ['B', 'E', 'C', 'D', 'B']
    }
}
