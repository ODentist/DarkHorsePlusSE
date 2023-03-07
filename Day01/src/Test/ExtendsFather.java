package Test;

public class ExtendsFather {
    public static void main(String[] args) {
        Child child = new Child();
        child.test();
        child.method();
        child.show();
        System.out.println(child.name);
        System.out.println(child.school);
    }
}
