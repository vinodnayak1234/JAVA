package ImpQuestions;
public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 12321;
        boolean isPalindrome = isPalindromeNumber(number);
        System.out.println("Is " + number + " a palindrome? " + isPalindrome);
    }

    public static boolean isPalindromeNumber(int number) {
        // Negative numbers are not palindromes
        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            reversedNumber = reversedNumber * 10 + digit;  // Build the reversed number
            number /= 10;  // Remove the last digit from the original number
        }
        
        // Check if the original number is equal to the reversed number
        return originalNumber == reversedNumber;
    }

    public static boolean isPalindromeNumbers(int number) {
        // Convert the number to a string
        String numberStr = Integer.toString(number);
        
        // Use StringBuilder to reverse the string
        StringBuilder sb = new StringBuilder(numberStr);
        sb.reverse();
        
        // Compare the original string with the reversed string
        return numberStr.equals(sb.toString());
    }
}
