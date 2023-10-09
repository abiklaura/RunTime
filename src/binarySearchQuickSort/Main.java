package binarySearchQuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12};
        System.out.println(Arrays.toString(array));
        System.out.println(BinarySearch.binary(array, 12));

        int[] array2 = {12, 4, 2, 8, -3, 99};
        QuickSort.qs(array2, 0, array.length - 1);
        System.out.println(Arrays.toString(array2));
    }
}