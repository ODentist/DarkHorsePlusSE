package Coder.day01;

public class Demo {
    public static void main(String[] args) {
        Manager manager = new Manager(1000,"zhangsan","0001",100);
        Coder coder = new Coder(20000,"lisi","0002");
        manager.work();
        coder.work();
        System.out.println(manager.toString()+manager.getPrise());
        System.out.println(coder.toString());
    }
}
