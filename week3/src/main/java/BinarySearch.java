import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */

        System.out.println("Array:");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        System.out.println("Binary search result: " + binarySearch(list, key));
        System.out.println("Binary search using recursion result: " + recursionBinarySearch(list, key, 0, list.length - 1));

    }

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1; /* Now high < low, key not found */
    }

    static int recursionBinarySearch(int[] list, int key, int low, int high) {
        int mid = (high + low) / 2;
        if (list[mid] == key) {
            return mid;
        }
        if (key < list[mid]) {
            return recursionBinarySearch(list, key, low, mid - 1);
        }
        if (key > list[mid]) {
            return recursionBinarySearch(list, key, mid + 1, high);
        }
        return -1;
    }
}
