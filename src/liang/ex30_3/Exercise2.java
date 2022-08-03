package liang.ex30_3;

import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

public class Exercise2 {
    public static void main(String[] args) {
        double[] numbers = {1, 4, 2, 3, 1};
        DoubleSummaryStatistics stats =
                DoubleStream.of(numbers).summaryStatistics();
        System.out.printf("The summary of the stream is\n%-10s%10d\n" +
                        "%-10s%10.2f\n%-10s%10.2f\n%-10s%10.2f\n%-10s%10.2f\n",
                " Count:", stats.getCount(), " Max:", stats.getMax(),
                " Min:", stats.getMin(), " Sum:", stats.getSum(),
                " Average:", stats.getAverage());
    }
}
