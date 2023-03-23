package com.ODentist.day08.HomeWork.CharDistinct;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharDistinct {
    public static void main(String[] args) {
        List<String> collect = Stream.of("a", "f", "b", "c", "a", "d").collect(Collectors.toList());
        TreeSet<String> t = new TreeSet<>(((o1, o2) -> o1.compareTo(o2)));//本来按字符顺序排列
        for (String s : collect) {
            t.add(s);
        }
        System.out.println(t);
    }
}
