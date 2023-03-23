package com.ODentist.SocketNet.ChatRoom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("put in your words");
            String s = scanner.nextLine();
            if ("886".equals(s))break;
            byte[] bytes = s.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");

            int port=10086;
            DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,address,port);
            datagramSocket.send(datagramPacket);
        }


        datagramSocket.close();
    }
}
