package BinarySearch;

public class BinarySearch {
    static int[] list = {2,4,5,7,12,15,19,20,24,30};
    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 30));
    }
}
