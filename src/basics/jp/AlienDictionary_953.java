package basics.jp;

import java.util.HashMap;
import java.util.Map;

public class AlienDictionary_953 {

    public static void main(String[] args) {
//        String[] words = {"word", "world", "row"}; -----> false
//        String order = "worldabcefghijkmnpqstuvxyz";
        String order = "hlabcdefgijkmnopqrstuvwxyz";  // -----> true
        String[] words = {"hello", "leetcode"};
        System.out.println(isSortedByAlienDictionary(words, order));
    }

    static Map<Character, Integer> charByIndex = new HashMap<>();

    private static boolean isSortedByAlienDictionary(String[] words, String order) {
        //store order into Map<Char, DictionaryIndex>
        for (int i = 0; i < order.length(); i++) {
            charByIndex.put(order.charAt(i), i);
        }

        for (int i = 0; i < words.length-1; i++) {
            // <= 0 means sorted or equal words
            if (compareWords(words[i], words[i + 1]) > 0) {
                return false;
            }
        }

        return true;
    }

    private static int compareWords(String word1, String word2) {
        int charVal = 0;

        int first = 0;
        int second = 0;

        //exhaust any of arrays iterations or
        while (first < word1.length() && second < word2.length() && charVal == 0) {
            charVal = charByIndex.get(word1.charAt(first)) - charByIndex.get(word2.charAt(second));

            first++;
            second++;
        }

        if (charVal == 0) {
            return word1.length() - word2.length();
        }

        return charVal;
    }
}
