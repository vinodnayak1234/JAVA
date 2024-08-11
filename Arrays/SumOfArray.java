package Arrays;
public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = calculateSum(array);
        System.out.println("The sum of the array elements is: " + sum);
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int calculate(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
