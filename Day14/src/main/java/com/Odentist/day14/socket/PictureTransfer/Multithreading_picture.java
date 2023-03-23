package com.Odentist.day14.socket.PictureTransfer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Multithreading_picture implements Runnable{

        private Socket socket;

        public Multithreading_picture(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {

            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day14-code\\serverDir\\" + UUID.randomUUID().toString() + ".jpg"));
                 BufferedInputStream bis = new BufferedInputStream(socket.getInputStream())) {
                int b;
                while ((b = bis.read()) != -1) {
                    bos.write(b);
                }
                bos.flush();

                // 3.回写消息: 上传成功
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                bw.write("上传成功!");
                bw.newLine();
                bw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
