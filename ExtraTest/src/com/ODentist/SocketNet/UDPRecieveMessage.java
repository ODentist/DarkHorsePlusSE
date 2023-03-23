package com.ODentist.SocketNet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPRecieveMessage {
    public static void main(String[] args) throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
        System.out.println("==========");
        datagramSocket.receive(datagramPacket);
        System.out.println("==========");

        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        InetAddress address = datagramPacket.getAddress();
        int port1 = datagramPacket.getPort();


        System.out.println("接收数据"+new String(data,0,length));
        System.out.println("接收数据来自"+address+"端口"+port1);


        datagramSocket.close();



    }
}
