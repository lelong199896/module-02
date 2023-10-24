package CheckBracket;

import java.util.Scanner;

import static CheckBracket.Bracket.checkBracket;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println(checkBracket(str));
    }
}
