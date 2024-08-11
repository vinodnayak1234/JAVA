package Arrays;
import java.util.ArrayList;
import java.util.List;

public class EvenOddFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        
        separateEvenOdd(array, evenNumbers, oddNumbers);
        
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }

    public static void separateEvenOdd(int[] array, List<Integer> evenNumbers, List<Integer> oddNumbers) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbers.add(array[i]);
            } else {
                oddNumbers.add(array[i]);
            }
        }
    }

    public static void separateEvenOdds(int[] array, List<Integer> evenNumbers, List<Integer> oddNumbers) {
        for (int num : array) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }
    }
}
