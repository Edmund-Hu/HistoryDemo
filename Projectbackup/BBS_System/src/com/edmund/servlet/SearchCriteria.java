package com.edmund.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edmund.dao.MessageDao;
import com.edmund.web.Message;

public class SearchCriteria extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public SearchCriteria() {
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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
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
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
	String searchBy = request.getParameter("searchBy");
	String keywords =request.getParameter("keywords");
	System.out.println(keywords);
	String order = request.getParameter("order").toLowerCase();
		if("id".equals(searchBy.toLowerCase())){
			String sql ="select b.id,a.username, b.message,b.inserttime from userinfo  a, message b"+ 
					" where b.id = "+keywords+" and a.id=b.userid and b.status = '0' order by "+order;
			System.out.println(sql);
			this.getMsg(sql, request, response);
		
		}else if("文章关键字".equals(searchBy)){
			String sql ="select b.id,a.username, b.message,b.inserttime from userinfo  a, message b"+ 
					" where b.message like" +"'%"+keywords+"%'"+ "and a.id=b.userid and b.status = '0' order by "+order;
			System.out.println(sql);
			this.getMsg(sql, request, response);
		}else if("发布人".equals(searchBy)){
			String sql ="select b.id,a.username, b.message,b.inserttime from userinfo  a, message b"+ 
					" where a.username like"+"'%"+keywords+"%'"+" and a.id=b.userid and b.status = '0' order by "+order;
			System.out.println(sql);
			this.getMsg(sql, request, response);
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
	public void getMsg(String sql,HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		Message[] msg =MessageDao.getMessages(sql);
		int s=0;
		if(request.getParameter("s")!=null){
			s =Integer.parseInt(request.getParameter("s"));
			if(s<msg.length){
				request.setAttribute("start", s);
			}else{
				request.setAttribute("start", msg.length);	
			}
		}else{
			request.setAttribute("start", 0);	
		}
		
	
		request.setAttribute("message", msg);
		request.getRequestDispatcher("jsp/SearchResult.jsp").forward(request, response);
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
