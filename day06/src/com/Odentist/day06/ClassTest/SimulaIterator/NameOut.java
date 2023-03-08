package com.Odentist.day06.ClassTest.SimulaIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameOut {
    public static void main(String[] args) {
     List<String> list = new ArrayList<>();
     list.add("张三丰");
     list.add("李四");
     list.add("王五");
     list.add("欧阳欣欣");
     list.add("李大嘴");

        List<String> collect = list.stream().filter((s) -> s.length() == 3).collect(Collectors.toList());
        Iterator<String> iterator1 = collect.iterator();
        while (iterator1.hasNext()){
            String next = iterator1.next();
            System.out.println(next);
        }
        System.out.println("-------------");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.length()==3){
                System.out.println(next);
            }
        }

    }
}
