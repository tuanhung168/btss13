package hashmap.bt04;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("k",123);
        map.put("d",789);
        map.put("f",654);
        map.put("h",741);
        map.put("p",963);
        System.out.println(map);
        Map<String, Integer> newMap = new HashMap<>();
        newMap.putAll(map);
        System.out.println(newMap);
    }
}
