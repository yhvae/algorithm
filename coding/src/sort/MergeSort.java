package sort;

public class MergeSort {
    public static void mergeSort(int[] arr, int low, int high) {
        int middle = (low + high) / 2;
        if (low < high) {
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            System.out.println(100 + 1);
            merge(arr, low, middle, high);
        }
    }

    private static void merge(int[] arr, int low, int middle, int high) {
        int[] temp = new int[high - low + 1];

    }
}
