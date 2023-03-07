package Coder.day01;

public class Person {
    public double salary;
    public String name;
    public String id;

    public Person() {
    }

    public Person(double salary, String name, String id) {
        this.salary = salary;
        this.name = name;
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void work(){
        System.out.println("work");
    }

    @Override
    public String toString() {
        return "Person{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
