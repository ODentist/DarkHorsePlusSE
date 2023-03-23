package com.ODentist.day09.Homework.FileWork;

import java.io.File;

public class SearchingFile {
    public static void main(String[] args) {
        File file = new File("D:\\JAVA_Code\\DarkHorsePlusSE\\Day09\\src\\com\\ODentist\\day09\\Homework");
        Searching(file);
    }
    public static void Searching(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) System.out.println(file1.getAbsolutePath());
            else {
                System.out.println(file1.getAbsolutePath());
                Searching(file1);
            }
        }
    }
}

