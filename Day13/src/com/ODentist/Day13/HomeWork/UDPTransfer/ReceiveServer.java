package com.ODentist.Day13.HomeWork.UDPTransfer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(12306);
        byte[] bytes = new byte[1024 * 64];
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
        datagramSocket.receive(datagramPacket);
        datagramSocket.close();
        System.out.println("check program is running");
        int len=datagramPacket.getLength();
        String s = new String(bytes, 0, len);
        System.out.println("receive "+s);

    }

}
