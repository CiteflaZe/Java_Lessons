package lesson1;

import java.math.BigInteger;

public class Factorial {

    public BigInteger bigFactorial(int n){
        BigInteger sum = BigInteger.valueOf(1);
        int i = 1;
        if(n == 0){
            return BigInteger.valueOf(1);
        }
        else{
            while(i <= n){
                sum = sum.multiply(BigInteger.valueOf(i));
                i++;
            }
        }
        return sum;
    }

    public BigInteger bigFactorialRecursion(int n){
        BigInteger sum = BigInteger.valueOf(n);
        if (n == 0) {
            return  BigInteger.valueOf(1);
        }
        else {
            return sum.multiply(bigFactorialRecursion(n - 1));
        }
    }

}
