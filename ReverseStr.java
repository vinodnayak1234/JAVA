public class ReverseStr {
    public static void main(String[] args) {
        String str = "vinod";
        System.out.println(reverString(str));
    }

    public static String reverString(String str) {
       String reveString = "";
       for(int i = 0; i < str.length(); i ++) {
        char ch = str.charAt(i);
        reveString = ch + reveString;
       }
       return reveString;
    }
}