package treemap.bt10;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 1; i <= 5; i++) {
            int number = (int) Math.round(Math.random() * 100);
            treeMap.put(number, i);
        }
        System.out.println(treeMap);
        for (Integer integer : treeMap.keySet()) {
            treeMap.remove(integer);
            break;
        }
        System.out.println(treeMap);

    }
}
