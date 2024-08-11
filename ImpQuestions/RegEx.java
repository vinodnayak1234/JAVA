package ImpQuestions;
public class RegEx {
    public static void main(String[] args) {
        String testStrings = "Hello Java@Programming#101";
        System.out.println(removeSpecialCharacters(testStrings));
    }

    public static String removeSpecialCharacters(String input) {
        if (input == null) {
            return null;
        }
        // Use regex to keep only alphanumeric characters (a-z, A-Z, 0-9) and whitespace
        return input.replaceAll("[^a-zA-Z0-9\\s]", "");
    }
}
