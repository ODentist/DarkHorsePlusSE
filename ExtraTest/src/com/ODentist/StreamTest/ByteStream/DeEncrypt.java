package com.ODentist.StreamTest.ByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DeEncrypt {
    public static void main(String[] args) throws IOException {
        File file = new File("");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        int b;
        while ((b=fileInputStream.read())!=-1){
            fileOutputStream.write(b^2);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
