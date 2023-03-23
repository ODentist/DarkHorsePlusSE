package com.Odentist.day14.HomeWork.ReverseGame;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        while (true) {
            Socket socket = serverSocket.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            String s;
            while ((s = reader.readLine()) != null) {
                if ("end".equals(s)) {
                    break;
                }
                stringBuilder.append(s);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write(stringBuilder.reverse().toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
            socket.close();

        }
    }
}
