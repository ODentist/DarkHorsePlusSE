package com.Odentist.day14.socket.PictureTransfer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class ServerFactory {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,
                5,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        while (true){
            Socket accept = serverSocket.accept();
            System.out.println("receive a message");
            Multithreading_picture t = new Multithreading_picture(accept);
            threadPoolExecutor.execute(t);
        }
    }
}
