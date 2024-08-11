package Arrays;
public class LinearSearchExample {
    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 9, 5, 3};
        int target = 7;
        
        int index = linearSearch(array, target);
        
        if (index != -1) {
            System.out.println("Target " + target + " found at index: " + index);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index where target is found
            }
        }
        return -1; // Return -1 if target is not found
    }
}
