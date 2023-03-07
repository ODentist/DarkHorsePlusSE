package HomeWork.InnerClass;

public class TestInnerClass {
    public static void main(String[] args){
        fun(new InnerclassTest2.Animal() {//请用匿名内部类的形式调用
            @Override
            public void show() {
                System.out.println("------");
            }
        });
        fun(new InnerclassTest2().new Cat() );//请用子类的形式调用
    }
    public static void fun(InnerclassTest2.Animal a ){
        a.show();
    }
}
