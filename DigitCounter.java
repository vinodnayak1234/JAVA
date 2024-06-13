public class DigitCounter {
    public static void main(String[] args) {
        int number = 0;
        int count = countDigits(number);
        System.out.println("Number of digits in " + number + " is " + count);
    }

    public static int countDigits(int n) {
        int count = 0;
        if (n == 0) return 1;
        while (n != 0) {
            n /= 10;
            count ++;
        }
        return count;
    }
}
