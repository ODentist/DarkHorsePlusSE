package HomeWork;

public class Test {
    public int n=90;
    public void show() {
         class Inner {
             int n=80;
            public void method() {
                int n=70;
                System.out.println(Test.this.n);
                System.out.println(this.n);
                System.out.println(n);
                System.out.println("inner class method");
            }
        }
        Inner inner = new Inner();
        inner.method();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.show();
    }
}
