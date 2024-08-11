package ImpQuestions;
public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = checkPrime(num);
        System.out.println(num + " is Prime: " + isPrime);
    }

    public static boolean checkPrime(int num) {
        if (num <= 1) return false;
        
        for (int i = 2; i < num; i++ ) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
