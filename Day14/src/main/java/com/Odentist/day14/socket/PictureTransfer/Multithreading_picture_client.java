package com.Odentist.day14.socket.PictureTransfer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Multithreading_picture_client {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        while (true) {
            Socket socket = ss.accept();
            Runnable r = new Multithreading_picture(socket);
            new Thread(r).start();
        }
    }

}
