package binarySearchQuickSort;

public class BinarySearch {
    static int binary(int[] array, int b) { // бинарный поиск static чтобы не создавать объект в main-е
        int l = 0;
        int r = array.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (array[m] == b) {
                return m;
            } else if (array[m] < b) {
                l = m + 1;
            } else r = m - 1;
        }
        return 0;
    }
    static int binarySearch(int[] a, int key) {

        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int middle = left + (right-left) / 2;

            if (a[middle] == key) {
                return middle; // нашли элемент, возвращаем индекс
            } else if (a[middle] < key) { // правая часть
                left = middle + 1;
            } else {
                right = middle - 1; // левая часть
            }
        }
        return -1;
    }
}