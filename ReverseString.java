public class ReverseString {
    public static void main(String[] args) {
        String str = "vinod";
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }
    
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    
}
