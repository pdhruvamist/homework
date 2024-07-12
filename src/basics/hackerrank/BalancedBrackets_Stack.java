package basics.hackerrank;

import java.util.Stack;

public class BalancedBrackets_Stack {

    public static void main(String[] args) {
        System.out.println(isBalanced("{[(])}"));
 //       System.out.println(isBalanced("{{[[(())]]}}"));
    }

    private static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
                char popped = stack.pop();
                if(s.charAt(i) == '}' && popped != '{') {
                    return false;
                }
                if(s.charAt(i) == ']' && popped != '[') {
                    return false;
                }
                if(s.charAt(i) == ')' && popped != '(') {
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
