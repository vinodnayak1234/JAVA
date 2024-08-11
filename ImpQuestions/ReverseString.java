package ImpQuestions;
public class ReverseString {
    public static void main(String[] args) {
        String str = "vinod";
        String reversed = reverseStringLoop(str);
        System.out.println("Reversed string: " + reversed);
    }
    
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String reverseStringLoop(String str) {
        String reverseString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            reverseString = ch + reverseString;   // v iv niv oniv doniv

        }
        return reverseString;
    }

    public static String reveseStringRecursive(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reveseStringRecursive(str.substring(1)) + str.charAt(0);
    }
    
}
