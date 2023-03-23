package Com.ODentist.Day11.HomeWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

public class WindowOutCheckTime {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JAVA_Code\\DarkHorsePlusSE\\Day11\\src\\Com\\ODentist\\Day11\\HomeWork\\FileForHomeWork\\窗里窗外.txt");
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "GBK");
        int b;
        long l1 = System.currentTimeMillis();
        while ((b = isr.read()) != -1)
            System.out.print((char) b);
        isr.close();
        long l2 = System.currentTimeMillis();
        System.out.println("using :"+(l2-l1)+"millis");
    }
}
