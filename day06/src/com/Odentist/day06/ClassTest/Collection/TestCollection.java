package com.Odentist.day06.ClassTest.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.removeIf((String s)->{
            return  s.length()==3;
        });
        System.out.println(c.contains("3"));

        Student zhangsan = new Student("zhangsan", 11);
        Student lisi = new Student("lisi", 11);
        Student wangwu = new Student("wangwu", 11);
        Collection<Student> s = new ArrayList<>();
        s.add(zhangsan);
        s.add(lisi);
        s.add(wangwu);
        Student zhangsan1 = new Student("zhangsan", 11);
        System.out.println(  s.contains(zhangsan1));


    }
}
