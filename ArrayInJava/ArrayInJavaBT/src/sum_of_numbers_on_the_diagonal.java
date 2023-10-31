import java.util.Scanner;

public class sum_of_numbers_on_the_diagonal {
    public static void main(String[] args) {
        int size;
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size: ");
        size = scanner.nextInt();
        array = new  int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Array[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Array: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
        int sum = array[0][0];
        for (int i = 1; i < size; i++) {
            sum += array[i][i];
        }
        System.out.println("Sum of numbers on the diagonal: " + sum);
    }
}
