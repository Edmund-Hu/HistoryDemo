package netty.serial1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import Utils.GzipUitls;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import netty.serial.ClientHandler;

public class Client {
public static void main(String[] args) throws InterruptedException, IOException {
	  EventLoopGroup group = new NioEventLoopGroup();
	  Bootstrap bootstrap = new Bootstrap();
	  bootstrap.group(group)
	  .channel(NioSocketChannel.class)
	  .handler(new ChannelInitializer<SocketChannel>() {

		@Override
		protected void initChannel(SocketChannel ch) throws Exception {
		
			 ch.pipeline().addLast(MarshallingCodeCFactory.buildMarshallingDecoder() );
			 ch.pipeline().addLast(MarshallingCodeCFactory.buildMarshallingEncoder() );
			 ch.pipeline().addLast(new ClientHandler());
			
		}
	});
	  ChannelFuture f = bootstrap.connect("127.0.0.1",8760).sync();
	  
	  	String fileName = "001.jpg";
	 	String filePath = System.getProperty("user.dir")+File.separator+"sources"+File.separator+fileName;
		  Request request = new Request();
		  request.setId("1");
		  request.setName(fileName);
		   InputStream in = new FileInputStream(new File(filePath));
		  BufferedInputStream bin = new BufferedInputStream(in);
		  byte[] data = new byte[in.available()];
		   bin.read(data);
		 
		   in.close();
		   bin.close();
		   request.setRequestMessage(GzipUitls.gzip(data));
		  System.out.println("发送文件原始大小为："+data.length);
		  System.out.println("发送文件压缩大小为："+GzipUitls.gzip(data).length);
		  f.channel().writeAndFlush(request);
	 
	  f.channel().closeFuture().sync();
	  group.shutdownGracefully();
	  
}
}
