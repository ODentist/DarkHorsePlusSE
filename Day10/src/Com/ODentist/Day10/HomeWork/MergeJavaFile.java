package Com.ODentist.Day10.HomeWork;

import java.io.*;

public class MergeJavaFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JAVA_Code\\DarkHorsePlusSE\\Day10\\src\\Com\\ODentist\\Day10\\HomeWork");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\JAVA_Code\\DarkHorsePlusSE\\Day10\\src\\Com\\ODentist\\Day10\\HomeWork"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\JAVA_Code\\DarkHorsePlusSE\\Day10\\src\\Com\\ODentist\\Day10\\HomeWork\\java.txt"));
        mergeJavaFile(file,bufferedInputStream,bufferedOutputStream);


    }
    public static void mergeJavaFile(File file,BufferedInputStream bis,BufferedOutputStream bos) throws IOException {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                String name = file1.getName();
                String[] fileArr = name.split("\\.");
                if (fileArr.length >= 2) {
                    String typeName = fileArr[fileArr.length - 1];
                    if (typeName.equals("java")) {
                        bis = new BufferedInputStream(new FileInputStream(file.getAbsolutePath()));
                        int b;
                        byte[] bytes = new byte[1024];
                        while ((b = bis.read(bytes)) != -1) {
                            bos.write(bytes, 0, b);
                        }
                    } else mergeJavaFile(file1, bis, bos);
                    }
            }
            bis.close();
            bos.close();
        }
    }
}
