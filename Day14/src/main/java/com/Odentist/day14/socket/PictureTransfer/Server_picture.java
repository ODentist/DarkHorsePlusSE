package com.Odentist.day14.socket.PictureTransfer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_picture {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket accept = serverSocket.accept();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(accept.getInputStream());
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(""));
        int b;
        while ((b=bufferedInputStream.read())!=-1){
            bufferedOutputStream.write(b);
        }
        bufferedOutputStream.flush();
        bufferedOutputStream.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bufferedWriter.write("upload successful");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        accept.close();
    }
}
