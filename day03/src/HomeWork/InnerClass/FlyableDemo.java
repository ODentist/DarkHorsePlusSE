package HomeWork.InnerClass;

public class FlyableDemo {
    public static void main(String[] args) {

        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println("匿名内部类中"+s+"在飞");
            }
        });

        useFlyable((String s)->{
            System.out.println("lambda中"+s+"在飞");
        });
    }
    public static void useFlyable(Flyable f){
        f.fly("flight");
    }
}
