package liang.ex30_2;

import java.util.stream.Stream;

public class Exercise2 {
    public static void main(String[] args) {
        Character[] chars = {'D', 'B', 'A', 'C'};
        Stream<Character> stream = Stream.of(chars).sorted();



        System.out.println(stream.findFirst().get());

        System.out.println(stream.skip(2).findFirst().get());
    }
}
