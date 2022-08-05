package liang.ex30_5;

import java.util.List;

public class SumExample {
    public static void main(String[] args) {
        int sum = List.of(1,2,3,4,5,6,7,8,9).parallelStream().reduce(0, (e1, e2) -> e1 + e2);
        System.out.println(sum);
    }
}
