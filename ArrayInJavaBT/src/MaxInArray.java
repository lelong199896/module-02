import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        int size;
        int size1;
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size: ");
        size = scanner.nextInt();
        System.out.print("Enter a size1: ");
        size1 = scanner.nextInt();
        array = new  int[size][size1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < size1; j++) {
            System.out.print("Array[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
        int max = array[0][0];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Largest element in the array: " + max);
    }
}
