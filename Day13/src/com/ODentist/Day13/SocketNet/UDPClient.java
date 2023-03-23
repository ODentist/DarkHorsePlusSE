package com.ODentist.Day13.SocketNet;

import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        byte[] bytes = "this is a test message".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,
                InetAddress.getLocalHost(),12306);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();


    }
}
