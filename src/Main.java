import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        long[] digit = new long[]{4, 7, 6, 1, 2, 8};

        System.out.println(Arrays.toString(digit));
        QuickSort.sort(digit);
        System.out.println(Arrays.toString(digit));

        int size = 100_000;
        long[] a1 = new long[size];
        long[] a2 = new long[size];
        long[] a3 = new long[size];
        Random random = new Random();
        long start;
        long end;

        for (int i = 0; i < size; i++) {
            long l = random.nextLong();
            a1[i] = l;
            a2[i] = l;
            a3[i] = l;
        }

        start = System.currentTimeMillis();
        QuickSort.sort(a1);
        end = System.currentTimeMillis() - start;
        System.out.println(end);

        start = System.currentTimeMillis();
        QuickSort.slowSort(a2);
        end = System.currentTimeMillis() - start;
        System.out.println(end);

        start = System.currentTimeMillis();
        bubbleSort(a3);
        end = System.currentTimeMillis() - start;
        System.out.println(end);
    }

    public static void bubbleSort(long[] array) {
        int l = array.length;
        long min;
        for (int j = 0; j < l; j++) {
            for (int i = 0; i < l - 1; i++) {
                if (array[i] < array[i + 1]) {
                    min = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = min;
                }
            }
        }

    }
}
