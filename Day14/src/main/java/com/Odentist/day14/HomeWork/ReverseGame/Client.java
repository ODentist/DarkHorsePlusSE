package com.Odentist.day14.HomeWork.ReverseGame;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Socket socket = new Socket("localhost", 8000);
            String s = scanner.nextLine();
            if ("end".equals(s)) {
                break;
            } else {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                bufferedWriter.write("end");
                bufferedWriter.newLine();
                bufferedWriter.flush();
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String s1;
                while ((s1 = reader.readLine()) != null) {
                    System.out.println(s1);
                }
                socket.close();
            }

        }
    }
}
