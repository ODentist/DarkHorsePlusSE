package com.ODentist.day09.StreamAndFileClassExample.ClassStreamExample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayStreamListTest {
    public static void main(String[] args) {
        List<String> actors = Stream.of("张国立", "张晋", "刘烨", "郑伊健", "徐峥", "王宝强").collect(Collectors.toList());
        List<String> actress = Stream.of("郑爽", "杨紫", "关晓彤", "张天爱", "杨幂", "赵丽颖").collect(Collectors.toList());
        Stream<String> limit = actors.stream().filter((a) -> a.length() == 3).limit(2);
        List<String> yang = actress.stream().filter(s -> s.startsWith("杨")).collect(Collectors.toList());
        yang.remove(0);
        for (String s : yang) {
            System.out.println(s);
        }
        List<Actor> collect = Stream.concat(limit, yang.stream()).map(s -> new Actor(s)).collect(Collectors.toList());
        System.out.println(collect);


    }
}
