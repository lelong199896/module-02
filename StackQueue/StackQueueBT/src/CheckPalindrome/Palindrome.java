package CheckPalindrome;
import java.util.Stack;

public class Palindrome {
    public static void checkPalindrome(String str) {
        str = str.toLowerCase();
        Stack<Character> stack = new Stack<>();
        boolean isPalindrome = true;

        for (int i = 0; i < str.length(); i++) {
         stack.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("'" + str + "' is a palindrome");
        } else {
            System.out.println("'" + str + "' is not a palindrome");
        }
    }
}
