package com.ODentist.day08.HomeWork.PluseWork.MylinkedList;

import java.util.LinkedList;

public class WeaknessVersion {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("zhangsan"));
        students.add(new Student("lisi"));
        students.add(new Student("wangwu"));
        students.add(new Student("zhaoliu"));
        students.add(new Student("xiangming"));
        Student student = students.get(3);
        System.out.println(student);
        students.addFirst(new Student("xiao hong"));
        students.addLast(new Student("last"));
        for (Student student1 : students) {
            System.out.print(student1);

        }
    }
}
