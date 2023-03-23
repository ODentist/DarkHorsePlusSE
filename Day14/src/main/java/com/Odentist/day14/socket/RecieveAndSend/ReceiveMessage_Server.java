package com.Odentist.day14.socket.RecieveAndSend;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveMessage_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        int b;
        while ((b=inputStream.read())!=-1){
            System.out.print((char) b);
        }
        System.out.println("check run");

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bufferedWriter.write("你好吗");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        accept.close();


    }
}
