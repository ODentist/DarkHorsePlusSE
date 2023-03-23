package com.ODentist.day08.HomeWork.SalarySort;

public class Employee implements Comparable<Employee>{
    public String disciplineName;
    public Double salary;

    public Employee(String disciplineName, Double salary) {
        this.disciplineName = disciplineName;
        this.salary = salary;
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "disciplineName='" + disciplineName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return (int) (o.getSalary()-this.getSalary());
    }
}
