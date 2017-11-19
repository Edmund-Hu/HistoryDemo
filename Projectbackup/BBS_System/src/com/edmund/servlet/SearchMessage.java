package com.edmund.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.edmund.dao.MessageDao;
import com.edmund.tool.mj;
import com.edmund.web.Message;

public class SearchMessage extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public SearchMessage() {
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
		{	String sql=null;
					
			sql="select b.id,a.username, b.message,b.inserttime from userinfo  a, message b"+ 
				" where a.id=b.userid and b.status = '0' order by inserttime desc";
		
			Message[] msg =MessageDao.getMessages(sql);
			
			request.setAttribute("message", msg);
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
			
			request.getRequestDispatcher("jsp/SearchMessage.jsp").forward(request, response);
		}else if("edit".equals(request.getParameter("method"))){
			int msgid =Integer.parseInt(request.getParameter("id"));
			String sql="select b.id,a.username, b.message,b.inserttime from userinfo  a, message b where a.id=b.userid and b.id="+msgid;
			Message[] msg = MessageDao.getMessages(sql);
			request.setAttribute("message", msg);
			request.getRequestDispatcher("jsp/EditMessage.jsp").forward(request, response);
		}else if("delete".equals(request.getParameter("method"))){
			int msgid =Integer.parseInt(request.getParameter("id"));
			mj.modifyMsg("status", "id", msgid, 1);
			response.sendRedirect("SearchMessage.edmund?method=quary");
		}else if("deleteAll".equals(request.getParameter("method"))){
			List<Integer> list = new LinkedList<Integer>();
			HttpSession session =request.getSession();
			list =(List<Integer>)(session.getAttribute("id"));
			System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			mj.modifyMsg("status", "id", list.get(i), 1);
		
		}
			response.sendRedirect("SearchMessage.edmund?method=quary");
		}else if("nextpage".equals(request.getParameter("method"))){
			int s =Integer.parseInt(request.getParameter("s"));
			 s=s+10;
			 response.sendRedirect("SearchMessage.edmund?method=quary&&s="+s);
			
		}else if("lastpage".equals(request.getParameter("method"))){
			int s =Integer.parseInt(request.getParameter("s"));
			 if(s<0){
				 s=0;
			 }else{s=s-10;}
			
			 response.sendRedirect("SearchMessage.edmund?method=quary&&s="+s);
			
		}
		
		
		
		
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
public void quary(HttpServletRequest request, HttpServletResponse response){
	
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
		String contents = (String)(request.getParameter("contents"));
		int userid=Integer.parseInt(request.getParameter("id"));
		mj.modifyMsg("message", "id", userid, contents);
		response.sendRedirect("http://localhost:8080/BBS_System/SearchMessage.edmund?method=quary");
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
