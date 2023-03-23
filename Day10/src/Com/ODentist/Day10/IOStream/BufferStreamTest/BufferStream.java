package Com.ODentist.Day10.IOStream.BufferStreamTest;

import java.io.*;

public class BufferStream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\JAVA_Code\\DarkHorsePlusSE\\Day10\\src\\Com\\ODentist\\Day10\\IOStream\\FileTest\\testIO.txt"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\JAVA_Code\\DarkHorsePlusSE\\Day10\\src\\Com\\ODentist\\Day10\\IOStream\\FileTest\\testOut.txt"));
        int b;
        byte[] bytes = new byte[1024];
        while ((b=bufferedInputStream.read(bytes))!=-1){
            bufferedOutputStream.write(bytes,0, b);

        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
    }
}
