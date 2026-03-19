package Stacks.Easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses_LC20 {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                char topChar = stack.pop();

                if ((c == ')' && topChar != '(') ||
                    (c == ']' && topChar != '[') ||
                    (c == '}' && topChar != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
