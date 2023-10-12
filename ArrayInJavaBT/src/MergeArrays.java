import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = new  int[3];
        int[] array2 = new  int[4];
        int[] array3 = new int[7];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }
        System.out.println("Array1 = " + Arrays.toString(array1));

        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }
        System.out.println("Array2 = " + Arrays.toString(array2));

        for (int i = 0; i < array3.length; i++) {
            if (i < array1.length) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - array1.length];
            }
        }
        System.out.println("array3 = " + Arrays.toString(array3));
    }
}
