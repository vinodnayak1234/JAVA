package ImpQuestions;
public class ReverseNumber {
    public static void main(String[] args) {
        int number = 123456;
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseNumber(int n) {
        int reversed = 0;
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);
        
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed * sign;
    }

    public static int reverseNumbers(int number) {
        // Convert the number to a string
        String numberStr = Integer.toString(number);
        
        // Use StringBuffer to reverse the string
        StringBuffer sb = new StringBuffer(numberStr);
        sb.reverse();
        
        // Convert the reversed string back to an integer
        return Integer.parseInt(sb.toString());
    }

    public static int reverseNumberss(int number) {
        // Convert the number to a string
        String numberStr = Integer.toString(number);
        
        // Use StringBuilder to reverse the string
        StringBuilder sb = new StringBuilder(numberStr);
        sb.reverse();
        
        // Convert the reversed string back to an integer
        return Integer.parseInt(sb.toString());
    }
}
