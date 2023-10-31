package ReverseUserStack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseUserStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int size = stack.size();
        System.out.println(stack);
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop() + " ");
        }

//        Stack<String> stack1 = new Stack<>();
        stack.push("abc");
        stack.push("def");
        stack.push("ghk");
        int size1 = stack.size();
        System.out.println("\n" + stack);
        for (int i = 0; i < size1; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
