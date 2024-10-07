package Arrays;
import java.util.*;

public class FindUniqueValueArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 4, 6, 8, 8, 19, 7 };

        List<Integer> uniqueValues = findUniqueValues(array);
        System.out.println("Unique values: " + uniqueValues);
    }

    public static List<Integer> findUniqueValues(int[] array) {

        List<Integer> uniqueValues = new ArrayList<>();
        Arrays.sort(array); // Sort the array

        // Always add the first element (as it's a unique candidate)
        uniqueValues.add(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) { // Add element if it is the first element or not equal to previous element
                uniqueValues.add(array[i]); // [1, 2, 4, 6, 8, 19]
            }
        }
        return uniqueValues;
    }

    public static List<Integer> findUniqueElements(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();

        Arrays.sort(array);

        for (int num : array) {
            uniqueSet.add(num);
        }

        return new ArrayList<>(uniqueSet);
    }
}

