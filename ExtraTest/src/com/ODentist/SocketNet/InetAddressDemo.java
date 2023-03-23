package com.ODentist.SocketNet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("192.168.15.137");
        System.out.println(byName);

        String hostAddress = byName.getHostAddress();
        System.out.println(hostAddress);

        String hostName = byName.getHostName();
        System.out.println(hostName);
    }
}
