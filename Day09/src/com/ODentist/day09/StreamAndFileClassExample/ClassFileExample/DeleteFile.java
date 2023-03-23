package com.ODentist.day09.StreamAndFileClassExample.ClassFileExample;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("D:\\JAVA_Code\\DarkHorsePlusSE\\Day09\\src\\com\\ODentist\\day09\\Stream\\Resource\\deleteTest");
        deleteFunction(file);
    }
public  static  void deleteFunction(File file){

    // 进入文件夹
    //2.遍历数组
    //3判断文件
    //4判断文件夹

    //1
    File[] files = file.listFiles();
    for (File file1 : files) {
        if (file1.isFile())file1.delete();
        else deleteFunction(file1);
    }
    file.delete();
}


}
