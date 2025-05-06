package StringBased;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        System.out.println(isAnagram("Listen", "Silent")); // true
    }
    
    public static boolean isAnagram(String s1, String s2) {
        char[] a1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] a2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
        
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
}
