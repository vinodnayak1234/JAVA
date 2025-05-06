package BegginerLevel;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        swap(a,b);
    }

    public static void swap(int a, int b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
