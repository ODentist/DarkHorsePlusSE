package com.ODentist.day09.StreamAndFileClassExample.ClassFileExample;

import java.io.File;

public class FindFile {
    public static void main(String[] args) {
        String file = "A.txt";
        File dir = new File("D:\\JAVA_Code\\DarkHorsePlusSE\\Day09");
        boolean flag=false;
        findFileMethod(file,dir,flag);

    }

    public static void findFileMethod(String file,File dir,boolean flag){
        File[] files = dir.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()){
                findFileMethod(file,file1.getAbsoluteFile(),flag);
            }
            if (file1.isFile()&&file.equals(file1.getName())){
                flag=true;
                System.out.println("path is"+file1.getAbsolutePath());
                break;
            }
        }
        if (flag=true)return;
        else {
            System.out.println(dir.getName()+"not find");
            return;
        }
    }
//static void function(String filename,File dir,boolean flag)
//{
//
//    File[]files=dir.listFiles();
//    for(File file:files) {
//        if(file.isDirectory()){                     //file是目录时，则重新调用function函数;
//            function(filename,file.getAbsoluteFile(),flag);
//        }
//        if(file.isFile() && filename.equals(file.getName())){  //file时文件且文件名相同时，输出;
//            flag=true;
//            System.out.println("要查找的文件路径为："+file.getAbsolutePath());
//            break;
//        }
//    }
//    if(flag==true)                                 //判断有没有找到过文件;
//        return;
//    else
//    {
//        System.out.print(dir.getName()+"文件夹下没有找到此文件");
//        return;
//    }
//}

}
