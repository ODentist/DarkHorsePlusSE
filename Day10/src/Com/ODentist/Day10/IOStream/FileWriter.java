package Com.ODentist.Day10.IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("D:\\JAVA_Code\\DarkHorsePlusSE\\Day10\\src\\Com\\ODentist\\Day10\\IOStream\\FileTest\\testIO.txt",true);
            fileOutputStream.write("/r/n".getBytes());
            String s="12306adaw";
            byte[] bytes = s.getBytes();
            fileOutputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fileOutputStream!=null)
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
