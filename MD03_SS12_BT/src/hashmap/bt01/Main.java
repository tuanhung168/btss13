package hashmap.bt01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) Math.round(Math.random()*100);
            numberList.add(i,number);
        }
        System.out.println(numberList);
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer num:numberList){
            if(map.containsKey(num) ){
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num,1);
            }
        }
        System.out.println(map);
    }

    }
