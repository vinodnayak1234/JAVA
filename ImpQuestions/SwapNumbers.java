package ImpQuestions;
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swap the numbers using a temporary variable
        swapUsingTemp(a, b);
        
        /* 
        // Swap the numbers and capture the result
        int[] swapped = swap(a, b);
        a = swapped[0];
        b = swapped[1];

        System.out.println("After swap: a = " + a + ", b = " + b);
        */
    }

    public static void swapUsingTemp(int a, int b) {
        int temp = a; // Step 1: Store the value of a in temp
        a = b;        // Step 2: Assign the value of b to a
        b = temp;     // Step 3: Assign the value of temp (original a) to b
        
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    // Method to swap two numbers and return them in an array
    public static int[] swap(int a, int b) {
        return new int[] {b, a}; // Return the swapped values
    }
}

