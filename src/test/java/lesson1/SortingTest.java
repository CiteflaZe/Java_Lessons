package lesson1;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortingTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private Sorting sort = new Sorting();
    private int[] incomingArray = {-27, 51, 72, 55, 29, 41, 73, -5, -34, -95};
    private int[] expectedArray = {-95, -34, -27, -5, 29, 41, 51, 55, 72, 73};
    private int[] zeroLengthArray = {};



    @Test
    public void bubbleSortTest(){
        int[] result = sort.bubbleSort(incomingArray);
        assertThat(result, is(expectedArray));
    }

    @Test
    public void selectionSortTest(){
        int[] result = sort.selectionSort(incomingArray);
        assertThat(result, is(expectedArray));
    }

    @Test
    public void insertionSortTest(){
        int[] result = sort.insertionSort(incomingArray);
        assertThat(result, is(expectedArray));
    }

    @Test
    public void bubbleSortThrowNullPointerException(){
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Array equals null");

        int[] result = sort.bubbleSort(null);
    }

    @Test
    public void selectionSortThrowNullPointerException(){
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Array equals null");

        int[] result = sort.selectionSort(null);
    }

    @Test
    public void insertionSortThrowNullPointerException(){
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Array equals null");

        int[] result = sort.insertionSort(null);
    }

    @Test
    public void bubbleSortZeroLengthArrayThrowRuntimeException(){
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Array length equals zero");

        int[] result = sort.bubbleSort(zeroLengthArray);
    }

    @Test
    public void selectionSortZeroLengthArrayThrowRuntimeException(){
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Array length equals zero");

        int[] result = sort.selectionSort(zeroLengthArray);
    }

    @Test
    public void insertionSortZeroLengthArrayThrowRuntimeException(){
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Array length equals zero");

        int[] result = sort.insertionSort(zeroLengthArray);
    }

}