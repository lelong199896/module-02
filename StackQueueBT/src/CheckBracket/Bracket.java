package CheckBracket;

import java.util.Stack;

public class Bracket {
    static Stack<Character> stack = new Stack<>();
    public static boolean checkBracket(String str) {
        for (char sym : str.toCharArray()) {
            if (sym == '(') {
                stack.push(sym);
            } else if (sym == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char left = stack.pop();
                if (left != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
