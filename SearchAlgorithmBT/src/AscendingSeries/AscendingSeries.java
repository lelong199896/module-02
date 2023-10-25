package AscendingSeries;

import java.util.LinkedList;
import java.util.Scanner;

public class AscendingSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(input.charAt(i));
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) > list.getLast()) {
                    list.add(input.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character chr: max) {
            System.out.print(chr);
        }
    }



}
