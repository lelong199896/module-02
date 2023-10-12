import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementsInArray {
    public static void main(String[] args) {
        int[] array = new  int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.print("Enter Delete Element: ");
        int x = scanner.nextInt();
        for (int index_del = 0; index_del < array.length; index_del++) {
            if (x == array[index_del]) {
                for (int j = index_del; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                System.out.println("Position " + x + " is: " + index_del);
            }
        }
        System.out.println("New Array = " + Arrays.toString(array));
    }
}
