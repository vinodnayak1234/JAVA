package Arrays;

import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToRemove = 3;

        int[] newArray = removeElement(originalArray, elementToRemove);
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("New array after removal: " + Arrays.toString(newArray));
    }

    public static int[] removeElement(int[] array, int element) {
        int count = 0;

        // Count occurrences of the element to remove
        for (int value : array) {
            if (value != element) {
                count++;
            }
        }

        // Create a new array of the new size
        int[] newArray = new int[count];
        int index = 0;

        // Populate the new array with elements that are not equal to the element to remove
        for (int value : array) {
            if (value != element) {
                newArray[index++] = value;
            }
        }

        return newArray;
    }
}
