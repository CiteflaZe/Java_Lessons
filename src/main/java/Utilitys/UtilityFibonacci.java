package Utilitys;

import java.math.BigInteger;

public class UtilityFibonacci {

    public long byCycle(long index){

        long result = 0L;
        long first = 1L;
        long second = 1L;

        if (index == 0){
            return 0;
        }else if (index <= 2){
            return 1;
        }else {
            for (int i = 2; i < index; i++) {
                result = first + second;
                first = second;
                second = result;
            }
        }
        return result;
    }



    public long byRecursion(long index){

        if (index == 0){
            return 0;
        }
        if (index == 1){
            return 1;
        }

        return byRecursion(index-2) + byRecursion(index -1);
    }


    public BigInteger byBigMath(long index){

        BigInteger result = BigInteger.valueOf(0);
        BigInteger first = BigInteger.valueOf(1);
        BigInteger second = BigInteger.valueOf(1);

        if (index == 0){
            return BigInteger.valueOf(0);
        }else if (index <= 2){
            return BigInteger.valueOf(1);
        }else {
            for (int i = 2; i < index; i++) {
                result = first.add(second);
                first = second;
                second = result;
            }
        }

        return result;
    }
}
