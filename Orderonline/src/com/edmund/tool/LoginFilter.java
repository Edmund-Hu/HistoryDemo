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
			if (req.getRequestURI().endsWith("HomePage.jsp")||req.getRequestURI().endsWith("SearchResult.jsp")
					||req.getRequestURI().endsWith("Register.jsp")||req.getRequestURI().endsWith("RegisterSuccess.jsp")) {
				//System.out.println("放弃拦截login");
				
			} else {
				req.getRequestDispatcher("/jsp/HomePage.jsp").forward(
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
