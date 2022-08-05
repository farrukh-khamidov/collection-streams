package liang.ex30_5;

import java.util.List;
import java.util.function.IntBinaryOperator;

public class SumExample4 {
    public static void main(String[] args) {
        int total = 0;

        IntBinaryOperator operator = new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        };

        for (int e: List.of(1,2,3,4,5,6,7,8,9)) {
            total = operator.applyAsInt(total, e);
        }
        System.out.println(total);
    }
}
