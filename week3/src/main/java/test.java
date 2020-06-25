import javax.naming.PartialResultException;

public class test {
    public static void main(String[] args) {
        int[] arr = {45, 2, 7, 5, 6, 34, 8, 4, 27, 13, 77, 56};
        insertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
//insert list[i] into a sorted sublist list[0...i-1] //so that list[0..i] is sorted
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
//insert the current elemtn into list[k+1]
            System.out.println("K= " + k);
            list[k + 1] = currentElement;
        }
    }
}
