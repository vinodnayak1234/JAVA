package BegginerLevel;

public class VowelsAndConsonantsInString {
    public static void main(String[] args) {
        String str = "Hello World";
        countVowelAndConsonants(str);
    }

    public static void countVowelAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        
        str = str.toLowerCase();  // case sensetive

        for (int i = 0; i < str.length(); i++ ) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <='z') { // only alphabets
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                    vowels ++;
                } else {
                    consonants ++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
