package com.edmund.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.channels.SeekableByteChannel;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.edmund.dao.UserDao;
import com.edmund.tool.mj;
import com.edmund.web.User;

public class LoginJudge extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LoginJudge() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if("exit".equals(request.getParameter("method"))){
			session.invalidate();
			 //session.setAttribute("username", null);
			 //session.setAttribute("password", null);
			 response.sendRedirect("Home/HomePage.jsp");
		}else if("jump".equals(request.getParameter("method"))){
			if(session.getAttribute("username")==null){
				response.sendRedirect("jsp/Login.jsp");
			}else{
				response.sendRedirect("jsp/DaoHangHome.jsp");
			}
				
		}else if("drawpic".equals(request.getParameter("method"))){
			this.randCode(request, response);
		}
		
	}
	

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		 response.setCharacterEncoding("UTF-8");
		 String safecode = request.getParameter("safecode");
		// System.out.println(safecode);
		// System.out.println(session.getAttribute("safecode"));
		 String username = request.getParameter("username");
		 String password = request.getParameter("password");
		  User user = UserDao.getUser(username);
		  if(!session.getAttribute("safecode").equals(safecode)){
			  response.sendRedirect("jsp/Login.jsp?username=??"); 
		  }else if(user.getUsername()==null){
		  response.sendRedirect("jsp/Login.jsp?username=?");
		  }  else if(user.getUsername().equals(username) && user.getPassword().equals(mj.PWcache(password))){
		
		 session.setAttribute("username", username);
		 session.setAttribute("password", password);
		  response.sendRedirect("jsp/DaoHangHome.jsp");
		 }else{
		 response.sendRedirect("jsp/Login.jsp?username=*");
		 };
		
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}
	
	
	private Font getFont() {
		Random random = new Random();
		Font font[] = new Font[5];
		font[0] = new Font("Ravie", Font.PLAIN, 24);
		font[1] = new Font("Antique Olive Compact", Font.PLAIN, 24);
		font[2] = new Font("Forte", Font.PLAIN, 24);
		font[3] = new Font("Wide Latin", Font.PLAIN, 24);
		font[4] = new Font("Gill Sans Ultra Bold", Font.PLAIN, 24);
		
	          return font[random.nextInt(5)];
	  }

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here

	}
	
	
	private void randCode(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// 设置响应头 Content-type类型
				response.setContentType("image/jpeg");
				// 以下三句是用于设置页面不缓存
				response.setHeader("Pragma", "No-cache");
				response.setHeader("Cache-Control", "No-cache");
				response.setDateHeader("Expires", 0);

				OutputStream out = response.getOutputStream();
				int width = 83, height = 30;
				// 建立指定宽、高和BufferedImage对象
				BufferedImage image = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);

				Graphics g = image.getGraphics(); // 该画笔画在image上
				Color c = g.getColor(); // 保存当前画笔的颜色，用完画笔后要回复现场
				g.fillRect(0, 0, width, height);//从左上角到右下角填充
				

				char[] ch = "AaBbcDdeFfGgHhjkmnpQqrsTtuvwxYyz23456789".toCharArray(); // 随即产生的字符串 不包括 i l(小写L) o（小写O） 1（数字1）0(数字0)
				int length = ch.length; // 随即字符串的长度
				String sRand = ""; // 保存随即产生的字符串
				Random random = new Random();
				for (int i = 0; i < 4; i++) {
					// 设置字体
					g.setFont(getFont());
					// 随即生成0-9的数字
					String rand = new Character(ch[random.nextInt(length)]).toString();
					sRand += rand;
					// 设置随机颜色
					g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
					g.drawString(rand, 20 * i, 25);
				}
				//产生随即干扰点
				for (int i = 0; i < 20; i++) {
					int x1 = random.nextInt(width);
					int y1 = random.nextInt(height);
					g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
					g.drawOval(x1, y1, 2, 2);
				}
				//画干扰线
				for (int i = 0; i < 10; i++) {
					int x1 = random.nextInt(width);
					int y1 = random.nextInt(height);
					g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
					g.drawLine(x1, y1, x1+10, y1);
				}
				g.setColor(c); // 将画笔的颜色再设置回去
				g.dispose();

				//将验证码记录到session
				request.getSession().setAttribute("safecode", sRand);
				// 输出图像到页面
				ImageIO.write(image, "JPEG", out);
		
	}

}
