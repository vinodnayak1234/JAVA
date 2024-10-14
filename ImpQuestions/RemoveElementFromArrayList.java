package ImpQuestions;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromArrayList {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);

        int elementToRemove = 3;

        List<Integer> newList = removeElement(originalList, elementToRemove);
        System.out.println("Original list: " + originalList);
        System.out.println("New list after removal: " + newList);
    }

    // Function to remove an element from an ArrayList
    public static List<Integer> removeElement(List<Integer> list, int element) {
        List<Integer> newList = new ArrayList<>(list); // Create a copy of the original list
        newList.remove(Integer.valueOf(element)); // Remove the specified element
        return newList; // Return the new list
    }
}
