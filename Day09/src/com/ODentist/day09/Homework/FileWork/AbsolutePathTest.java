package com.ODentist.day09.Homework.FileWork;

import java.io.File;

public class AbsolutePathTest {
    public static void main(String[] args) {
        File file = new File("D:\\JAVA_Code\\DarkHorsePlusSE\\Day09\\src\\com\\ODentist\\day09\\Homework");
        String TargetFile = "test1.txt";
        String TargetFolder = "TestFile";
        checkPath(file, TargetFile, TargetFolder);
        long len = getLen(file,TargetFile);
        System.out.println(len);
    }
public static long getLen(File file,String TargetFile){
        long len=0;
    File[] files = file.listFiles();
    for (File file1 : files) {
        if (file1.isFile()){
            if (TargetFile.equals(file1.getName())){
                System.out.println(file1.length());
            }
            len=len+file1.length();

        }

        else  len=len+getLen(file1,TargetFile);
    }
        return len;

}
    public static void checkPath(File file, String TargetFile, String TargetFolder) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                if (TargetFile.equals(file1.getName())) {
                    System.out.println(file1.getAbsolutePath());
                    System.out.println(TargetFile);
                }
            }
            if (file1.isDirectory()) {
                //file1.getPath().split("")
                if (file1.getAbsolutePath().contains(TargetFolder)) {
                    System.out.println(file1.getAbsolutePath());
                    System.out.println(TargetFolder);
                }
                checkPath(file1, TargetFile, TargetFolder);
            }
        }
    }
}
