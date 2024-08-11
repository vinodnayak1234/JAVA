package ImpQuestions;
public class LargestOfThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 15;
        
        int largest = largestThree(a, b, c);
        System.out.println("The largest number is: " + largest);
    }

    public static int findLargest(int a, int b, int c) {
        int largest;
        
        if (a > b && a > c) {
            largest = a;
        }
        else if (b > a && b > c) {
            largest = b;
        } else {
            largest = c;
        }
        return largest;
    }


    public static int largestOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int largestThree(int a, int b, int c) {
        // Use ternary operator to find the largest number
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        return largest;
    }
}
