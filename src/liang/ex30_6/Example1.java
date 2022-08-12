package liang.ex30_6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
                "George", "Alan", "Stacy", "Michelle", "john"};

        StringBuilder sb = Stream.of(names).collect(() -> new StringBuilder(),
        (c, e) -> c.append(e), (c1, c2) -> c1.append(c2));

        System.out.println(sb.toString());

        StringBuilder sb2 = Stream.of(names).collect(StringBuilder::new,
                StringBuilder::append, StringBuilder::append);

        System.out.println(sb.toString());

        StringBuilder sb3 = new StringBuilder();
        for (String s: names) {
            sb3.append(s);
        }

        System.out.println(sb3);

        ArrayList<String> list = Stream.of(names).sorted().collect(ArrayList::new,
                ArrayList::add, ArrayList::addAll);

        List<String> list2 = Stream.of(names).sorted().collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list2);

    }
}
