package com.IP;

import java.net.InetAddress;

public class TestInetAddress {
  public static void main(String[] args) {
    try {
      InetAddress addr = InetAddress.getByName("www.baidu.com");
      System.out.println(addr.getHostAddress()); // 180.97.34.96
      System.out.println(addr.getHostName()); // www.baidu.com

      InetAddress addr1 = InetAddress.getByName("localhost");
      System.out.println(addr1.getHostAddress()); // 127.0.0.1
      System.out.println(addr1.getHostName()); // localhost
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}