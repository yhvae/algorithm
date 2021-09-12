package sort;

public class MergeSort {
    public static void mergeSort(int[] arr, int low, int high) {
        int middle = (low + high) / 2;
        System.out.println(100 + 1);
        if (low < high) {
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            merge(arr, low, middle, high);
        }
    }

    private static void merge(int[] arr, int low, int middle, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = middle + 1;
        int k = 0;
        while (i <= middle && j <= high) {
            if (arr[i] <= arr[j]) {
                arr[k++] = arr[i++];
                i++;
            } else {
                arr[k++] = arr[j++];
            }
        }

        while (i < middle) {
            arr[k++] = arr[i++];
        }

        while (j < high) {
            arr[k++] = arr[j++];
        }

        for (int h = 0; h < temp.length; h++) {
            arr[low + h] = temp[h];
        }

    }
}
