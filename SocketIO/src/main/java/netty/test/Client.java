package netty.test;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class Client {
public static void main(String[] args) throws InterruptedException {
	  EventLoopGroup group = new NioEventLoopGroup();
	  Bootstrap bootstrap = new Bootstrap();
	  bootstrap.group(group)
	  .channel(NioSocketChannel.class)
	  .handler(new ChannelInitializer<SocketChannel>() {

		@Override
		protected void initChannel(SocketChannel ch) throws Exception {
			 ch.pipeline().addLast(new ClientHandler());
			
		}
	});
	  ChannelFuture f = bootstrap.connect("127.0.0.1",8765).sync();
	//  ChannelFuture f2 = bootstrap.connect("127.0.0.1",8764).sync();
	  //向服务器发送数据
	  f.channel().write(Unpooled.copiedBuffer("77jkkasdjaksjlahkjs8765大家讲ad7".getBytes()));//写出内容“777”
	  f.channel().flush();
	//  f2.channel().write(Unpooled.copiedBuffer("77东方闪电8764".getBytes()));//写出内容“777”
	//  f2.channel().flush();
	 
	  f.channel().closeFuture().sync();
	//  f2.channel().closeFuture().sync();
	  group.shutdownGracefully();
	  
}
}
