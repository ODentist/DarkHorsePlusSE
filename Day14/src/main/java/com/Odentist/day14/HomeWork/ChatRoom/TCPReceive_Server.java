package com.Odentist.day14.HomeWork.ChatRoom;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPReceive_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        Socket socket = serverSocket.accept();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {

                        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String s;
                        while ((s = reader.readLine()) != null) {
                            System.out.println("接收自客户端： " + s);
                        }
                        if ("end".equals(s)) {
                            break;
                        }
                        reader.close();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();


 new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    String s1 = scanner.nextLine();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                    bufferedWriter.write(s1);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    if ("end".equals(s1)) {
                        break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }).start();
    }
}
