package com.edmund.tool;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		if (session.getAttribute("username") == null) {
			if (req.getRequestURI().endsWith("Login.jsp")||req.getRequestURI().contains("/Home/")||req.getRequestURI().contains("/css/")
					||req.getRequestURI().contains("/img/")||req.getRequestURI().endsWith("LoginJudge.edmund")||req.getRequestURI().endsWith("HomePage.edmund")) {
				//System.out.println("放弃拦截login");
				// arg2.doFilter(request,response);
			} else {
				req.getRequestDispatcher("/jsp/Login.jsp?username=!").forward(
						request, response);
			}
		}
		arg2.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("进入过滤器");
	}

}
