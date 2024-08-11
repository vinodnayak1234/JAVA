package Arrays;
import java.util.ArrayList;
import java.util.List;

public class EvenOddFromArray1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<List<Integer>> result = separateEvenOdd(array);

        List<Integer> evenNumbers = result.get(0);
        List<Integer> oddNumbers = result.get(1);

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }

    public static List<List<Integer>> separateEvenOdd(int[] array) {
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int number : array) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(evenNumbers);
        result.add(oddNumbers);
        return result;
    }
}
