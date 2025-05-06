package ArrayAndLoopBased;

public class RotateAnArrayByKPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateLeft(arr, 2); // output: [3, 4, 5, 1, 2]
    }

    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] rotated = new int[n];
        
        for(int i = 0; i < n; i ++) {
            rotated[i] = arr[(i + k) % n];
        }
        System.out.println(Arrays.toString(rotated));
    }

    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] rotated = new int[n];
        
        for(int i = 0; i < n; i ++) {
            rotated[(i + k) % n] = arr[i];
        }
        System.out.println(Arrays.toString(rotated));
    }
}
