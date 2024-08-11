package ImpQuestions;
public class SumOfNatural {
    public static void main(String[] args) {
        int n = 10;
        int sum = sumOfNauturalNumbers(n);
        System.out.println("Sum of the first " + n + " natural numbers: " + sum);

        
    }

    public static int sumOfNauturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumOfNauturalNumbersWithFormula(int n) {
        return n * (n + 1) / 2;
    }

}
