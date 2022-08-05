package liang.ex30_5;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class SumExample3 {
    public static void main(String[] args) {
        int sum = List.of(1,2,3,4,5,6,7,8,9).parallelStream().mapToInt(Integer::intValue).reduce(0, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        });
        System.out.println(sum);
    }
}
