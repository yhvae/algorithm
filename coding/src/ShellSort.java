public class ShellSort {
    public static void shellSort(int[] arr) {
        int len = arr.length;
        for (int i = len / 2; i > 0; i = i / 2) {
            for (int j = i; j < len; j++) {
                int h = j;
                int temp = arr[h];
                while (h >= 0 && temp < arr[h - i]) {
                    arr[h] = arr[h - i];
                    h-=i;
                }
                arr[h]=temp;
            }
        }
    }
}
