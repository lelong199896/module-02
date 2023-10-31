import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        int[] newArray;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size: ");
        size = scanner.nextInt();
        array = new  int[size];
        newArray = new int[size + 1];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.print("Enter Add Element: ");
        int x = scanner.nextInt();
        System.out.print("Enter Add Position: ");
        int position = scanner.nextInt();
        if (position <= -1 && position >= array.length - 1) {
            System.out.println("Unable to insert element into array.");
        } else {
            for (int j = 0; j < newArray.length; j++) {
                if (j == position) {
                    newArray[position] = x;
                } else if (j < position) {
                    newArray[j] = array[j];
                } else {
                    newArray[j] = array[j - 1];
                }
            }
            System.out.println("New Array = " + Arrays.toString(newArray));
        }
    }
}
