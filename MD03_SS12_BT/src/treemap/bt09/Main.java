package treemap.bt09;

import java.util.Comparator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 1; i <= 5; i++) {
            int number = (int) Math.round(Math.random() * 100);
            treeMap.put(number, 0);
        }
        System.out.println(treeMap);

    }
}
