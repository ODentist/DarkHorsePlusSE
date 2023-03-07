package com.ODentist.day05.Throw;

public class Student {
    int age;
    String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void saveAge(int age){
        if (age>=18&&age<=25){
            this.age=age;
        }else {
            throw new AgeOutOfBoundsException("请输入正确的年龄");
        }
    }
}

