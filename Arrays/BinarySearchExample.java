package Arrays;
import java.util.Arrays;

// Binary search in java is an efficient algorithm used to find the position of a target element in a sorted array.

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 15, 10, 4, 3, 7, 8, 9}; // Example sorted array
        int target = 9;

        // /* 
        // Sort the array first
        Arrays.sort(array);

        System.out.println(Arrays.toString(array)); // print the array

        // Use built-in binary search method
        int index = Arrays.binarySearch(array, target);

        if (index != -1) {
            System.out.println("Target " + target + " found at index: " + index);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
        // */
        
        // int index = binarySearch(array, target);
        
        // if (index != -1) {
        //     System.out.println("Target " + target + " found at index: " + index);
        // } else {
        //     System.out.println("Target " + target + " not found in the array.");
        // }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents overflow  

            if (array[mid] == target) {
                return mid; // Target found
            }
            if (array[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        
        return -1; // Target not found
    }
}


// Built-in methods
/*

 import java.util.Arrays;
 Arrays.binarySearch(arr, target)


 import java.util.ArrayList;
 
 ArrayList<Interget> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
 boolean found = list.contains(5); // returns true if element is present
*/
