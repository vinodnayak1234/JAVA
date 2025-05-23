package LogicAndPatterns;
// sum of the cubes of the digits of any number is equal to the number itself is amstrong (not only cubes) 
// 0, 1, 153, 370, 371 and 407
public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 2;
        boolean isArmStrong = isArmStrongNumber(number);
        System.out.println("Is " + number + " an Amstrong number? " + isArmStrong);


        // for (int num = 1; num <= 1000; num++) {
        //     if (isArmStrongNumber(num)) {
        //         System.out.println(num);
        //     }
        // }
    }

    public static boolean isArmStrongNumber(int num) {
        int originalNumber = num;
        int numberOfDigits = String.valueOf(Math.abs(num)).length(); // String.valueOf method converts the given argument into its string representation

        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }
        return sum == originalNumber;

    }
}
