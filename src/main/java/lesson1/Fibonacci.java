package lesson1;

import java.math.BigInteger;

public class Fibonacci {

    public BigInteger bigFibonacci(int n){
        BigInteger n0 = BigInteger.valueOf(1);
        BigInteger n1 = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);

        if(n == 0){
            return BigInteger.valueOf(0);
        }
        else if(n == 1){
            return BigInteger.valueOf(1);
        }
        else if(n == 2){
            return BigInteger.valueOf(1);
        }
        else{
            for (int i = 3; i <= n; i++) {
                sum = BigInteger.valueOf(0);
                sum = sum.add(n0);
                sum = sum.add(n1);
                n0 = n1;
                n1 = sum;
            }
        }
        return sum;

    }


    public BigInteger bigFibonacciRecursion(int n){
        BigInteger sum = BigInteger.valueOf(0);
        if(n == 0){
            return BigInteger.valueOf(0);
        }
        else if(n == 1){
            return BigInteger.valueOf(1);
        }
        else{
            sum = sum.add(bigFibonacciRecursion(n-1));
            sum = sum.add(bigFibonacciRecursion(n-2));
        }

        return sum;

    }

}
