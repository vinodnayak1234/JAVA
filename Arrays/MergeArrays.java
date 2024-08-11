package Arrays;
import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.print("Merged Array: " + Arrays.toString(mergedArray));
        
        // for (int i : mergedArray) {
        //     System.out.print(i + " ");      // print array
        // }
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        System.out.println(mergedArray);

        int i = 0;
        for (; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        for (int j = 0; j < array2.length; j++) {
            mergedArray[i + j] = array2[j];
        }

        return mergedArray;
    }   

}
