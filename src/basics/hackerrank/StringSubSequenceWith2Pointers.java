package basics.hackerrank;

public class StringSubSequenceWith2Pointers {
    public static void main(String[] args) {
        String first = "ace";
        String other = "abed";

        System.out.println(isSubSequence(first, other));
    }

    private static boolean isSubSequence(String first, String other) {
        int i=0;
        int j=0;

        while(i < first.length() && j < other.length()) {
            if(first.codePointAt(i) == other.codePointAt(j)) {
                i++;
            }
            j++;
        }

        return i==first.length();
    }
}
