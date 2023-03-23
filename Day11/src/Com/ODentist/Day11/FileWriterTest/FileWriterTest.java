package Com.ODentist.Day11.FileWriterTest;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\JAVA_Code\\DarkHorsePlusSE\\Day11\\src\\Com\\ODentist\\Day11\\FileTest\\FileReaderTest1.txt");
        fileWriter.write(97);
        char[] chars = {'你', '好', '吗'};
        fileWriter.write(chars);
        fileWriter.write(chars,1,2);
        fileWriter.write("我不好");
        fileWriter.write("我不好",1,2);
        fileWriter.close();
    }
}
