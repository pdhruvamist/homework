package basics.hackerrank;

public class Palindrome2pointers {

    public static void main(String[] args) {
        String first="GODDOG";

        System.out.println(isPalindrome(first));
    }

    private static boolean isPalindrome(String first) {
        int left=0;
        int right=first.length()-1;

        while(left < right) {
            if(first.codePointAt(left) != first.codePointAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
