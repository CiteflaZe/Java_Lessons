package lesson1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        Factorial fact = new Factorial();
        Sorting sort = new Sorting();

        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random()*200 - 100);
        }

        System.out.println("Fibonacci:");
        System.out.println(fib.bigFibonacci(30));
        System.out.println(fib.bigFibonacciRecursion(30));

        System.out.println("Factorial:");
        System.out.println(fact.bigFactorial(20));
        System.out.println(fact.bigFactorialRecursion(20));

        System.out.println("\nSorting:");
        System.out.println(Arrays.toString(array1));

        System.out.println("Bubble sort:");
        System.out.println(Arrays.toString(sort.bubbleSort(array1)));

        System.out.println("Insertion sort:");
        System.out.println(Arrays.toString(sort.insertionSort(array1)));

        System.out.println("Selection sort:");
        System.out.println(Arrays.toString(sort.selectionSort(array1)));


    }

}
