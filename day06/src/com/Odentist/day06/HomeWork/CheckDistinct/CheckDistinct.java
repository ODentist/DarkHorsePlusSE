package com.Odentist.day06.HomeWork.CheckDistinct;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckDistinct {
    public static void main(String[] args) {
        List<String> collect = Stream.of("a", "f", "b", "c", "a", "d").collect(Collectors.toList());
        List<String> collect1 = collect.stream().distinct().collect(Collectors.toList());
        collect=collect1;
        System.out.println(collect);
    }
}
