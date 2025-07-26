package TOP150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicatesInListOfLists {


    public static void main(String[] args) {

        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(Arrays.asList(-1, 1, 0));
        listOfLists.add(Arrays.asList(-1, 0, 1));

        // HashSet to store unique elements
        HashSet<List<Integer>> uniqueElements = new HashSet<>();
        // List to store duplicates
        List<List<Integer>> duplicates = new ArrayList<>();

        // Iterate through each list in the list of lists
        for (List<Integer> list : listOfLists) {
            // If the list already exists in the HashSet, it's a duplicate
            if (!uniqueElements.add(list)) {
                duplicates.add(list);
            }
        }
        System.out.println(duplicates);
        // Print the duplicates found
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicates found: " + duplicates);
        }

    }
}
