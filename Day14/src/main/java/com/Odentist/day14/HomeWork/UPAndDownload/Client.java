package com.Odentist.day14.HomeWork.UPAndDownload;
import java.io.*;
import java.net.Socket;
public class Client {
        public static void main(String[] args) throws IOException {
            Socket socket = new Socket("127.0.0.1", 6666);
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day14-code\\clientDir\\1.jpg"));
            // 1.从本地读,写到网络到服务端
            BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
            bos.flush();
            socket.shutdownOutput();
            bis.close();

            // 4.接收服务端上传成功的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            socket.close();

        }
    }

