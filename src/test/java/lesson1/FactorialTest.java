package lesson1;

import org.junit.Test;

import java.math.BigInteger;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {
    Factorial factorial = new Factorial();

    @Test
    public void byCycleValue0(){
        final BigInteger result = factorial.bigFactorial(0);
        assertThat(result, is(BigInteger.valueOf(1)));
        assertEquals(BigInteger.valueOf(1), result);
    }

    @Test
    public void byCycleValue1(){
        final BigInteger result = factorial.bigFactorial(1);
        assertThat(result, is(BigInteger.valueOf(1)));
        assertEquals(BigInteger.valueOf(1), result);
    }

    @Test
    public void byCycleValue5(){
        final BigInteger result = factorial.bigFactorial(5);
        assertThat(result, is(BigInteger.valueOf(120)));
        assertEquals(BigInteger.valueOf(120), result);
    }

    @Test
    public void byCycleValue10(){
        final BigInteger result = factorial.bigFactorial(10);
        assertThat(result, is(BigInteger.valueOf(3628800)));
        assertEquals(BigInteger.valueOf(3628800), result);
    }

    @Test
    public void byRecursionValue0(){
        final BigInteger result = factorial.bigFactorialRecursion(0);
        assertThat(result, is(BigInteger.valueOf(1)));
        assertEquals(BigInteger.valueOf(1), result);
    }
    @Test
    public void byRecursionValue1(){
        final BigInteger result = factorial.bigFactorialRecursion(1);
        assertThat(result, is(BigInteger.valueOf(1)));
        assertEquals(BigInteger.valueOf(1), result);
    }

    @Test
    public void byRecursionValue5(){
        final BigInteger result = factorial.bigFactorialRecursion(5);
        assertThat(result, is(BigInteger.valueOf(120)));
        assertEquals(BigInteger.valueOf(120), result);
    }

    @Test
    public void byRecursionValue10(){
        final BigInteger result = factorial.bigFactorialRecursion(10);
        assertThat(result, is(BigInteger.valueOf(3628800)));
        assertEquals(BigInteger.valueOf(3628800), result);
    }

    @Test
    public void byBigMathValue0(){
        final BigInteger result = factorial.bigFactorial(0);
        assertThat(result, is(BigInteger.valueOf(1)));
        assertEquals(BigInteger.valueOf(1), result);
    }

    @Test
    public void byBigMathValue1(){
        final BigInteger result = factorial.bigFactorial(1);
        assertThat(result, is(BigInteger.valueOf(1)));
        assertEquals(BigInteger.valueOf(1), result);
    }

    @Test
    public void byBigMathValue5(){
        final BigInteger result = factorial.bigFactorial(5);
        assertThat(result, is(BigInteger.valueOf(120)));
        assertEquals(BigInteger.valueOf(120), result);
    }

    @Test
    public void byBigMathValue50(){
        final BigInteger result = factorial.bigFactorial(50);
        assertThat(result, is(new BigInteger("30414093201713378043612608166064768844377641568960512000000000000")));
        assertEquals(new BigInteger("30414093201713378043612608166064768844377641568960512000000000000"), result);
    }

}