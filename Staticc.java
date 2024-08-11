public class Staticc {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int result = sum(a,b);
        System.out.println(result);
        System.out.println(side);
    }

    static int side;

    public static int sum(int a, int b) {
        int sum;
        sum = a + b;
        side = a * a;

        return sum;
    }
}

