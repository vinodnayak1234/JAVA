package ImpQuestions;
// Fibonacci series of first 10 = 0 1 1 2 3 5 8 13 21 34 55 89 144 233

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i ++) {
            System.out.print(fibonacciIterative(i) + " ");
        }
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static int getFibonacciTerm(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Term must be a positive integer.");
        }
        
        if (n == 1)  return 0;  
        else if (n == 2) return 1;

        int a = 0, b = 1;
        for (int i = 2; i < n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);        
    }
}


