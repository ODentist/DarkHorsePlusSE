package com.Odentist.day14.HomeWork.ChatRoom;

import javafx.beans.binding.When;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.WeakHashMap;

public class TCPSend_Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8000);
        Thread send_client = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Scanner scanner = new Scanner(System.in);
                        String s = scanner.nextLine();
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        System.out.println("send message from client"+s);
                        bufferedWriter.write(s);
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                        if ("end".equals(s)) {
                            break;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        send_client.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String s1;
                        while ((s1 = reader.readLine()) != null) {
                            System.out.println("收到服务器信息：" + s1);
                            if("end".equals(s1)){
                                socket.close();
                                break;
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
