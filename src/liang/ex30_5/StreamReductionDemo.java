package liang.ex30_5;

import java.util.stream.IntStream;
2 import java.util.stream.Stream;
3
        4 public class StreamReductionDemo {
5 public static void main(String[] args) {
        6 int[] values = {3, 4, 1, 5, 20, 1, 3, 3, 4, 6};
        7
        8 System.out.print("The values are ");
        9 IntStream.of(values).forEach(e −> System.out.print(e + " "));
        10
        11 System.out.println("\nThe result of multiplying all values is " +
                12 IntStream.of(values).parallel().reduce(1, (e1, e2) −> e1 * e2));
        13
        14 System.out.print("The values are " +
                15 IntStream.of(values).mapToObj(e −> e + "")
        16 .reduce((e1, e2) −> e1 + ", " + e2).get());
                String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
                        19 "George", "Alan", "Stacy", "Michelle", "john"};
                20 System.out.print("\nThe names are: ");
                21 System.out.println(Stream.of(names)
                        22 .reduce((x, y) −> x + ", " + y).get());
                23
                24 System.out.print("Concat names: ");
                25 System.out.println(Stream.of(names)
                        26 .reduce((x, y) −> x + y).get());
                27
                28 System.out.print("Total number of characters: ");
                29 System.out.println(Stream.of(names)
                        30 .reduce((x, y) −> x + y).get().length());
                31 }
32 }
