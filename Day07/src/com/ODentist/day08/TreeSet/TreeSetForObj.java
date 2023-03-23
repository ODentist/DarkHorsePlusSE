package com.ODentist.day08.TreeSet;

import java.util.TreeSet;

public class TreeSetForObj {
    public static void main(String[] args) {
        TreeSet<Student> s = new TreeSet<>();
        s.add(new Student("s1",22));
        s.add(new Student("s4",22));
        s.add(new Student("s5",22));
        s.add(new Student("s6",22));
        s.add(new Student("s2",21));
        s.add(new Student("s3",26));
        System.out.println(s.toString());
    }
}
