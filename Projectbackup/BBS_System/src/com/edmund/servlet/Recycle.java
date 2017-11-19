package com.edmund.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edmund.dao.MessageDao;
import com.edmund.tool.mj;
import com.edmund.web.Message;

public class Recycle extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Recycle() {
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
		if("quary".equals(request.getParameter("method")))
		{
			String sql="select b.id,a.username, b.message,b.inserttime from userinfo  a, message b"+ 
				" where a.id=b.userid and b.status = '1' order by inserttime desc limit 0,9";
			Message[] msg =MessageDao.getMessages(sql);
			request.setAttribute("message", msg);
			request.getRequestDispatcher("jsp/Recycle.jsp").forward(request, response);
		}else if("recover".equals(request.getParameter("method"))){
			int msgid =Integer.parseInt(request.getParameter("id"));
			mj.modifyMsg("status", "id", msgid, 0);
			response.sendRedirect("http://localhost:8080/BBS_System/Recycle.edmund?method=quary");
	
		}else if("delete".equals(request.getParameter("method"))){
			int msgid =Integer.parseInt(request.getParameter("id"));
			mj.DropMsg(msgid);
			response.sendRedirect("http://localhost:8080/BBS_System/Recycle.edmund?method=quary");
		}
		
		
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
	
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
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
