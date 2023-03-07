package HomeWork.Lambda;

public class LambdaTest {
    public static void main(String[] args) {
        show((int a,int b)->a+b);
    }
    public static void show(Cala c){
            int s=c.sum(10,20);
        System.out.println(s);
    }
}
