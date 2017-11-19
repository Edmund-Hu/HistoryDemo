package netty.serial;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import netty.serial.ClientHandler;

public class Client {
public static void main(String[] args) throws InterruptedException {
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
	  
	  for(int i=0; i<5;i++){
		  Request request = new Request();
		  request.setId(""+i);
		  request.setName("pro"+i);
		  request.setRequestMessage("数据信息"+i);
		  f.channel().writeAndFlush(request);
		 
	  }

	 
	  f.channel().closeFuture().sync();
	  group.shutdownGracefully();
	  
}
}
