import java.util.Arrays;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("; ", "Pref:- ", " -:Suffer");

        joiner.add("One");
        joiner.add("Two");
        joiner.add("Three");
        joiner.add("Four");
        joiner.add("Five");

        System.out.println(joiner);

        System.out.println(Arrays.toString("Some things never tend to change".split("")));

        Long count = Stream.of(1, 4, 5, 1, 2, 3, 1, 2, 5, 3, 2, 6, 7)
                .distinct()
                .count();

        System.out.println(count);

    }
}
