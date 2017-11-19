package com.edmund.socket;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
	 
 public static void main(String args[]) throws IOException, InterruptedException {  
    //为了简单起见，所有的异常信息都往外抛  
   int port = 8899;  
    //定义一个ServerSocket监听在端口8899上  
   ServerSocket server = new ServerSocket(port);
   //用了一个死循环,实现了一个简单的一个服务端与多个客户端进行通信的模式
    while (true) {  
       //server尝试接收其他Socket的连接请求，server的accept方法是阻塞式的  
     Socket socket = server.accept();  
       //跟客户端建立好连接之后，我们就可以获取socket的InputStream，并从中读取客户端发过来的信息了。  
     Reader reader = new InputStreamReader(socket.getInputStream(),"UTF-8");  
       char chars[] = new char[64];  
       int len;  
       StringBuilder sb = new StringBuilder();  
       String temp;  
       int index;  
       while ((len=reader.read(chars)) != -1) {  
          temp = new String(chars, 0, len);  
          if ((index = temp.indexOf("eof")) != -1) {//遇到eof时就结束接收  
              sb.append(temp.substring(0, index));  
              break;  
          }  
          sb.append(temp);  
       }  
       System.out.println("from client: " + sb);  
       Thread.sleep(1000);
       //读完后写一句  
     Writer writer = new OutputStreamWriter(socket.getOutputStream(),"UTF-8");  
       writer.write("Hello Client."+sb);  
       writer.flush();  
       writer.close();  
       reader.close();  
       socket.close();  
    }  
 }  
}
