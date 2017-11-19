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

import com.edmund.dao.FileNameDao;
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
		{	int currentPage = Integer.parseInt(request.getParameter("currentPage"));
			int pageSize = 5;
			this.quary(request, response,currentPage,pageSize);
			
		}else if("edit".equals(request.getParameter("method"))){
			int msgid =Integer.parseInt(request.getParameter("id"));
			String sql="select b.id,a.username, b.message,b.inserttime from userinfo  a, message b where a.id=b.userid and b.id="+msgid;
			Message[] msg = MessageDao.getMessages(sql);
			request.setAttribute("message", msg);
			request.getRequestDispatcher("jsp/EditMessage.jsp").forward(request, response);
		}else if("delete".equals(request.getParameter("method"))){
			int msgid =Integer.parseInt(request.getParameter("id"));
			mj.modifyMsg("status", "id", msgid, 1);
			response.sendRedirect("SearchMessage.edmund?method=quary&currentPage=1");
		}
		
		else if ("quaryme".equals(request.getParameter("method"))){
			
			//System.out.println("ÎÒµÄÎÄµµ");
			HttpSession session=request.getSession();
			String username =  (String) session.getAttribute("username");
			String sql="select b.id,a.username, b.message,b.inserttime from userinfo  a, message b"+ 
					" where a.id=b.userid and b.status = '0' and a.username='"+username+"'order by inserttime desc";
			
			this.quary(request, response,sql);
		}
		
		
		else{
			
			for(int i=0;i<10;i++){
				String str2 ="id"+i;
				if(request.getParameter(str2)!=null&&""!=request.getParameter(str2)){
				int id =Integer.parseInt(request.getParameter(str2)) ;			
				mj.modifyMsg("status", "id", id, 1);
				}
			}
				response.sendRedirect("SearchMessage.edmund?method=quary");
		}
		
		

	}
	
	
public void quary(HttpServletRequest request, HttpServletResponse response,int currentPage,int pageSize)
		throws ServletException, IOException {
	int totalPage =mj.getTotalPage(pageSize);
	String sql=null;
	if (currentPage<=1){
		currentPage=1;
	}else if(currentPage>=totalPage){
		currentPage = totalPage;
	}

	sql="select b.id,a.username, b.message,b.inserttime from userinfo  a, message b"+ 
		" where a.id=b.userid and b.status = '0' order by inserttime desc limit "+(currentPage-1)*pageSize+","+pageSize ;
	//System.out.println(sql);
	Message[] msg =MessageDao.getMessages(sql);
	FileNameDao f = new FileNameDao();
	List<String> fileName = f.getPaths();
	request.setAttribute("currentPage", currentPage);
	request.setAttribute("totalPage", totalPage);
	request.setAttribute("message", msg);
	request.setAttribute("filename", fileName);
	
	request.getRequestDispatcher("jsp/SearchMessage.jsp").forward(request, response);
	
}


public void quary(HttpServletRequest request, HttpServletResponse response,String sql)
		throws ServletException, IOException {
	Message[] msg =MessageDao.getMessages(sql);
	request.setAttribute("message", msg);
		
	request.getRequestDispatcher("jsp/SearchMessage.jsp").forward(request, response);
	
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
		response.sendRedirect("SearchMessage.edmund?method=quary&currentPage=1");

	
		
		
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
