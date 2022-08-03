package liang.ex30_4;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ParallelStreamDemo5 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Number of processors: " +
                Runtime.getRuntime().availableProcessors());

        long startTime = System.currentTimeMillis();
        int[] list1 = random.ints(200_000_000).filter(e -> e > 0).sorted()
                .limit(5).toArray();
        System.out.println(Arrays.toString(list1));

        long endTime = System.currentTimeMillis();

        System.out.println("Sequential execution time is " +
                (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();

        int[] list2 = random.ints(200_000_000).parallel().filter(e -> e > 0)
         .sorted().limit(5).toArray();

        System.out.println(Arrays.toString(list2));

        endTime = System.currentTimeMillis();

        System.out.println("Parallel execution time is " +
                (endTime - startTime) + " milliseconds");
    }
}
