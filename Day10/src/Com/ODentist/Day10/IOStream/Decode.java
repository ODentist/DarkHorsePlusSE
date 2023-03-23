package Com.ODentist.Day10.IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Decode {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("D:\\JAVA_Code\\DarkHorsePlusSE\\Day10\\src\\Com\\ODentist\\Day10\\IOStream\\FileTest\\testIO.txt");

        byte[] bytes = new byte[1024];
        int len;
        while ((len=fileInputStream.read(bytes))!=-1)
        {
            String s = new String(bytes, 0, len);
            System.out.println(s);
        }
        fileInputStream.close();
    }
}
