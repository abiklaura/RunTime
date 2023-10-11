package arrays.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 8, 10));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(-2, -1, 4, 9, 16, 20, 30));
        System.out.println(mergeArrayList(list1, list2));

    }

    public static List<Integer> mergeArrayList(List<Integer> list1, List<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) { // если данный элемент содержится в 2-х списках, дублируем
                    result.add(list2.get(j));
                }
                if (list1.get(i) > list2.get(j)) {
                    if (result.contains(list2.get(j))) continue; // если данный элемент ранее был добавлен, пропускаем
                    else result.add(list2.get(j));
                } else {
                    continue;
                }
            }
            result.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) > list1.get(list1.size() - 1))
                result.add(list2.get(i));
            // если в содержании list2 есть элементы больше посл. знач. list1, то всех добавляем
        }
        return result;
    }
}