package com.scenery.lesson02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

// 客户端
public class TCPclient01 {
    public static void main(String[] args) {
        while(true){
            try {
                InetAddress serverIP = InetAddress.getByName("127.0.0.1");
                int port = 8080;
                Socket socket = new Socket(serverIP, port);
                // 发送消息
                OutputStream os = socket.getOutputStream();
                os.write("你好，你是谁".getBytes(StandardCharsets.UTF_8));
                os.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
