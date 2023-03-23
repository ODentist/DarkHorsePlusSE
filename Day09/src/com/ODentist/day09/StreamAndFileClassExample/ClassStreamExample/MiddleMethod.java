package com.ODentist.day09.StreamAndFileClassExample.ClassStreamExample;

import java.util.*;
import java.util.stream.Stream;

public class MiddleMethod {
    public static void main(String[] args) {
        List<Double> list1 = new ArrayList<>();
        Collections.addAll(list1, 88.5, 100.0, 60.0, 99.0, 9.5, 99.6, 25.0);
// 需求1：找出成绩大于等于60分的数据，并升序后，再输出。
        list1.stream().filter(d->d>=60).sorted().forEach(d-> System.out.println(d));

        List<Student> list2 = new ArrayList<>();
        List<Student> list3 = new ArrayList<>();
        Student s1 = new Student("蜘蛛精", 26, 172.5);
        Student s2 = new Student("蜘蛛精", 26, 172.5);
        Student s3 = new Student("紫霞", 23, 167.6);
        Student s4 = new Student("白晶晶", 25, 169.0);
        Student s5 = new Student("牛魔王", 35, 183.3);
        Student s6 = new Student("牛夫人", 34, 168.5);
        Collections.addAll(list2, s1, s2, s3, s4, s5, s6);
        Collections.addAll(list3, s1, s2, s3, s4, s5, s6);


        //list2.stream().filter(student -> student.getAge()>23&&student.getAge()<30).sorted((o1,o2)->o2.getAge()-o1.getAge()).forEach(student -> System.out.println(student.toString()));
        System.out.println("-----------");
        //list2.stream().sorted((o1, o2) -> (int) (o2.getHeight()-o1.getHeight())).limit(3).forEach(student -> System.out.println(student.toString()));
        list3.stream().sorted((o1, o2) ->  (Double.compare(o1.getHeight(),o2.getHeight()))).limit(2).forEach(student -> System.out.println(student.toString()));
        Stream<Student> stu1 = list3.stream().sorted((o1, o2) -> (int) (o1.getHeight() - o2.getHeight())).limit(2);
        //list2.stream().filter(student -> student.getHeight()>168).collect(Collectors.toSet()).forEach(student -> System.out.println(student.getName()));
        Stream<Student> stu2 = list2.stream().filter(student -> student.getHeight() > 168);
        Stream<Student> concat = Stream.concat(stu1, stu2);
        System.out.println("----------------");
        concat.forEach(student -> System.out.println(student.toString()));
    }
}
