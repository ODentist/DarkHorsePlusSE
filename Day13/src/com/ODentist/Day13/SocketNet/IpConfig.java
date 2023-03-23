package com.ODentist.Day13.SocketNet;

import java.io.IOException;
import java.net.InetAddress;

public class IpConfig {
    public static void main(String[] args) throws IOException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.getHostName());
        System.out.println(localHost.getAddress());
        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName.getHostName());
        System.out.println(byName.getHostAddress());
        boolean reachable = byName.isReachable(3000);
        System.out.println(reachable);


    }
}
