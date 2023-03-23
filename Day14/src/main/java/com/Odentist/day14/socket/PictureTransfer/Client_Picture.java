package com.Odentist.day14.socket.PictureTransfer;

import java.io.*;
import java.net.Socket;

public class Client_Picture {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 6666);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(""));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        int b;
        while ((b=bufferedInputStream.read())!=-1){
            bufferedOutputStream.write(b);
        }
        bufferedOutputStream.flush();
        bufferedInputStream.close();
        socket.shutdownOutput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s;
        while ((s=reader.readLine())!=null){
            System.out.println(s);
        }

        socket.close();

    }

}
