package com.ODentist.day09.Homework.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeStudent {
    public static void main(String[] args) {
        List<String> studentList1 = Stream.of("王佳乐", "张三丰", "王思聪", "张飞", "刘晓敏", "张靓颖", "王敏").collect(Collectors.toList());
        List<String> studentList2 = Stream.of("王佳乐", "张三丰", "王思聪", "张飞", "刘晓敏", "张靓颖", "王敏").collect(Collectors.toList());
        Stream<String> wang = studentList1.stream().filter(s -> s.startsWith("王"));
        Stream<String> zhang = studentList1.stream().filter(s -> s.startsWith("张"));
        Stream.concat(wang, zhang).filter(s -> s.length()==3).forEach(s-> System.out.println(s));


    }
}
