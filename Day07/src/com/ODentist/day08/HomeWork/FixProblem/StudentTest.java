package com.ODentist.day08.HomeWork.FixProblem;

import java.util.TreeSet;

public class StudentTest {
    public static void main(String[] args) {
        TreeSet<Student> s1 = new TreeSet<>();
        s1.add(new Student("student1",16));
        s1.add(new Student("itheima",16));
        s1.add(new Student("itcast",22));
        System.out.println(s1);
    }
}
