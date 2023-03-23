package com.ODentist.StreamTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) throws IOException {
        /**
         * 换行和续写
         * windows: /r/n  回车换行
         * Linux:/n
         * Mac:/r
         */
        FileOutputStream fileOutputStream = new FileOutputStream("ExtraTest/src/com/ODentist/StreamTest/A.txt",true);
        String str="Test for the text";
        byte[] bytes = str.getBytes();
        fileOutputStream.write(bytes);

        String s2="\r\n";
        byte[] bytes1 = s2.getBytes();
        fileOutputStream.write(bytes1);

        String s3="666";
        byte[] bytes2 = s3.getBytes();
        fileOutputStream.write(bytes2);
        fileOutputStream.close();
    }
}
