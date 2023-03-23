package Com.ODentist.Day10.HomeWork;

import java.io.File;
import java.io.IOException;

public class xiongmaoshaoxiang {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JAVA_Code\\DarkHorsePlusSE\\Day10\\src\\Com\\ODentist\\Day10\\HomeWork");
        CreatFile(file);
    }
    public static void CreatFile(File file) throws IOException {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()){
                String absolutePath = file1.getAbsolutePath()+"\\xiongmaoshaoxiang.txt";
                File file2 = new File(absolutePath);
                file2.createNewFile();
                CreatFile(file1);
            }
        }
    }
}
