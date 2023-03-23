package com.Odentist.day14.HomeWork.ChatRoom;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //建立连接
        Socket socket = new Socket("127.0.0.1", 8888);
        while (true) {
            //键盘录入
            Scanner sc = new Scanner(System.in);
            System.out.println("我是客户端请输入你想对服务端说的话:");
            String s = sc.nextLine();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //字符缓冲流
                    try {
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        bw.write(s);
                        bw.newLine();
                        bw.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    //接收客户端的消息
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String s1;

                        while ((s1 = br.readLine()) != null) {
                            System.out.println("我是客户端,收到服务器的响应:" + s1);
                            if ("886".equals(s)) {
                                System.out.println("客户端结束了");
                                try {
                                    socket.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                System.exit(1);
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }).start();


        }
    }

}
