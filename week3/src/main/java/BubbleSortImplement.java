public class BubbleSortImplement {
    public static void main(String[] args) {
        int[] array = {6, 3, 5, 9, 1, 0, 2, 4, 7, 10, 11, 8};
        System.out.println("Array before sort:");
        for (int i:array){
            System.out.print(i + " ");
        }
        System.out.println();
        bubbleSort(array);
        System.out.println("Array after sort:");
        for (int i:array){
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        for (int i = 1; i < array.length && !isSorted; i++) {
            isSorted = true;
            for (int k = 0; k < array.length - i; k++) {
                if (array[k] > array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}
