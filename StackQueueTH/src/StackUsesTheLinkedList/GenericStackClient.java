package StackUsesTheLinkedList;

import static StackUsesTheLinkedList.MyGenericStack.stackOfIStrings;
import static StackUsesTheLinkedList.MyGenericStack.stackOfIntegers;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
