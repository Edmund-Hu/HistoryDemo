package netty.serial1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import Utils.GzipUitls;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

public class ServerHandler extends ChannelHandlerAdapter{

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		System.out.println("server:start111");
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		System.out.println("进来了！");
		Request request = (Request) msg;
		String writePath = System.getProperty("user.dir")+File.separator+"receive"+File.separator+request.getName();
		System.out.println("输出文件位置为："+writePath);
		OutputStream out = new FileOutputStream(writePath);
		out.write(GzipUitls.ungzip(request.getRequestMessage()));
		 out.flush();
		 out.close();
		System.out.println("Server : " + request.getId() + ", " + request.getName());
		
		
		Response response = new Response();
		response.setId(request.getId());
		response.setName("response" + request.getName());
		response.setResponseMessage("响应内容:已收到文件" + request.getId());
		ctx.writeAndFlush(response);//.addListener(ChannelFutureListener.CLOSE);
	}


	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		ctx.close();
	}

	
	
}
