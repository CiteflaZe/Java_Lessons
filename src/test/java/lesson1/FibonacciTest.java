package lesson1;

import org.junit.Test;

import java.math.BigInteger;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FibonacciTest {

    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void byCycleValue0(){
        final BigInteger result = fibonacci.bigFibonacci(0);
        assertThat(result, is(BigInteger.valueOf(0)));
        assertEquals(BigInteger.valueOf(0), result);
    }

    @Test
    public void byCycleValue1(){
        final BigInteger result = fibonacci.bigFibonacci(1);
        assertThat(result, is(BigInteger.valueOf(1)));
        assertEquals(BigInteger.valueOf(1), result);
    }

    @Test
    public void byCycleValue5(){
        final BigInteger result = fibonacci.bigFibonacci(5);
        assertThat(result, is(BigInteger.valueOf(5)));
        assertEquals(BigInteger.valueOf(5), result);
    }

    @Test
    public void byCycleValue10(){
        final BigInteger result = fibonacci.bigFibonacci(10);
        assertThat(result, is(BigInteger.valueOf(55)));
        assertEquals(BigInteger.valueOf(55), result);
    }

    @Test
    public void byRecursionValue0(){
        final BigInteger result = fibonacci.bigFibonacciRecursion(0);
        assertThat(result, is(BigInteger.valueOf(0)));
        assertEquals(BigInteger.valueOf(0), result);
    }
    @Test
    public void byRecursionValue1(){
        final BigInteger result = fibonacci.bigFibonacciRecursion(1);
        assertThat(result, is(BigInteger.valueOf(1)));
        assertEquals(BigInteger.valueOf(1 ), result);
    }

    @Test
    public void byRecursionValue5(){
        final BigInteger result = fibonacci.bigFibonacciRecursion(5);
        assertThat(result, is(BigInteger.valueOf(5)));
        assertEquals(BigInteger.valueOf(5), result);
    }

    @Test
    public void byRecursionValue10(){
        final BigInteger result = fibonacci.bigFibonacciRecursion(10);
        assertThat(result, is(BigInteger.valueOf(55)));
        assertEquals(BigInteger.valueOf(55), result);
    }

    @Test
    public void byBigMathValue0(){
        final BigInteger result = fibonacci.bigFibonacci(0);
        assertThat(result, is(BigInteger.valueOf(0)));
        assertEquals(BigInteger.valueOf(0), result);
    }

    @Test
    public void byBigMathValue1(){
        final BigInteger result = fibonacci.bigFibonacci(1);
        assertThat(result, is(BigInteger.valueOf(1)));
        assertEquals(BigInteger.valueOf(1), result);
    }

    @Test
    public void byBigMathValue5(){
        final BigInteger result = fibonacci.bigFibonacci(5);
        assertThat(result, is(BigInteger.valueOf(5)));
        assertEquals(BigInteger.valueOf(5), result);
    }

    @Test
    public void byBigMathValue50(){
        final BigInteger result = fibonacci.bigFibonacci(50);
        assertThat(result, is(new BigInteger("12586269025")));
        assertEquals(new BigInteger("12586269025"), result);
    }

}