package StaticCodeBlock;

public class A {
    static {
        System.out.println("static code block");
    }
    {
        System.out.println("non static code block");
    }
    public A(){
        System.out.println("construction method");
    }
}
