package hometask14;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static Map<Integer, Long> fibonacci = new HashMap<>();
    static {
        fibonacci.put(0, 0L);
        fibonacci.put(1, 1L);
    }

    public Long calculateFibonacci(int number){
        return fibonacci.computeIfAbsent(number, n -> calculateFibonacci(n - 2) + calculateFibonacci(n - 1));
    }
}
