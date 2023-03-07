package Test;

public class TsetStatic {
    public static void main(String[] args) {
        System.out.println(Student1.age);
        Student1.age=100;
        System.out.println(Student1.age);
        System.out.println("---------" );
        Student1 student1 = new Student1();
        System.out.println(student1.name);

        student1.age=200;

        Student1 s2 = new Student1();
        System.out.println(s2.age);

    }
}
