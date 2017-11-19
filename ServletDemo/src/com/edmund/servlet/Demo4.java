package com.edmund.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.BAD_POLICY_TYPE;

/**
 * Servlet implementation class Demo4
 */
@WebServlet("/Demo4")
public class Demo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	/*	request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");*/
		
		String name = request.getParameter("name");
		System.out.println(name);
		//断骨重组
		byte[] bt = name.getBytes("ISO8859-1");
		String name2 = new String(bt,"utf-8");
		System.out.println(name2);
		response.setContentType("text/html, charset=utf-8");
		String password = request.getParameter("password");
		request.setAttribute("name", name2);
		request.setAttribute("password", password);
		/*response.sendRedirect("jsp/sucess.jsp");*/// 重定向
		request.getRequestDispatcher("jsp/sucess.jsp").forward(request, response);//页面跳转
		
	}

}
