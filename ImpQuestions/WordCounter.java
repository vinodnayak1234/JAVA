package ImpQuestions;
public class WordCounter {
    public static void main(String[] args) {
        String input = "  Hello world! Welcome to Java programming.  ";

        // Use the utility class to count words
        int wordCount = countWords(input);

        // Print the word count
        System.out.println("The number of words in the string is: " + wordCount);
    }

    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        // Split the input string based on whitespace
        String[] words = input.trim().split("\\s+");
        
        return words.length;
    }
    
}
