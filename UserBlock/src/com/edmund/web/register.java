package com.edmund.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class register extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public register() {
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
		//��������
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//ȡ��register�ύ������
		String username = request.getParameter("username");
		String password =request.getParameter("pw");
		String sexm = request.getParameter("sexm");
	
		String email =request.getParameter("email");
		String sex=null;
	
		if(sexm.equals("1")){
			sex="��";
		}else{
			sex="Ů";
		}
		
		String sql="select username from userinfo where username="+"'"+username+"'";
		String sql2="select email from userinfo where email="+"'"+email+"'";
	
		System.out.println(sql);
		System.out.println(username);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print(sexm);
	if(mj.queryExist(sql,username)){
			out.print("<script>alert('�û����Ѿ����ڣ������������û���');window.location.assign('register.html')</script>");
			
		}
	else if(mj.queryExist(sql2, email)){
		out.print("<script>alert('�����Ѿ����ڣ���������������');window.location.assign('register.html')</script>");
	}else{
		
		if(mj.updatedata(username, password, sex, email)){
			out.print("<script>alert('ע��ɹ������¼')</script>");
		}
	}
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
		System.out.println("��ʼ��");
	}

}
