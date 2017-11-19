package netty.test;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class Server {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * 
		 * NioEventLoopGroup 是用来处理I/O操作的多线程事件循环器，Netty提供了许多不同的EventLoopGroup的实现用来处理不同传输协议。
		 * 在这个例子中我们实现了一个服务端的应用，因此会有2个NioEventLoopGroup会被使用。
		 * 第一个经常被叫做‘boss’，用来接收进来的连接。第二个经常被叫做‘worker’，
		 * 用来处理已经被接收的连接，一旦‘boss’接收到连接，就会把连接信息注册到‘worker’上。
		 * 如何知道多少个线程已经被使用，如何映射到已经创建的Channels上都需要依赖于EventLoopGroup的实现，
		 * 并且可以通过构造函数来配置他们的关系
		 */
		  EventLoopGroup bossGroup = new NioEventLoopGroup(); // 用于接收client端链接
		  EventLoopGroup workerGroup = new NioEventLoopGroup();//实际业务处理
		//ServerBootstrap是一个启动NIO服务的辅助启动类。
		  //你可以在这个服务中直接使用Channel，但是这会是一个复杂的处理过程，在很多情况下你并不需要这样做
		  ServerBootstrap b = new ServerBootstrap();
		  //两个工作线程组加入到bootstrap中
		  b.group(bossGroup,workerGroup)
		  //要指定NioServerSocketChannel这种类型的通道
		  .channel(NioServerSocketChannel.class)
		  //使用吃了handler去绑定具体的事件处理器
		  .childHandler(new ChannelInitializer<SocketChannel>(){

			@Override
			protected void initChannel(SocketChannel ch) throws Exception {
				// TODO Auto-generated method stub
				 ch.pipeline().addLast(new ServerHandler());

			}
			  
		  })
		  /**
		   * 服务器端TCP内核模块维护两个队列，我们称之为A,B
		   * 客服端向服务器端connect的时候，会发送带有SYN标志的包（第一次握手）
		   * 服务端收到客户端发来的SYN时，想客户端发送SYN ACK确认（第二次握手）
		   * 此时TCP内核将客户端的连接加入到队列A中，然后服务端收到客户端发来的ACK时（三次握手）
		   * TCP内核将客户端连接从队列A中移动到B中，连接完成，应用程序的accept就会返回。
		   * 也就是accept从B队列中取出完成三次握手的链接
		   * 队列A和队列B的长度之后就叫做BACKLOG，当A和B队列的长度之后大于backlog时，新的连接将会被TCP内核拒绝
		   * 所以，BACKLOG过小可能会到导致accept速度跟不上，A,B队列满了，导致新的客户无法连接
		   * 要注意的是：backlog对程序支持的连接数没有影响，backlog影响的只是还没有被accept取出的连接。
		   * 
		   */
		  .option(ChannelOption.SO_BACKLOG, 128)  //设置tcp缓冲区
		  .option(ChannelOption.SO_SNDBUF, 32*1024) //设置发送缓存大小
		  .option(ChannelOption.SO_RCVBUF, 32*1024) //设置接收缓存大小
		 // .childOption(ChannelOption.SO_KEEPALIVE, true);
		  .childOption(ChannelOption.SO_KEEPALIVE, true);//保持连接
		  
		  //绑定指定端口进行监听
		  ChannelFuture f = b.bind(8765).sync(); 
		//  ChannelFuture f2 = b.bind(8764).sync(); 
		  f.channel().closeFuture().sync();
		//  f2.channel().closeFuture().sync();
		  workerGroup.shutdownGracefully();
		  bossGroup.shutdownGracefully();


	}
	
	
	
	  
}
