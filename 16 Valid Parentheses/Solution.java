//Valid Parentheses

import java.util.Stack;

public class Solution {
    public static boolean isValidParenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        java.util.Map<Character, Character> matchingBrackets = new java.util.HashMap<>();
        matchingBrackets.put(')', '(');
        matchingBrackets.put('}', '{');
        matchingBrackets.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char charAtI = s.charAt(i);
            if (matchingBrackets.containsValue(charAtI)) {
                stack.push(charAtI);
            } else if (matchingBrackets.containsKey(charAtI)) {
                if (stack.isEmpty() || stack.pop() != matchingBrackets.get(charAtI)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
