package Arrays;

import java.util.Scanner;

public class PrintSumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the array size: ");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        System.out.println("Please enter the array values:");
        for(int i = 0; i < arrSize; i ++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0
        for(int i= 0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Output sum: "+sum);
        System.out.println("Output Average: "+num/arr.length);
        sc.close();
    }
}
