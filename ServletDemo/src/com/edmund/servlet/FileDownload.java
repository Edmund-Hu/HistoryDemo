package com.edmund.servlet;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.impl.encoding.CodeSetConversion.BTCConverter;

/**
 * Servlet implementation class FileDownload
 */
@WebServlet("/FileDownload")
public class FileDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileDownload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fileName = request.getParameter("fileName");
		System.out.println(fileName);
		String name = fileName.substring(7);
		System.out.println(name);
		
		//设置文件MIMe类型
		response.setContentType(getServletContext().getMimeType(name));
		//设置Content-Disposition
		response.setHeader("Content-Disposition", "attachment;filename="+name);
		//读取目标文件，通过response将目标文件写到客户端
		//获取文件的觉得路径
		String path = request.getSession().getServletContext().getRealPath(fileName);

		InputStream in = new FileInputStream(path);
		BufferedInputStream  bfin = new BufferedInputStream(in);
		OutputStream out = response.getOutputStream();
		//response.setContentType("text/html");
		//写文件
		byte[] bt = new byte[1024];
		while (bfin.read(bt)!=-1){
			out.write(bt);
			
		};
		out.flush();
		out.close();
		bfin.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
