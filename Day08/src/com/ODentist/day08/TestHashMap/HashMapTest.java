package com.ODentist.day08.TestHashMap;

import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
      Map<String, Integer> map = new java.util.HashMap<>();
      map.put("java",100);
      map.put("python",100);
      map.put("C++",100);
      map.put("C#",100);
      map.put("C#",100);
        System.out.println(map);
        System.out.println("===============");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("-------------");
        map.forEach((k,v)-> System.out.println(k +"   "+v));
    }
}
