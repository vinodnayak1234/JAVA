package ImpQuestions;
public class EnvenOrOdd {
    public static void main(String[] args) {
        int number = 11;
        System.out.println(number + " is " + evenOrOdd(number));
    }
    
    public static String evenOrOdd(int n) {
        return n % 2 == 0 ? "even" : "odd";
    }

    public static String evenOdd(int n) {
        if (n % 2 == 0) {
            return "even";
        }
        else {
            return "odd";
        }
    }
}
