package Arrays;
import java.util.*;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 3, 4, 4, 7, 8, 4, 1}; // Example array with duplicates

        List<Integer> duplicates = findDuplicates(array);
        System.out.println("Duplicate elements in the array are: " + duplicates);
    }

    public static List<Integer> findDuplicates(int[] array) {
        List<Integer> result = new ArrayList<>();
        
        Arrays.sort(array); // Sort the array
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1] && !result.contains(array[i])) { // Check if current element is equal to previous element
                result.add(array[i]);
            }
        }
        
        return result;
    }

    public static List<Integer> findDuplicatess(int[] array) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : array) {
            if (!seen.add(num)) { // If num is already in the set, add it to result (duplicate found)
                result.add(num);
            }
        }

        return result;
    }
}
