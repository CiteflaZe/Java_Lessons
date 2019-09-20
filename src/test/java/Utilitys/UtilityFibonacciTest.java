package Utilitys;

import org.junit.Test;

import java.math.BigInteger;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UtilityFibonacciTest {

    private UtilityFibonacci ut = new UtilityFibonacci();

    @Test
    public void byCycleValue0(){
        final long result = ut.byCycle(0);
        assertThat(result, is(0L));
        assertEquals(0L, result);
    }

    @Test
    public void byCycleValue1(){
        final long result = ut.byCycle(1);
        assertThat(result, is(1L));
        assertEquals(1L, result);
    }

    @Test
    public void byCycleValue5(){
        final long result = ut.byCycle(5);
        assertThat(result, is(5L));
        assertEquals(5L, result);
    }

    @Test
    public void byCycleValue10(){
        final long result = ut.byCycle(10);
        assertThat(result, is(55L));
        assertEquals(55L, result);
    }

    @Test
    public void byRecursionValue0(){
        final long result = ut.byRecursion(0);
        assertThat(result, is(0L));
        assertEquals(0L, result);
    }
    @Test
    public void byRecursionValue1(){
        final long result = ut.byRecursion(1);
        assertThat(result, is(1L));
        assertEquals(1L, result);
    }

    @Test
    public void byRecursionValue5(){
        final long result = ut.byRecursion(5);
        assertThat(result, is(5L));
        assertEquals(5L, result);
    }

    @Test
    public void byRecursionValue10(){
        final long result = ut.byRecursion(10);
        assertThat(result, is(55L));
        assertEquals(55L, result);
    }

    @Test
    public void byBigMathValue0(){
        final BigInteger result = ut.byBigMath(0);
        assertThat(result, is(BigInteger.valueOf(0)));
        assertEquals(BigInteger.valueOf(0), result);
    }

    @Test
    public void byBigMathValue1(){
        final BigInteger result = ut.byBigMath(1);
        assertThat(result, is(BigInteger.valueOf(1)));
        assertEquals(BigInteger.valueOf(1), result);
    }

    @Test
    public void byBigMathValue5(){
        final BigInteger result = ut.byBigMath(5);
        assertThat(result, is(BigInteger.valueOf(5)));
        assertEquals(BigInteger.valueOf(5), result);
    }

    @Test
    public void byBigMathValue50(){
        final BigInteger result = ut.byBigMath(50);
        assertThat(result, is(new BigInteger("12586269025")));
        assertEquals(new BigInteger("12586269025"), result);
    }

}
