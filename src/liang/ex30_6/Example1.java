package liang.ex30_6;

import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
                "George", "Alan", "Stacy", "Michelle", "john"};

        StringBuilder sb = Stream.of(names).collect(() -> new StringBuilder(),
        (c, e) -> c.append(e), (c1, c2) -> c1.append(c2));

        StringBuilder sb2 = Stream.of(names).collect(StringBuilder::new,
                StringBuilder::append, StringBuilder::append);

//        StringBuilder sb3 = new StringBuilder();
//        for (String s: Stream.of(names)) {
//            sb.append(s);
//        }

    }
}
