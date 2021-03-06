package com.edmund.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edmund.dao.MessageDao;
import com.edmund.dao.UserDao;
import com.edmund.web.Message;
import com.edmund.web.User;

public class HomePage extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public HomePage() {
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
 if("showall".equals(request.getParameter("method"))){
	 
	 String sql="select b.id,a.username, b.message,b.inserttime from userinfo  a, message b"+ 
			 " where a.id=b.userid and b.status = '0' order by inserttime desc ";
	 User[] users=UserDao.getUsers();   
	 Message[] msg=MessageDao.getMessages(sql);
	 request.setAttribute("users", users);
	 request.setAttribute("message", msg);
	 request.getRequestDispatcher("Home/HomePage.jsp").forward(request, response);
 }else if("showone".equals(request.getParameter("method"))){
	 String username = request.getParameter("username");
	 String sql="select b.id,a.username, b.message,b.inserttime from userinfo  a, message b"+ 
			 " where a.id=b.userid and b.status = '0' and a.username='"+username+"' order by inserttime desc ";
	 User[] users=UserDao.getUsers();   
	 Message[] msg=MessageDao.getMessages(sql);
	 request.setAttribute("users", users);
	 request.setAttribute("message", msg);
	 request.getRequestDispatcher("Home/HomePage.jsp").forward(request, response);
	 
 }else if("showdetail".equals(request.getParameter("method"))){
	 String id = request.getParameter("id");
	 String sql="select b.id,a.username, b.message,b.inserttime from userinfo  a, message b"+ 
			 " where a.id=b.userid and b.status = '0' and b.id='"+id+"' order by inserttime desc ";
	 User[] users=UserDao.getUsers();   
	 Message[] msg=MessageDao.getMessages(sql);
	 //如果文本有回车符或者换行符，就替换为网页换行符<br>
	char[] ch = msg[0].getMessage().toCharArray();
	StringBuilder str = new StringBuilder();
	for(int i=0;i<ch.length;i++){
		//System.out.print(c);
		//System.out.print((int)c);
		//System.out.print("--");
		if((int)ch[i]==13){
			str.append("<br>");
		}else {
			str.append(ch[i]);
		}
	}

	 request.setAttribute("users", users);
	 request.setAttribute("message", msg);
	 request.setAttribute("String", str);
	 request.getRequestDispatcher("Home/HomePageDetail.jsp").forward(request, response);
		
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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
