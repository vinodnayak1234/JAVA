package Arrays;
import java.util.Arrays;

public class BubbleSort {

     public static void main(String[] args) {
        int[] array = {9, 2, 15, 10, 4, 3, 7, 8, 9};

        int []sortedArray = sortArray(array);

        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));

    }
    public static int[] sortArray(int[] array) {
        int[] sortedArray = array.clone(); // Clone the array to avoid modifying the original

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) { //// j < n - i - 1 == j < n-1
                if (sortedArray[j] > sortedArray[j+1]) {
                    // Swap sortedArray[j] and sortedArray[j+1]
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;
                    
                }
            }
        }
    
        return sortedArray;
    }
    
}
