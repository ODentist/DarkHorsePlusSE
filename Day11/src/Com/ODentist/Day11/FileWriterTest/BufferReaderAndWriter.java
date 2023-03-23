package Com.ODentist.Day11.FileWriterTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderAndWriter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\JAVA_Code\\DarkHorsePlusSE\\Day11\\src\\Com\\ODentist\\Day11\\FileTest\\FileReaderTest.txt"));
        int b;
        while ((b=reader.read())!=-1){
            System.out.print((char)b );
        }
        reader.close();
    }
}
