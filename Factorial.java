package ChatGpt;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        long result = factorial(num);
        System.out.println("Factorial of " + num + " is " + result);
    }

    public static long factorial(int num) {
        System.out.println("num: " + num);
        if (num == 0) return 1;
        System.out.println("factorial(n-1): " + factorial(num - 1));
        return num * factorial(num - 1);
    }
}
