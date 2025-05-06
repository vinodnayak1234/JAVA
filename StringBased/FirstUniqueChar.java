package StringBased;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static void main(String[] args) {
        System.out.println(firstNonRepeated("swiss")); // output: w
    }

    public static char firstNonRepeated(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return '_'; // default if no unique character
    }
    
    public static char firstNonRepeatedLoop(String str) {
        for (int i = 0; i < str.length(); i ++) {
            boolean unique = true;
            for(int j = 0; j < str.length(); j ++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                }
            }
            if (unique) {
                return str.charAt(i);
            }
        }
        return '_'; // default if no unique character
    }

}
