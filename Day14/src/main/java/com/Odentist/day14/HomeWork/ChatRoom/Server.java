package com.Odentist.day14.HomeWork.ChatRoom;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        //接受数据
        ServerSocket ss = new ServerSocket(8888);
        while (true) {
            Socket socket = ss.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    String a = "";
                    try {

                        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String s;
                        while ((s = br.readLine()) != null) {
                            System.out.println("我是服务器,收到客户端的消息是:" + s);
                            a = s;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if ("886".equals(a)) {
                        System.out.println("客户端结束了");
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.exit(1);
                    }
                }
            }).start();


            new Thread(new Runnable() {
                @Override
                public void run() {
                    //传输消息
                    System.out.println("我是服务器,请输入你想对客户端说的话");
                    Scanner sc = new Scanner(System.in);
                    String s1 = sc.nextLine();

                    try {
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        bw.write(s1);
                        bw.newLine();
                        bw.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }).start();
        }
    }
}
