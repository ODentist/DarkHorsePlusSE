package com.Odentist.day14.HomeWork.UPAndDownload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        while (true) {
            Socket socket = ss.accept();
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day14-code\\serverDir\\"+ UUID.randomUUID().toString() +".jpg"));
            // 2.从网络客户端中读,写到本地
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());

            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
            bos.flush();
            bos.close();

            // 3.回写消息: 上传成功
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("上传成功!");
            bw.newLine();
            bw.flush();

            socket.close();
        }
    }
}
