package Arrays;
public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9, 10}; // Example array with one missing number
        int missingNumber = findMissingNumber(array);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array) {
        int n = array.length + 1; // Total number of elements expected, including the missing number
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers formula: n * (n + 1) / 2
        
        int currentSum = 0;
        for (int num : array) {
            currentSum += num; // Calculate current sum of array elements
        }
        
        int missingNumber = totalSum - currentSum; // Calculate the missing number
        
        return missingNumber;
    }
}
