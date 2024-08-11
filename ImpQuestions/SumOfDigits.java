package ImpQuestions;
public class SumOfDigits {
    public static void main(String[] args) {
        int number = 123 ;
        System.out.println(number % 10);
        int sum = sumOfDigitsRecursive(number);
        System.out.println("Sum of the digits of " + number + " is " + sum);
    }

    public static int sumOfDigitsIterative(int n) {
        int sum = 0;
        n = Math.abs(n); // Handle negative numbers
        while (n != 0) {
            sum += n % 10;   // sum = sum + n % 10  ------> remainder
            n /= 10;         // n = n / 10          ------> Quotient
        }
        return sum;
    }

    public static int sumOfDigitsRecursive(int n) {
        n = Math.abs(n);
        if (n == 0) return 0;
        else {
            return n % 10 + sumOfDigitsRecursive(n / 10);
        }
    }
}
