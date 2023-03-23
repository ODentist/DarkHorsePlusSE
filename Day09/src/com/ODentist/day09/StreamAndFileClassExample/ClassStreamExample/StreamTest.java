package com.ODentist.day09.StreamAndFileClassExample.ClassStreamExample;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        // 1、如何获取List集合的Stream流？
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张三丰", "张无忌", "周芷若", "赵敏", "张强");

// 2、如何获取Set集合的Stream流？
       Set<String> set = new HashSet<>();
       Collections.addAll(set,"刘德华", "张曼玉", "蜘蛛精", "马德", "德玛西亚");

        // 3、如何获取Map集合的Stream流？
        Map<String, Double> map = new HashMap<>();
        map.put("古力娜扎", 172.3);
        map.put("迪丽热巴", 168.3);
        map.put("马尔扎哈", 166.3);
        map.put("卡尔扎巴", 168.3);

        //1
        Set<String> set1 = map.keySet();
        Stream<String> stream = set1.stream();

        //entry
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        Stream<Map.Entry<String, Double>> stream1 = entries.stream();


        //collection
        Collection<Double> values = map.values();
        Stream<Double> stream2 = values.stream();



    }
}
