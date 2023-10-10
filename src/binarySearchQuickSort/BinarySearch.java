package binarySearchQuickSort;

public class BinarySearch {
    static int binary(int[] array, int key) { // бинарный поиск static чтобы не создавать объект в main-е
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == key) {
                return middle; // нашли элемент, возвращаем индекс
            } else if (array[middle] < key) { // правая часть
                left = middle + 1;
            } else {
                right = middle - 1; // левая часть
            }
        }
        return 0;
    }
}