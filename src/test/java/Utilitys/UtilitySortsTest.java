package Utilitys;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UtilitySortsTest {

    private UtilitySorts ut = new UtilitySorts();
    private int[] first = {-98, -49, 18, 93, -89, -79, 87, -29, -73, 86};
    private int[] second = {-98, -89, -79, -73, -49, -29, 18, 86, 87, 93};



    @Test
    public void sortByBubble(){
        ut.bubbleSort(first);
        assertThat(first, is(second));
        int [] third = {-98, -89, -79, -73, -49, -29, 18, 86, 87, 93};
        Arrays.sort(third);
        Assert.assertArrayEquals(third, first);
    }

    @Test
    public void selectionSort(){
        ut.selectionSort(first);
        assertThat(first, is(second));
        int [] third = {-98, -89, -79, -73, -49, -29, 18, 86, 87, 93};
        Arrays.sort(third);
        Assert.assertArrayEquals(third, first);
    }

    @Test
    public void insertionSort(){
        ut.insertionSort(first);
        assertThat(first, is(second));
        int [] third = {-98, -89, -79, -73, -49, -29, 18, 86, 87, 93};
        Arrays.sort(third);
        Assert.assertArrayEquals(third, first);
    }

}
