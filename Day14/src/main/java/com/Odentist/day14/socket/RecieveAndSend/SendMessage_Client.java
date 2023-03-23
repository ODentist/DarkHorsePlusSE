package com.Odentist.day14.socket.RecieveAndSend;

import java.io.*;
import java.net.Socket;

public class SendMessage_Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",6666);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello".getBytes());
        outputStream.flush();

        socket.shutdownOutput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s;
        while ((s=reader.readLine())!=null){
            System.out.println(s);
        }
        socket.close();


    }
}
