package StaticCodeBlock;

public class singleTon {
     private static final singleTon s= new singleTon();
     private singleTon(){

     }
     public static singleTon get(){
         return s;
     }
}
