package netty.test;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.ReferenceCountUtil;

public class ServerHandler extends ChannelHandlerAdapter {

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		cause.printStackTrace();
		ctx.close();

	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		//((ByteBuf) msg).release();
		try {
			ByteBuf buf = (ByteBuf) msg;
			byte[] data = new byte[buf.readableBytes()];
			buf.readBytes(data);
			String str= new String(data,"utf-8");
			System.out.println("server:"+str);
			//写给客户端的信息
			String resp = "我是反馈的内容";
			//可以直接writeAndFlush来简化
			/**
			 * ctx.write(Object)方法不会使消息写入到通道上，他被缓冲在了内部，你需要调用ctx.flush()方法来把缓冲区中数据强行输出。
			 * 或者你可以用更简洁的cxt.writeAndFlush(msg)以达到同样的目的。
			 */
			ctx.writeAndFlush(Unpooled.copiedBuffer(resp.getBytes()))
			.addListener(ChannelFutureListener.CLOSE);//接收到client端的信息后，发送响应信息，然后断开与client的连接。
			
			
		} finally {
			// TODO: handle finally clause
			ReferenceCountUtil.release(msg);
		}
	}

}
