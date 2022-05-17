package problems.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWord {

    /*
     *
     * write a java code to find the duplicate words and their number of occurrences in the string
     * also Find the average length of the words
     *
     */

    public static void main(String[] args) {

        String str = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language, Java is also coffee";
        String[] words = str.split("\\W");

        Map<String, Integer> word_map = new HashMap<>();
        for (String word : words) {
            if (word_map.get(word) != null) {
                word_map.put(word, word_map.get(word) + 1);
            }
            else {
                word_map.put(word, 1);
            }
        }

        Set<String> word_set = word_map.keySet();

        // We are iterating in word set
        for (String word : word_set) {
            if (word_map.get(word) > 1) {
                System.out.println(word);
            }
        }
    }
}
