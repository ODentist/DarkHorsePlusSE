package Com.ODentist.Day11.FileReader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\JAVA_Code\\DarkHorsePlusSE\\Day11\\src\\Com\\ODentist\\Day11\\FileTest\\FileReaderTest.txt");
        char[] chars = new char[1024];
        int len;
        while ((len=fileReader.read(chars))!=-1){
            String s = new String(chars, 0, len);
            System.out.println(s);
        }
        fileReader.close();
    }
}
