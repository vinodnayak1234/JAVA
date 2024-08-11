package ImpQuestions;
import java.util.ArrayList;
import java.util.List;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        int number = 123456789;
        int[] counts = countEvenOddDigits(number);

        System.out.println("Number of even digits: " + counts[0]);
        System.out.println("Even digits: " + evenDigits);
        System.out.println("Number of odd digits: " + counts[1]);
        System.out.println("Odd digits: " + oddDigits);
    }

    // Lists to store even and odd digits
    static List<Integer> evenDigits = new ArrayList<>();
    static List<Integer> oddDigits = new ArrayList<>();

    public static int[] countEvenOddDigits(int number) {
        int evenCount = 0;
        int oddCount = 0;

        number = Math.abs(number);  // Handle negative numbers by taking the absolute value

        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            if (digit % 2 == 0) {
                evenCount++;  // Increment even digit count
                evenDigits.add(digit);  // Store even digit
            } else {
                oddCount++;  // Increment odd digit count
                oddDigits.add(digit);  // Store odd digit
            }
            number /= 10;  // Remove the last digit from the number
        }

        return new int[]{evenCount, oddCount};  // Return the counts as an array
    }
}
