package CheckPalindrome;


import java.util.Scanner;

import static CheckPalindrome.Palindrome.checkPalindrome;

public class PalindromeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        checkPalindrome(s);
    }
}
