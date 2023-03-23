package com.ODentist.SocketNet.ChatRoom;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(10086);
        byte[] bytes1 = new byte[1024];
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes1,bytes1.length);

        datagramSocket.receive(datagramPacket1);


        Scanner scanner = new Scanner(System.in);
        while (true) {
            datagramSocket.receive(datagramPacket1);
            byte[] data = datagramPacket1.getData();
            int length = datagramPacket1.getLength();
            String hostAddress = datagramPacket1.getAddress().getHostAddress();
            String hostName = datagramPacket1.getAddress().getHostName();


            System.out.println("ip"+hostAddress+" hostname"+hostName+"is send message is   "+new String(data,0,length));

        }



    }
}
