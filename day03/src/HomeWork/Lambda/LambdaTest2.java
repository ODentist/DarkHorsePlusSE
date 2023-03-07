package HomeWork.Lambda;

public class LambdaTest2 {
    interface Compare{
        public  abstract boolean compare(int a,int b);
        //public boolean eaquals(Object ob);

    }
//    public  class Lambda02{
//        public static void main(String[] args) {
//            //useCompare((int a,int b)->a==b);
//        }
//    }
    public static void useCompare(Compare c){
        boolean result = c.compare(20, 30);
        System.out.println(result);
    }
}
