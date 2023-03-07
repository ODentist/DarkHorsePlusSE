package StaticCodeBlock;

public class SingleTonTest {
    public static void main(String[] args) {
        singleTon singleTon1 = StaticCodeBlock.singleTon.get();
        singleTon singleTon2 = StaticCodeBlock.singleTon.get();
        singleTon singleTon3 = StaticCodeBlock.singleTon.get();
        System.out.println(singleTon1);
        System.out.println(singleTon2);
        System.out.println(singleTon3);
        LazyGuySingleTon lz=LazyGuySingleTon.getTon();
        System.out.println(lz);
    }
}
