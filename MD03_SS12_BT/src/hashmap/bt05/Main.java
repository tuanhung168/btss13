package hashmap.bt05;

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
        System.out.println("map: "+map);
        Map<String, Integer> newMap = new HashMap<>();
        newMap.putAll(map);
        newMap.put("a",666);
        newMap.put("b",777);
        newMap.put("c",888);
        System.out.println("new map: "+newMap);
                for (String s : newMap.keySet()) {
                    System.out.println("the existence of value: "+newMap.get(s)+" in map is "+map.containsKey(s));
                }

            }
    }

