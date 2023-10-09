package binarySearchQuickSort;

public class QuickSort {
    static void qs(int[] array, int s, int end) {// быстрая сортировка static чтобы не создавать объект в main-е
        if (s >= end) {
            return;
        }
        int index = sort(array, s, end);
        qs(array, s, index - 1);
        qs(array, index + 1, end);
    }

    static int sort(int[] array, int s, int end) {
        int op = array[end];
        int p = s;
        for (int i = s; i < end; i++) {
            if (array[i] < op) {
                int tepm = array[i];
                array[i] = array[p];
                array[p] = tepm;
                p++;
            }
        }
        array[end] = array[p];
        array[p] = op;
        return p;
    }
}
