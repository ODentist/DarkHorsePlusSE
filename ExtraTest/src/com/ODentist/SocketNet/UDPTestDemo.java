package com.ODentist.SocketNet;

import java.io.IOException;
import java.net.*;

public class UDPTestDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String s="this is a test message";
        byte[] bytes = s.getBytes();

        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port=10086;

        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,address,port);
            datagramSocket.send(datagramPacket);
            datagramSocket.close();

    }
}
