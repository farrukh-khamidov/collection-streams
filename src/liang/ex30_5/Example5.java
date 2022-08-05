package liang.ex30_5;

import java.util.List;
import java.util.function.IntBinaryOperator;

public class Example5 {
    public static void main(String[] args) {
        int result = List.of(1,2,3,4,5,9,7,8,3).parallelStream()
                .reduce(Integer.MIN_VALUE, (e1, e2) -> Math.max(e1, e2));
        System.out.println(result);
    }
}
