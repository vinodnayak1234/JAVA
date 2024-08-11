package Arrays;
import java.util.*;

public class FindDuplicateStrings {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "apple", "orange", "banana", "pear"};

        List<String> duplicates = findDuplicates(array);
        System.out.println("Duplicate strings in the array are: " + duplicates);
    }

    public static List<String> findDuplicates(String[] array) {
        List<String> result = new ArrayList<>();
        
        Arrays.sort(array);
        
        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i - 1]) && !result.contains(array[i])) {
                result.add(array[i]);
            }
        }
        return result;
    }

    public static List<String> findDuplicatess(String[] array) {
        List<String> result = new ArrayList<>();
        Set<String> seen = new HashSet<>();

        for (String str : array) {
            if (!seen.add(str)) { // If str is already in the set, add it to result (duplicate found)
                result.add(str);
            }
        }

        return result;
    }
}
