package com.scenery.lesson02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 服务器
public class TCPServer01 {
    public static void main(String[] args)  {
        while(true) {
            try {
                ServerSocket serverSocket = new ServerSocket(8080);
                Socket socket = serverSocket.accept();
                InputStream is = socket.getInputStream();
//            byte[] buffer = new byte[1024];
//            int len;
//            while((len=is.read(buffer)) != -1){
//                String msg = new String(buffer, 0, len);
//                System.out.println(msg);
//            }
                // 管道
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] buffer = new byte[24];
                int len;
                while((len = is.read(buffer)) != -1){
                    baos.write(buffer, 0, len);
                }
                System.out.println(baos.toString());
                is.close();
                baos.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {

            }
        }
    }
}
