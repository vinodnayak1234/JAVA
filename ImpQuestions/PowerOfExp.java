package ImpQuestions;
public class PowerOfExp {

    public static void main(String[] args) {
        int base = 2;
        int exp = 5;
        System.out.println(power(base, exp));
    }

    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
}
