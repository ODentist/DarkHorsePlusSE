package Com.ODentist.Day10.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\JAVA_Code\\DarkHorsePlusSE\\Day10\\src\\Com\\ODentist\\Day10\\IOStream\\FileTest\\testIO.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\JAVA_Code\\DarkHorsePlusSE\\Day10\\src\\Com\\ODentist\\Day10\\IOStream\\FileTest\\testOut.txt");
        //int read = fileInputStream.read();
        int b=0;
        byte[] bytes = new byte[512];
        while ((b=fileInputStream.read(bytes))!=-1){
            System.out.print((char) b);
            fileOutputStream.write(bytes,0,b);

        }
        fileOutputStream.close();
        fileInputStream.close();
        
    }
}
