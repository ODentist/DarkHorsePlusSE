package com.ODentist.day08.HomeWork;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class checkFruit {
    public static void main(String[] args) {
        List<String> list = Stream.of("苹果", "香蕉", "西瓜", "橘子").collect(Collectors.toList());
        Set<Integer> s = new HashSet<>();


        Map<String,String> fruitMap = new HashMap<>();
        int[] i = new int[10];
        for (String s2 : list) {
            StringBuilder stringBuilder = new StringBuilder();
            Random random = new Random();
            while (s.size()<=7){
                int i1 = random.nextInt(i.length);
                s.add(i1);
            }
            for (Integer integer : s) {
                stringBuilder.append(integer);
            }
            String s1 = stringBuilder.toString();
            fruitMap.put(s2,s1);
        }

        System.out.println(fruitMap);

    }
}
