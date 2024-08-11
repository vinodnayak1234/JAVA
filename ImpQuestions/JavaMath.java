package ImpQuestions;
// The java math class has many methods that allows you to perform mathemetical operations on numbers
public class JavaMath {
    public static void main(String[] args) {
        System.out.println(max(10,20));
        
    }
    
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double random(int a) {
        return (Math.random() * a);
    }

    public static int abs(int a) {
        return Math.abs(a);
    }

}
