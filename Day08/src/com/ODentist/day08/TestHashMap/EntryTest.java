package com.ODentist.day08.TestHashMap;

import java.util.HashMap;
import java.util.Map;

public class EntryTest {
    public static void main(String[] args) {
        String s="adasdafawa10dfomi1o2你好";
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (map.containsKey(aChar)){
                Integer value = map.get(aChar);
                value++;
                map.put(aChar,value);
            }else {
                map.put(aChar,1);
            }
        }
        System.out.println(map);
    }
}
