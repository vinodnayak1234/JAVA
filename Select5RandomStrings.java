import java.io.*;
import java.util.*;

public class Select5RandomStrings {
    public static void main(String[] args) {
        // Read strings from the file
        String[] strings = readStringsFromFile("strings.txt");
        
        // Check if the file has been read correctly
        if (strings == null || strings.length == 0) {
            System.out.println("Error reading strings or no strings found.");
            return;
        }

        // Select 5 random strings without repetition
        List<String> randomStrings = getRandomStrings(strings, 5);
        System.out.println("5 Randomly selected Strings: " + randomStrings);
    }

    // Method to read strings from a file into an array
    public static String[] readStringsFromFile(String filePath) {
        List<String> stringsList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringsList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;  // Return null in case of error
        }

        // Convert the list to an array and return it
        return stringsList.toArray(new String[0]);
    }

    // Method to get random strings (without repetition)
    public static List<String> getRandomStrings(String[] array, int numSelections) {
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);  // Shuffle to randomize the list
        return list.subList(0, Math.min(numSelections, list.size()));  // Get first 'numSelections' items
    }
}
