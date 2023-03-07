package Coder.day01;

public class Coder extends Person{
    public Coder() {
    }

    public Coder(double salary, String name, String id) {
        super(salary, name, id);
    }


    @Override
    public void work() {
        System.out.println("摸鱼");
    }
}
