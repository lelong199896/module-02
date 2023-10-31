package ConvertDecimalToBinary;

import java.util.Scanner;
import java.util.Stack;

public class DicimalToBinary {
    public static int dicimalToBinary(int num) {
        Stack<Integer> stack = new Stack<>();
        while (num != 0) {
            int surplus = num % 2;
            stack.push(surplus);
            num /= 2;
        }
        System.out.print("Binary representation is: ");
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
        return num;
    }
}
