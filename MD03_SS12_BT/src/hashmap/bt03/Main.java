package hashmap.bt03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Pilo");
        map.put(1, "CiLo");
        map.put(2, "BiLo");
        map.put(5, "Zilo");
        map.put(4, "Milo");
        List<Map.Entry<Integer, String>> listSortByKey = new ArrayList<>(map.entrySet());
//        listSortByKey.sort((entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()));
        listSortByKey.sort(Comparator.comparing(Map.Entry::getKey));
        List<Map.Entry<Integer, String>> listSortByValue = new ArrayList<>(map.entrySet());
//        listSortByValue.sort((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));
        listSortByValue.sort(Comparator.comparing(Map.Entry::getValue));
        for (Map.Entry<Integer, String> entry : listSortByKey) {
            System.out.println("sort by key: " + entry);
        }
        for (Map.Entry<Integer, String> entry : listSortByValue) {
            System.out.println("sort by value: " + entry);
        }
    }
}
