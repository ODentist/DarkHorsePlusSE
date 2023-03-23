package com.Odentist.day14.HomeWork;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        // - 客户端发送数据"hello"
        //- 服务端接收
        //
        //- 服务端回消息"你好吗"
        //- 客户端接收
        while (true) {
            Socket socket = new Socket("127.0.0.1", 8000);

            OutputStream outputStream = socket.getOutputStream();
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            outputStream.write(s.getBytes());
            // 只关闭输出流不关闭socket
            socket.shutdownOutput();
           // outputStream.close();


//            // 接收你好吗
//            // 字节流
//            InputStream inputStream = socket.getInputStream();
//            // 转换流
//            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//            // 字符缓冲流
//            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//            String str;
//            while ((str = bufferedReader.readLine()) != null) {
//                System.out.println(str);
//            }
//
//            bufferedReader.close();
            socket.close();
        }
    }
}