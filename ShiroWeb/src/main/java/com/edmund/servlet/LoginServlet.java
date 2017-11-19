package com.edmund.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("login doget");
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("login dopost");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		Subject currentUser = SecurityUtils.getSubject();
		UsernamePasswordToken 	token = new UsernamePasswordToken(userName,password);
		try {
			currentUser.login(token);
			System.out.println("成功");
			response.sendRedirect("success.jsp");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("失败");
			request.setAttribute("errorInfo", "用户名或者密码错误");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
			
		}
	}

}
