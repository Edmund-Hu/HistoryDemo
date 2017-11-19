package com.edmund.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.BAD_POLICY_TYPE;

import com.edmund.entity.User;
import com.sun.net.httpserver.HttpContext;

/**
 * Servlet implementation class Demo4
 */
@WebServlet("/Demo5")
public class Demo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie cookie = new Cookie("name", "Edmund");
		cookie.setMaxAge(60);
		response.addCookie(cookie);
		
		response.sendRedirect("jsp/sucess.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	/*	request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");*/
		
		String name = request.getParameter("name");
		String [] hobbies = request.getParameterValues("hobby");
		System.out.println(hobbies[0]);
		//断骨重组
		byte[] bt = name.getBytes("ISO8859-1");
		String name2 = new String(bt,"utf-8");
		response.setContentType("text/html, charset=utf-8");
		String password = request.getParameter("password");
		User user = new User(); 
		user.setHobbies(hobbies);
		user.setName(name2);
		user.setPassword(password);
		System.out.println(user);
		request.setAttribute("user", user);
/*		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(3600);
		session.setAttribute("user", user);
	*/
		//System.out.println(session.isNew());
		//System.out.println("session的ID是："+session.getId());
		//System.out.println("session的创建时间是："+new Date(session.getCreationTime()));
		ServletContext application=this.getServletContext();   
		application.setAttribute("app", "this is a application test");
		
		
		//response.sendRedirect("jsp/sucess3.jsp");//重定向	
		request.getRequestDispatcher("jsp/sucess.jsp").forward(request, response);//页面跳转

		
		
	}

}
