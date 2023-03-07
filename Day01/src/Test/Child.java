package Test;

public class Child extends Father{
    public String school="darkHorse";
    public void test(){
        System.out.println("child");
        System.out.println("my father is"+super.name);
    }
}
