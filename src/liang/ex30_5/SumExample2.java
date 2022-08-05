package liang.ex30_5;

import java.util.List;
import java.util.function.BinaryOperator;

public class SumExample2 {
    public static void main(String[] args) {
        int sum = List.of(1,2,3,4,5,6,7,8,9).parallelStream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });
        System.out.println(sum);
    }
}
