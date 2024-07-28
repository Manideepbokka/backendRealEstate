package com.realestate.backend.Standalone;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static int findMaxPairs(int[] a, Integer[] b) {
        int n = a.length;

        // Sort arrays: a in ascending order, b in descending order
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        int i = 0, j = 0, count = 0;

        // Iterate through arrays and count pairs
        while (i < n && j < n) {
            if (a[i] > b[j]) {
                count++;
                i++; // Move pointer in a (larger element)
            } else {
                j++; // Move pointer in b (smaller element)
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        Integer[] b = {1,2,1};

        int maxPairs = findMaxPairs(a, b);
        System.out.println("Maximum number of pairs: " + maxPairs);
    }
}
