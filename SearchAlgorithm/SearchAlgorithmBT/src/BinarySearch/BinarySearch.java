package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Number to find in position: " + binarySearch());
    }

    static int binarySearch() {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        List<Integer> arr = new ArrayList<>();
        while (input != "") {
            arr.add(Integer.valueOf(input));
            System.out.print("Enter a number: ");
            input = scanner.nextLine();
        }
        int[] arrSort = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
                arrSort[i] = arr.get(i);
            }
        Arrays.sort(arrSort);
        System.out.println("Array = " + Arrays.toString(arrSort));

        System.out.print("Enter the number you want to find: ");
        int numner = scanner.nextInt();
        int left = 0;
        int right = arrSort.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arrSort[mid] == numner) {
                return mid;
            } else if (arrSort[mid] < numner) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
