package BegginerLevel;

public class FindLargestAndSmallestNumberInArray {
    public static void main (String[] args) {
        int[] numbers = {12, 45, 2, 9, 33, 17};
        
        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Smallest number:" + min);
        System.out.println("Largest number: " + max);
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
}
