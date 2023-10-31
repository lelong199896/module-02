package FizzBuzz;

import java.util.Scanner;

public class FizzBuzzTranslate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int inputNumber = scanner.nextInt();
           if (((inputNumber % 3) == 0) && ((inputNumber % 5) == 0)) {
               System.out.println("FizzBuzz");
           } else if ((inputNumber % 5) == 0) {
               System.out.println("Fizz");
           } else if ((inputNumber % 3) == 0) {
               System.out.println("Buzz");
           }

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter Number: ");
        String number = scanner1.nextLine();
        String[] textNumber = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if (Integer.parseInt(String.valueOf(number.charAt(i))) == 3) {
                System.out.println("Fizz");
            } else if (Integer.parseInt(String.valueOf(number.charAt(i))) == 5) {
                System.out.println("Buzz");
            }
        }
        if (Integer.parseInt(number) % 10 != 0) {
            for (int i = 0; i < number.length(); i++) {
                result = new StringBuilder(result.append(textNumber[Integer.parseInt(String.valueOf(number.charAt(i)))]) + " ");
            }
        } else {
            result = new StringBuilder(result.append(textNumber[Integer.parseInt(String.valueOf(number.charAt(0)))]) + " mươi");
            }
        System.out.println(result);
    }
}
