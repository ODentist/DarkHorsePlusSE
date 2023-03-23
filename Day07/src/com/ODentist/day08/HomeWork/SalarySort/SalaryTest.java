package com.ODentist.day08.HomeWork.SalarySort;

import java.util.TreeSet;

public class SalaryTest {
    public static void main(String[] args) {
        TreeSet<Employee> emp = new TreeSet<>();
        emp.add(new Employee("人工智能开发", 8000.0));
        emp.add(new Employee("产品经理", 18000.0));
        emp.add(new Employee("软件测试", 8200.0));
        emp.add(new Employee("运维", 8300.0));
        emp.add(new Employee("UE", 8040.0));
        for (Employee employee : emp) {
            System.out.println(employee.toString());

        }

    }
}
