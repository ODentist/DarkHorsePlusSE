package com.ODentist.day09.Homework.FileWork;

import java.io.File;
import java.io.IOException;

public class CreatFile {
    public static void main(String[] args) throws IOException {
        File file = new File("Day09\\src\\com\\ODentist\\day09\\Homework\\FileWork\\TestFile\\test.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
        File file2 = new File("Day09\\src\\com\\ODentist\\day09\\Homework\\FileWork\\TestFile\\Stage1");
        boolean mkdir = file2.mkdir();
        System.out.println(mkdir);
        File file3 = new File("Day09\\src\\com\\ODentist\\day09\\Homework\\FileWork\\TestFile\\Stage2\\Stage3\\Stage4");
        boolean mkdirs = file3.mkdirs();
        System.out.println(mkdirs);

    }
}
