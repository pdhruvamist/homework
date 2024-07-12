package basics.jp;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        if ((null==first || first.isEmpty() || null==second || second.isBlank()) || (first.length()!=second.length())) {
            System.out.println("Not Anagram");
        } else {
            int[] alphabets = new int[26];
            for (int i=0; i < first.length(); i++) {
                alphabets[first.codePointAt(i) - 'a']++;
                alphabets[second.codePointAt(i) - 'a']--;
            }

            System.out.println(Arrays.stream(alphabets).noneMatch(alph -> alph > 0));
        }
    }
    
}
