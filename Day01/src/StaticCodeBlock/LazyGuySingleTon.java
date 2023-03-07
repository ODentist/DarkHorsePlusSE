package StaticCodeBlock;

public class LazyGuySingleTon {
   private static LazyGuySingleTon lz= new LazyGuySingleTon();
   private LazyGuySingleTon(){

   }
   static LazyGuySingleTon getTon(){
       if (lz==null){
           lz=new LazyGuySingleTon();
       }
       return lz;
   }
}
