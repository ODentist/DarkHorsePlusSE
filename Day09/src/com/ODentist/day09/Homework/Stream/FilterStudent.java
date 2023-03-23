package com.ODentist.day09.Homework.Stream;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStudent {
    public static void main(String[] args) {
        Set<String> setStudent1 = Stream.of("王佳乐", "张三丰", "王思聪", "张飞", "刘晓敏", "张靓颖", "王敏").collect(Collectors.toSet());
        Set<String> setStudent2 = Stream.of("王佳乐", "张三丰", "王思聪", "张飞", "刘晓敏", "张靓颖", "王敏").collect(Collectors.toSet());
        setStudent1.stream().filter(s -> s.startsWith("张")).limit(2).forEach(s -> System.out.print(s));
        System.out.println("");
        System.out.println("--------------");
        setStudent1.stream().filter(s -> s.startsWith("王")).skip(1).forEach(s -> System.out.print(s));

    }

}
