package com.edmund.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUpload extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public FileUpload() {
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
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fileName = request.getParameter("fileName");
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
		OutputStream out = response.getOutputStream();
		//response.setContentType("text/html");
		//写文件
		int b ;
		while(-1!=(b=in.read())){
			out.write(b);
			out.flush();
		}
		out.close();
		in.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置获取文件名的编码方式
		 request.setCharacterEncoding("UTF-8");
		 //设置响应的编码方式；
		 response.setCharacterEncoding("UTF-8");
		// Check that whether have a file upload request
		//检查是否是一个文件上传请求
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		if(isMultipart){
			// Create a factory for disk-based file items
			DiskFileItemFactory factory = new DiskFileItemFactory();

			// Configure a repository (to ensure a secure temp location is used)
			ServletContext servletContext = this.getServletConfig().getServletContext();
			File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
			factory.setRepository(repository);

			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);

			// Parse the request
			List<FileItem> items = null;
			try {
				 items = upload.parseRequest(request);
				 System.out.println("请求元素个数为："+items.size());
				 //对集合进行分类
				 //是否是普通的字符串
				 for(FileItem it: items){
					 if(it.isFormField()){
						 //通过getFieldName拿到input的name属性,getString拿到input的value属性
						 System.out.println(it.getFieldName()+":"+it.getString());
					 }else{
						 String path = request.getSession().getServletContext().getRealPath("/Upload/");
						//System.out.println(path);
						// String str = new String(it.getName().getBytes("ISO8859-1"),"UTF-8");
						 //System.out.println(str);
						 String filename = path+"\\"+it.getName();
						 File uploadFile = new File(filename);
						 it.write(uploadFile);
						 request.getSession().setAttribute("mypicture", "Upload\\"+it.getName());
						 
					 }
				 }
				 
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		request.getRequestDispatcher("sucess.jsp").forward(request, response);
		


	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
