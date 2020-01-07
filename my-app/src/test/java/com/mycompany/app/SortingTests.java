package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;
import com.mycompany.app.sorting.*;
import java.util.*;

public class SortingTests 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        int[] inputList = { 1, 7, 5, 8, 4 };
        int[] mySortedList = Mergesort.sort(inputList);
        Arrays.sort(inputList);
        assertArrayEquals(inputList, mySortedList);
    }
}
