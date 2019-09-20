package Utilitys;

import org.junit.Test;

import java.math.BigInteger;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UtilityFactorialTest {

    private UtilityFactorial ut = new UtilityFactorial();

    @Test
    public void byCycleValue0(){
        final long result = ut.byCycle(0);
        assertThat(result, is(1L));
        assertEquals(1L, result);
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
        assertThat(result, is(120L));
        assertEquals(120L, result);
    }

    @Test
    public void byCycleValue10(){
        final long result = ut.byCycle(10);
        assertThat(result, is(3628800L));
        assertEquals(3628800L, result);
    }

    @Test
    public void byRecursionValue0(){
        final long result = ut.byRecursion(0);
        assertThat(result, is(1L));
        assertEquals(1L, result);
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
        assertThat(result, is(120L));
        assertEquals(120L, result);
    }

    @Test
    public void byRecursionValue10(){
        final long result = ut.byRecursion(10);
        assertThat(result, is(3628800L));
        assertEquals(3628800L, result);
    }

    @Test
    public void byBigMathValue0(){
        final BigInteger result = ut.byBigMath(0);
        assertThat(result, is(BigInteger.valueOf(1)));
        assertEquals(BigInteger.valueOf(1), result);
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
        assertThat(result, is(BigInteger.valueOf(120)));
        assertEquals(BigInteger.valueOf(120), result);
    }

    @Test
    public void byBigMathValue50(){
        final BigInteger result = ut.byBigMath(50);
        assertThat(result, is(new BigInteger("30414093201713378043612608166064768844377641568960512000000000000")));
        assertEquals(new BigInteger("30414093201713378043612608166064768844377641568960512000000000000"), result);
    }

}
