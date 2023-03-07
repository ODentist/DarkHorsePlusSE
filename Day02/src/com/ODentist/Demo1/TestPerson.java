package com.ODentist.Demo1;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Student();
        p.method();
        if (p instanceof Teacher) {
            Teacher t = (Teacher) p;
            t.method2();
        } else if (p instanceof Student) {
            Student s = (Student) p;
            s.work();
        }

    }
}
