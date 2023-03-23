package com.ODentist.day08.TreeSet;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class StringCompare {
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
//        TreeSet<String> strings = new TreeSet<>((s1, s2) -> {
//            return s1.compareTo(s2);
//        });
        s.add("zhangsan");
        s.add("lisi");
        s.add("wangwu");
        s.add("zhaoliu");

        for (String s1 : s) {
            System.out.println(s1);

        }

    }

}
