package Com.ODentist.day15.Reflect.ReflectionMemberMethod;

public class Student {
    public int a;
    private int age;
    private String name;

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

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public void SetA(int a){
        this.a=a;
    }
    public void run(){
        System.out.println("run fast");
    }

    public void eat(){
        System.out.println("eat more");
    }

    private void eat(String name){
        System.out.println("the best like to eat "+name);
    }
}
