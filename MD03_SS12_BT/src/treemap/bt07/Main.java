package treemap.bt07;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 1; i <= 5; i++) {
            int number = (int) Math.round(Math.random() * 100);
            treeMap.put(number, 0);
        }
        System.out.println(treeMap);
        System.out.println(treeMap.lastKey());
        treeMap.remove( treeMap.lastKey());
        treeMap.lastKey();
        System.out.println(treeMap.lastKey());
    }
}
