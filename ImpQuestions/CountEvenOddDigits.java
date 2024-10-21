package ImpQuestions;
import java.util.ArrayList;
import java.util.List;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        int number = 123456789;
        Object[] results = countEvenOddDigits(number);

        System.out.println("Number of even digits: " + results[0]); // 4
        System.out.println("Even digits: " + results[1]); // [8, 6, 4, 2]
        System.out.println("Number of odd digits: " + results[2]); // 5
        System.out.println("Odd digits: " + results[3]); // [9, 7, 5, 3, 1]
    }

    public static Object[] countEvenOddDigits(int number) {
        List<Integer> evenDigits = new ArrayList<>();
        List<Integer> oddDigits = new ArrayList<>();

        int evenCount = 0;
        int oddCount = 0;

        number = Math.abs(number);  // Handle negative numbers

        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            if (digit % 2 == 0) {
                evenCount++;  // Increment even digit count
                evenDigits.add(digit);  // Store even digit
            } else {
                oddCount++;  // Increment odd digit count
                oddDigits.add(digit);  // Store odd digit
            }
            number /= 10;  // Remove the last digit
        }

        return new Object[]{evenCount, evenDigits, oddCount, oddDigits};  // Return counts and digit lists
    }
}
