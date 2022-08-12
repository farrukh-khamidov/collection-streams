package liang.ex30_2;

import java.util.HashMap;
import java.util.Map;

public class Exercise4 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("john", 1.5);
        map.put("Peter", 1.1);

        System.out.println(map.values().stream().mapToDouble(Double::doubleValue).sum());




    }
}
