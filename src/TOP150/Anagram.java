package TOP150;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> anagrams = new HashMap<>();

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            System.out.println(sortedWord);

            if (!anagrams.containsKey(sortedWord)) {
                anagrams.put(sortedWord, new ArrayList<>());
                System.out.println(anagrams);

            }
            anagrams.get(sortedWord).add(word);

        }

        System.out.println("Hello : "+ anagrams);
    }
}