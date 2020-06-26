public class InsertionSortDescription {
    public static void main(String[] args) {
        int[] array = {5, 8, 7, 3, 9, 1, 4, 2, 6};
        insertionSort(array);
    }

    public static void insertionSort(int[] array) {
        System.out.println("Array before sort:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i < array.length; i++) {
            System.out.printf("---Insertion sort loop %d---\n", i);
            int current = array[i];
            int k = 0;
            for (k = i - 1; k >= 0 && array[k] > current; k--) {
                array[k + 1] = array[k];
            }
            if (current != array[k+1]){
                System.out.printf("Insert value (%d) in front of value (%d).\n",current,array[k+1]);
            }else {
                System.out.println("Do nothing.");
            }

            array[k + 1] = current;


        }
        System.out.println("Array after sort:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
