package InsertionSortByStep;

import java.util.Scanner;

public class InsertSortByStep {
    public static void insertionSort(int[] list) {
        int position;
        int element;
        for (int i = 0; i < list.length; i++) {
            element = list[i];
            position = i;
            while (position > 0 && element < list[position - 1]) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = element;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            list[i] = scanner.nextInt();
        }

        System.out.print("List input: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        insertionSort(list);
        System.out.print("\nInsertionSort: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
