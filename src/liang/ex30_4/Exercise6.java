package liang.ex30_4;

import java.util.Random;
import java.util.stream.DoubleStream;

public class Exercise6 {
    public static void main(String[] args) {

        double[] values = new Random().doubles(1000, 0, 1).toArray();
        System.out.print("The values are ");
//        DoubleStream.of(values).parallel()
//                .forEach(e -> System.out.print(e + " "));
    }
}
