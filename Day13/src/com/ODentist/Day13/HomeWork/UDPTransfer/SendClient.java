package com.ODentist.Day13.HomeWork.UDPTransfer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SendClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        byte[] bytes = new byte[1024 * 64];
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length,
                InetAddress.getLocalHost(),12306);
        byte[] bytes1 = "this is a test message".getBytes();
        datagramPacket.setData(bytes1);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
