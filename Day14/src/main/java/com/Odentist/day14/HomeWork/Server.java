package com.Odentist.day14.HomeWork;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class Server {
    public static void main(String[] args) throws IOException {
        // - 客户端发送数据"hello"
        //- 服务端接收
        //
        //- 服务端回消息"你好吗"
        //- 客户端接收
        ServerSocket serverSocket = new ServerSocket(8000);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        int b;
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Character> chars = new ArrayList<>();
        while ((b = inputStream.read()) != -1){
            //System.out.print((char) b);
            stringBuilder.append((char) b);
        }
        String s = stringBuilder.reverse().toString();
        System.out.println(s);

//
//        // 回消息
//        // 字节流
//        OutputStream outputStream = socket.getOutputStream();
//        // 转换流（是字符流的子类）
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
//        // 字符缓冲流
//        // Writer 字符输出流的父类
//        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
//        bufferedWriter.write("你好吗");
//
//        bufferedWriter.flush();
//
//
//        inputStream.close();
//        bufferedWriter.close();
//        socket.close();
       serverSocket.close();
    }
}