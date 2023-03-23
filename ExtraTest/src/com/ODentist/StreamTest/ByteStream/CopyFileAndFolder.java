package com.ODentist.StreamTest.ByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileAndFolder {
    public static void main(String[] args) {
        File file = new File("D:\\JAVA_Code\\DarkHorsePlusSE\\ExtraTest\\src\\com\\ODentist\\StreamTest\\Floder");
        File des = new File("D:\\JAVA_Code\\DarkHorsePlusSE\\ExtraTest\\src\\com\\ODentist\\StreamTest\\DesFloder");

    }
    public static void copyFile(File src,File des) throws IOException {
        des.mkdir();
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){
                FileInputStream fileInputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(new File(des,file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len= fileInputStream.read(bytes))!=-1){
                    fileOutputStream.write(bytes,0,len);
                }
                fileInputStream.close();
                fileOutputStream.close();
            }else {
                    copyFile(file,new File(des,file.getName()));
            }
        }
    }
}
