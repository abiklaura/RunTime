package arrays.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(7, 9, 1, 10, 10, 2, 3, 6));
        System.out.println(mergeArrayList(list1, list2));
    }

    public static List<Integer> mergeArrayList(List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    list.add(list2.get(j));
                }
            }
        }
        return list;
    }
}