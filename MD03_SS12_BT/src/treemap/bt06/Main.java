package treemap.bt06;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int number = (int) Math.round(Math.random() * 100);
            numberList.add(i, number);
        }
        System.out.println(numberList);
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (Integer num : numberList) {
            treeMap.put(num, 0);
        }
        System.out.println(treeMap);
    }
}
