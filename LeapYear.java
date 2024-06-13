public class LeapYear {
    public static void main(String[] args) {
        int year = 1996;
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }    
    }

    public static boolean isLeapYear(int year) {
        // A year is a leaap year if it is divisible by 4
        // but years divisible by 100 are not leap years unless
        // they are also divisibe by 400
        if  (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
