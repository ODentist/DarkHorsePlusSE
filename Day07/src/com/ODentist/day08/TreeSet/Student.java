package com.ODentist.day08.TreeSet;

public class Student implements  Comparable<Student>{
    private  String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
//        int result=this.age-o.age;
//        result=result==0?this.name.compareTo(o.name):result;
//        return result;

        int result1=this.age-o.age;
        if (result1==0){
            result1=this.name.compareTo(o.name);
        }
        return result1;
    }
}