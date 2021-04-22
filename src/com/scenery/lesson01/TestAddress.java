package com.scenery.lesson01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestAddress {
    public static void main(String[] args) {
        try{
            // 查询本机地址
            InetAddress inetAddress1 = InetAddress.getByName("127.0.0.1");
            InetAddress inetAddress2 = InetAddress.getByName("localhost");
            InetAddress inetAddress3 = InetAddress.getLocalHost();
            System.out.println(inetAddress1);

            // 查询网站地址
            InetAddress inetAddress4 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress4);
            inetAddress1.getHostName(); // 获取域名
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
    }
}
