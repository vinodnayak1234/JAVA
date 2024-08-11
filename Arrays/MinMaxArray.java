package Arrays;
public class MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int min = findMin(numbers);
        int max = findMax(numbers);

        System.err.println("Minimum value in the array: " + min);
        System.err.println("Minimum value in the array: " + max);

    }
    
    public static int findMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
