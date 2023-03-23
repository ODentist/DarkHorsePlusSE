package Com.ODentist.Day11.HomeWork;

import java.io.*;

public class TransferGBK {
    /**
     * 目标：解决代码编码是UTF-8与文件编码是GBK的中文乱码问题
     */

    public static void main(String[] args) {
        try (
                // 1、提取GBK文件的原始字节流
                InputStream is = new FileInputStream("D:\\JAVA_Code\\DarkHorsePlusSE\\Day11\\src\\Com\\ODentist\\Day11\\HomeWork\\FileForHomeWork\\GBKTest.txt");

                // 2、把原始字节流转换成字符输入流
                // Reader isr = new InputStreamReader(is); //  默认以UTF-8编码转换成字符流。还是会出现中文乱码问题，跟直接使用FileReader是一样的
                Reader isr = new InputStreamReader(is, "GBK");  // 以指定的GBK编码转换成字符输入流，可以解决乱码问题

                // 3、把字符输入流包装成一个字符缓冲输入流管道
                BufferedReader br = new BufferedReader(isr);

        ) {

            // 3、按照行读取数据
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
