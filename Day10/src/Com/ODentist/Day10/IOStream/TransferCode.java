package Com.ODentist.Day10.IOStream;

import sun.nio.cs.ext.GBK;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TransferCode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1="你好";
        byte[] bytes = s1.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte[] gbks = s1.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));
        System.out.println("--------------");

        String utf8str = new String(bytes);
        System.out.println(utf8str);
        String gbk = new String(bytes, "GBK");
        System.out.println(gbk);

    }
}
