package binarySearchQuickSort;

public class QuickSort {
    public static void qs(int array[], int start, int end) {// быстрая сортировка static чтобы не создавать объект в main-е
        if (start >= end) { // если в масииве только 1 ячейка останавливаем процесс
            return;
        }
        int indexP = partition(array, start, end); // индекс опорной точки
        qs(array, start, indexP - 1); // рекурсивно сортируем левую часть
        qs(array, indexP + 1, end);  // рекурсивно сортируем правую часть
    }

    public static int partition(int array[], int start, int end) {
        int value = array[end]; // значение опорной точки
        int position = start;

        for (int i = start; i < end; i++) { // проходимся по всем элементам массива
            if (array[i] < value) { //

                int temp = array[i]; // временно передаем найденное меньшее значение эелемента
                array[i] = array[position]; // на освободившееся место передаем значение которое по индексу позиции
                array[position] = temp; // после на данную позицию переставляем значение ранее переданное в temp)
                position++; // инкремент для дальнейшего поиска
            }
        }
        array[end] = array[position]; // значение по индексу позиции передаем на концец массива
        array[position] = value; // значение опорного элемента передаем в освободивуюся позициию
        return position; // индекс опорной позиции
    }
}