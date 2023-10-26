package InsertionSort;

public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

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
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
