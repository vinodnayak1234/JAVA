package ChatGpt;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        long result = factorialIterative(num); // Recursive method - factorial
        System.out.println("Factorial of " + num + " is " + result);
    }

    public static long factorial(int num) {
        if (num == 0) return 1;
        return num * factorial(num - 1);
    }



    public static long factorialIterative(int num) {
        long fact = 1;
        for (int i = 1; i  <= num; i ++) {
            fact *= i; // fact = fact * i;
        }
        return fact;
    }
}
