public class QuickSort {

    public static void sort(long[] array) {
        if (array.length <= 1) {
            return;
        }
        sort(array, 0, array.length - 1);
    }

    private static void sort(long[] array, int from, int to) {
        if (from < to) {
            int pivot = partition(array, from, to);
            sort(array, from, pivot - 1);
            sort(array, pivot + 1, to);
        }
    }

    private static int partition(long arr[], int begin, int end) {
        long pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                long swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        long swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

    public static void slowSort(long[] array) {
        if (array.length <= 1) {
            return;
        }
        slowSort(array, 0, array.length - 1);
    }

    private static void slowSort(long[] array, int from, int to) {
        if (from < to) {
            int pivot = slowPartition(array, from, to);
            slowSort(array, from, pivot - 1);
            slowSort(array, pivot + 1, to);
        }
    }

    private static int slowPartition(long[] array, int from, int to) {
        int pivot = from;

        for (int i = pivot; i <= to; i++) {
            if (array[pivot] > array[i]) {
                change(array, pivot, i);

                for (int j = i; j > pivot + 1; j--) {
                    change(array, j, j - 1);
                }
                pivot++;
            }
        }
        return pivot;
    }

    private static void change(long[] array, int i1, int i2) {
        long temp = array[i2];
        array[i2] = array[i1];
        array[i1] = temp;
    }

}
