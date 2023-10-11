package arrays.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 5, 10, 4, 10, 60, 1));
        System.out.println(mergeArrayList(list1));
    }

    public static List<Integer> mergeArrayList(List<Integer> list1) {
        for (int i = 0; i < list1.size(); i++) {
            int c = Collections.frequency(list1, list1.get(i));
            if (c > 1) {
                list1.remove(i);
            }
        }
        return list1;
    }
}