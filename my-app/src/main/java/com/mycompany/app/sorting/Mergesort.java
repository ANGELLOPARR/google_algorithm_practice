package com.mycompany.app.sorting;

import java.util.Arrays;

public class Mergesort {
    private static int[] merge(int[] A, int[] B) {
        int i = 0, j = 0, k = 0;
        int[] C = new int[A.length + B.length];

        // copy every smallest element until we reach the end of one list
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            }
            else {
                C[k++] = B[j++];
            }
        }

        // copy rest of remaining array (if exists)
        while (i < A.length) {
            C[k++] = A[i++];
        }
        while (j < B.length) {
            C[k++] = B[j++];
        }

        return C;
    }

    public static int[] sort(int[] inputList) {
        if (inputList.length <= 1) {
            return inputList;
        }
        int[] arrayA = Arrays.copyOfRange(inputList, 0, inputList.length/2);
        int[] arrayB = Arrays.copyOfRange(
            inputList,
            inputList.length/2,
            inputList.length);
        arrayA = sort(arrayA);
        arrayB = sort(arrayB);
        int[] arrayC = merge(arrayA, arrayB);
        return arrayC;
    }
}
