package com.ODentist.day05.HomeWork;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John", "male", 18);
        Student student2 = new Student("John", "male", 18);
        System.out.println(student1.equals(student2));
    }
}
//输出结果：true
