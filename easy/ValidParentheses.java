package easy;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "{({}{}()";
        System.out.println(isValid(s));
    }

    /*
     * Runtime: 1 ms, faster than 98.75% of Java online submissions for Valid
     * Parentheses. Memory Usage: 37.2 MB, less than 60.96% of Java online
     * submissions for Valid Parentheses.
     */
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.empty()) {
                stack.add(s.charAt(i));
            } else if (s.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (s.charAt(i) == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (s.charAt(i) == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                return false;
            } else {
                stack.add(s.charAt(i));
            }
        }
        return stack.empty();
    }
}
