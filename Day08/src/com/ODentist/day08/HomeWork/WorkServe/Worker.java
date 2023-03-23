package com.ODentist.day08.HomeWork.WorkServe;

public class Worker implements Comparable<Worker> {
    String name;
    int age;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Worker() {

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
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        return this.getAge()-o.age;
    }
}
