package com.edmund.servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
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

import com.edmund.dao.FileLocationDao;
import com.edmund.dao.MessageDao;
import com.edmund.dao.UserDao;
import com.edmund.tool.mj;
import com.edmund.web.User;

public class fileload extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public fileload() {
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
		String fileName = request.getParameter("select");
		System.out.println(fileName);
		//设置文件MIMe类型
		response.setContentType(getServletContext().getMimeType(fileName));
		//设置Content-Disposition
		response.setHeader("Content-Disposition", "attachment;filename="+fileName);
		//读取目标文件，通过response将目标文件写到客户端
		//获取文件的觉得路径
		 String path = request.getSession().getServletContext().getRealPath("\\Upload\\"+fileName);
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
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//System.out.println("进入post");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
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
			List<FileItem> items = null;
			 Reader in = null;
			 BufferedReader bfin = null;
			 String str = null;
			 String s = null;
			 //System.out.println("进入if语句");
			 FileLocationDao filedao = new FileLocationDao();
			try {
				// Parse the request
				 items = upload.parseRequest(request);
				// System.out.println("请求元素个数为："+items.size());
				 //对集合进行分类
				 //是否是普通的字符串
				 for(FileItem it: items){
					 if(it.isFormField()){
						 //通过getFieldName拿到input的name属性,getString拿到input的value属性
						 System.out.println(it.getFieldName()+":"+it.getString());
					 }else{
						 String path = request.getSession().getServletContext().getRealPath("/Upload/");
						 String filepath = path+"\\"+it.getName();
						 System.out.println(filepath);
						 File uploadFile = new File(filepath);
						 it.write(uploadFile);
						 
						 
						 
						 //将文件地址存在数据库里面(只存文件名，文件地址的斜杠存入数据库会消失)
						
						 filedao.setPath(it.getName());
						 System.out.println("存入数据库的文件地址为："+filepath+filedao.getPath(it.getName()));
						// 如果文为txt，将文件类容存在数据库里面；
						 if(it.getName().endsWith(".txt")){
						 ArrayList<String> arrlist=new ArrayList<>();
						  in = new FileReader(uploadFile);
						  bfin = new BufferedReader(in);
						  while((str=bfin.readLine())!=null){
							  s=str.trim();
							  arrlist.add(s);
						  	}
						  
						  String[][] strarr=new String[arrlist.size()][4];
							 for(int i=0;i<strarr.length;i++){			
									 strarr[i]=arrlist.get(i).split("(\\s)+");	
									 String username = strarr[i][3];
									 String message = strarr[i][1];
									mj.insertUser(username, "123");
									UserDao userDao = new UserDao();
									User user = userDao.getUser(username);
									int userid = user.getId();
									mj.insertMsg(message, userid);
							 }
							 System.out.println("文件内容存入数据库成功！");
					 	}
					 }
				 }
				 
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//文件上传成功后，从数据库读取文件名，并返回给页面
			List<String> list =new ArrayList<>();
			list = filedao.getPaths();
			request.setAttribute("filename", list);
			request.getRequestDispatcher("jsp/upload.jsp").forward(request, response);
			
			
		}
			
		
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
