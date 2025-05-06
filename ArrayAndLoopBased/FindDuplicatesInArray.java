package ArrayAndLoopBased;
import java.util.*;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 3, 4, 4, 7, 8, 8, 4}; // Example array with duplicates

        List<Integer> duplicates = findDuplicates(array);
        System.out.println("Duplicate elements in the array are: " + duplicates);
    }

    public static List<Integer> findDuplicates(int[] array) {
        List<Integer> result = new ArrayList<>();
        
        Arrays.sort(array); // Sort the array

        // Add the first element to the result as it will be checked
        result.add(array[0]);
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1] && !result.contains(array[i])) { // Check if current element is equal to previous element && To avoid adding the same element multiple times:
                result.add(array[i]);
            }
        }
        
        return result;
    }

    public static Set<Integer> findDuplicatess(int[] array) {
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> seen = new HashSet<>(); // No Duplicates: && Unordered

        for (int num : array) {
            if (!seen.add(num)) { // If num is already in the set, add it to result (duplicate found)
                duplicates.add(num);
            }
        }

        return duplicates;
    }
}
