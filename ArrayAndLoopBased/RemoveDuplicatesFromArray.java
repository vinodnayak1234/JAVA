package ArrayAndLoopBased;

import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 4, 2, 2, 8, 5, 1};
        int[] noDuplicates = removeDuplicates(numbers);

        System.out.println("Array after removing duplicates: " + Arrays.toString(noDuplicates));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : arr){
            uniqueSet.add(num); // Set automatically ignores duplicates.
        }

        // convert Set back to array
        int[] result = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            result[i++] = num;
        }
        return result;
    }
}
