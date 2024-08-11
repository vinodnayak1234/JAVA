
import java.util.*;

public class SelectRandomString {
    public static void main(String[] args) {
        String[] strings = {"AreaAndPerimeterOfRectangle", "ArmstrongNumber", "CountEvenOddDigits", "DigitCounter", "EnvenOrOdd",  "Factorial", "FibonacciSeries",
        "JavaMath", "LargestOfThree", "LeapYear", "NumberIsNegetiveOrPossitive", "PalindromeNumber", "PalindromeString", "PowerOfExp", "PrimeCheck", "RegEx", "ReverseNumber",
        "ReverseString", "SelectRandomString", "SumOfDigits", "SumOfNatural", "Swap", "WordCounter"};
        String randomString = getRandomString(strings);
        System.out.println("Random selected String: " + randomString);
    }

    public static String getRandomString(String[] array) {
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
        return array[randomIndex];
    }
}
