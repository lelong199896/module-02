package LargestChain;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> max = new LinkedList<>();

        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (list.size() > 1 && input.charAt(i) <= list.getLast() && list.contains(input.charAt(i))) {
                list.clear();
            }

            list.add(input.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }

        for (Character chr: max) {
            System.out.print(chr);
        }
    }
}
