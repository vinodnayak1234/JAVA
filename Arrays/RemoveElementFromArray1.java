package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementFromArray1 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToRemove = 3;

        List<Integer> newList = removeElement(originalArray, elementToRemove);
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("New list after removal: " + newList);
    }

    // Function to remove an element from an array and return a List
    public static List<Integer> removeElement(int[] array, int element) {
        List<Integer> newList = new ArrayList<>();
        
        // Convert array to List and filter out the element
        for (int value : array) {
            if (value != element) {
                newList.add(value); // Add to new list if not equal to element
            }
        }
        
        return newList; // Return the new list
    }

    public static List<Integer> removeElement1(int[] array, int element) {
        // Convert array to ArrayList
        List<Integer> list = new ArrayList<>();
        for (int value : array) {
            list.add(value); // Add each element to the ArrayList
        }

        // Remove the specified element
        list.remove(Integer.valueOf(element)); // Remove the object, not by index

        return list; // Return the new ArrayList
    }
}
