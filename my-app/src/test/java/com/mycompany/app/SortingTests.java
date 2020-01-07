package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;
import com.mycompany.app.sorting.*;
import java.util.*;

public class SortingTests 
{
    @Test
    public void MergesortTest01()
    {
        int[] inputList = { 1, 7, 5, 8, 4 };
        int[] mySortedList = Mergesort.sort(inputList);
        Arrays.sort(inputList);
        assertArrayEquals(inputList, mySortedList);
    }

    @Test
    public void MergesortTest02()
    {
        int[] inputList = {};
        int[] mySortedList = Mergesort.sort(inputList);
        Arrays.sort(inputList);
        assertArrayEquals(inputList, mySortedList);
    }

    @Test
    public void MergesortTest03()
    {
        int[] inputList = { 9, 9, 9, 9, 9 };
        int[] mySortedList = Mergesort.sort(inputList);
        Arrays.sort(inputList);
        assertArrayEquals(inputList, mySortedList);
    }

    @Test
    public void MergesortTest04()
    {
        int[] inputList = { -100, -50, 50, 13, -14 };
        int[] mySortedList = Mergesort.sort(inputList);
        Arrays.sort(inputList);
        assertArrayEquals(inputList, mySortedList);
    }
}
