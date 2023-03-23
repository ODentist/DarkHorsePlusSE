package com.ODentist.day09.Homework.FileWork;

import java.io.File;

public class CalculateTheLength {
    public static void main(String[] args) {
        File file = new File("D:\\JAVA_Code\\DarkHorsePlusSE\\Day09\\src\\com\\ODentist\\day09\\Homework");
        long len = getLen(file);
        System.out.println(len);
    }
    public static long getLen(File file){
        long length=0;
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                length += file1.length();
            }else {
                length=length+getLen(file1);
            }
        }
        return length;
    }
}
