package Utilitys;

import java.math.BigInteger;

public class UtilityFactorial {

    public long byCycle(long index){
        long result = 1;
        if(index == 0){
            return 1;
        }

        while (index > 0){
            result *= index;
            index--;
        }

        return result;
    }



    public long byRecursion(long index){

        if(index == 0){
            return 1;
        }

        return byRecursion(index-1) * index;

    }



    public BigInteger byBigMath(long index){

        BigInteger result = BigInteger.valueOf(1);
        if (index == 0){
            return result;
        }

        while (index > 0){
            result = result.multiply(BigInteger.valueOf(index));
            index--;
        }

        return result;
    }


}
