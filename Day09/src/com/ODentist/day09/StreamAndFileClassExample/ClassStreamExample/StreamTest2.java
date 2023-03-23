package com.ODentist.day09.StreamAndFileClassExample.ClassStreamExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        Student s1 = new Student("蜘蛛精", 26, 172.5);
        Student s2 = new Student("蜘蛛精", 26, 172.5);
        Student s3 = new Student("紫霞", 23, 167.6);
        Student s4 = new Student("白晶晶", 25, 169.0);
        Student s5 = new Student("牛魔王", 35, 183.3);
        Student s6 = new Student("牛夫人", 34, 168.5);
        Collections.addAll(list, s1, s2, s3, s4, s5, s6);
        Collections.addAll(list2, s1, s2, s3, s4, s5, s6);

        // 需求1：请计算出身高超过168的学生有几人。
        //long count = list.stream().filter((student -> student.getHeight() > 168)).count();
        //System.out.println(count);

        // 需求2：请找出身高超过170的学生对象，并放到一个新集合中去返回。
        //list.stream().filter(student -> student.getHeight()>170).collect(Collectors.toList()).stream().forEach(student -> System.out.println(student.toString()));
        // 需求3：请找出身高超过170的学生对象，并把学生对象的名字和身高，存入到一个Map集合返回。
        Map<String, Double> collect = list.stream().filter(student -> student.getHeight() > 170).distinct().collect(Collectors.toMap(Student::getName, Student::getHeight));
        collect.forEach(((s, aDouble) -> System.out.println(s+" "+aDouble)));//tomap需要手动去重
        System.out.println("----------------------");
        Student[] students = list2.stream().toArray((len) -> new Student[len]);
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------------------");

        List<Student> collect1 = list.stream().filter(student -> student.getHeight() > 170).collect(Collectors.toList());
        System.out.println("----------------------");

        for (Student student : collect1) {
            System.out.println(student.toString());
        }
    }
}
