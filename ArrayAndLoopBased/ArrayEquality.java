package ArrayAndLoopBased;

import java.util.*;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 6};

        System.out.println("Arrays 1 and 2 are equal: " + arraysEqual(array1, array2)); // true
        System.out.println("Arrays 1 and 3 are equal: " + arraysEqual(array1, array3)); // false
    }

    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        // Check if arrays have the same length
        if (arr1.length != arr2.length) {
            return false;
        }

        // Check each element of the arrays
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean areEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
