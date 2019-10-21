package hometask14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);


        String longestName = Stream.of("John Lennon", "Paul McCartney",
                "George Harrison", "Ringo Starr", "Pete Best", "Some other really long artist name", "Stuart Sutcliffe")
                .max((s1, s2) -> s1.length() - s2.length())
                .get();
        System.out.println(longestName);


        Long start = System.nanoTime();
        System.out.println(fibonacci.calculateFibonacci(7));
        Long finish = System.nanoTime();
        System.out.println(finish - start + " nSeconds");

        start = System.nanoTime();
        System.out.println(fibonacci.calculateFibonacci(7));
        finish = System.nanoTime();
        System.out.println(finish - start + " nSeconds");

        numbers.stream()
                .reduce(numbers, )

    }
}
