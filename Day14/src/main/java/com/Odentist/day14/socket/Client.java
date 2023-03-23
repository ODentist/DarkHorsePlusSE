package com.Odentist.day14.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.255.255.255", 6666);
        OutputStream outputStream = socket.getOutputStream();
        while (true) {
            outputStream.write("hello".getBytes());
            outputStream.flush();
        }
        //socket.close();
    }
}
