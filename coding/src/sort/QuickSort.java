package sort;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int index = partion2(arr, left, right);
            quickSort(arr, left, index - 1);
            quickSort(arr, index + 1, right);
        }
    }

    public static int partion1(int[] arr, int left, int right) {
        int temp = arr[left];       //设定基准值
        while (left < right) {
            //从右往左寻找比基准小的值，有则赋值
            while (left < right && temp <= arr[right]) {
                right--;
            }
            arr[left] = arr[right];
            //从左往右寻找比基准值大的值，有则赋值
            while (left < right && temp >= arr[left]) {
                left++;
            }
            arr[right] = arr[left];
            //直到left和right相等跳出循环
        }
        arr[left] = temp;
        return left;
    }

    public static int partion2(int[] arr, int left, int right) {
        //选取基准值
        int temp = arr[left];
        int index = left + 1;
        //从基准后一个开始，若大于则不移动，若小于基准则和index交换。index是小于基准的最后一个索引
        for (int i = index; i <= right; i++) {
            if (arr[i] < temp) {
                swap(arr, index, i);
                index++;
            }
        }
        swap(arr, left, index-1);
        return index-1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
