import java.util.Scanner;

public class sum_of_numbers_in_a_column {
    public static void main(String[] args) {
        int size;
        int size1;
        int[][] array;
        int column;
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
        System.out.println("Array: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.print("Enter column: ");
        column = scanner.nextInt();
        int sum = 0;
        for (int j = 0; j < size1; j++) {
            sum += array[j][column - 1];
        }
        System.out.println("column sum " + column + ": " + sum);
    }
}
