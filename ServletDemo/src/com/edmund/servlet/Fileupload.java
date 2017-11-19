package com.edmund.servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;



/**
 * Servlet implementation class Fileupload
 */
@WebServlet("/Fileupload")
public class Fileupload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fileupload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//判断这个请求是不是一个mutiPart请求
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
	
		System.out.println(isMultipart);
		if(isMultipart){
			// Create a factory for disk-based file items
			//创建一个基于硬盘的文件项目工厂
			DiskFileItemFactory factory = new DiskFileItemFactory();

			// Configure a repository (to ensure a secure temp location is used)
			//配置一个临时存储库
			ServletContext servletContext = this.getServletConfig().getServletContext();
			File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
			factory.setRepository(repository);

			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);
 
			// Parse the request
			try {
				List<FileItem> items = upload.parseRequest(request);
				 System.out.println("请求元素个数为："+items.size());
				 //对集合进行分类
				 //是否是普通的字符串
				 for(FileItem it: items){
					 if(it.isFormField()){
						 //通过getFieldName拿到input的name属性,getString拿到input的value属性
						 System.out.println(it.getFieldName()+":"+it.getString());
					 }else{
						 String path = request.getSession().getServletContext().getRealPath("/Upload/");
						 System.out.println(path);
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
		response.sendRedirect("jsp/sucess2.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
