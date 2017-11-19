package com.edmund.servlet;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
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


import com.edmund.dao.FileNameDao;
import com.edmund.dao.MessageDao;
import com.edmund.dao.UserDao;
import com.edmund.tool.mj;
import com.edmund.web.Message;
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
	
		String method = request.getParameter("method");
		if("download".equals(method)){
			fileDownload(request, response);
		}else if("export".equals(method)){
			System.out.println("进入get导出方法");
			exportCsv(request, response);
			
		}
	
	}
	
	
public void fileDownload(HttpServletRequest request, HttpServletResponse response){
	String fileName = request.getParameter("select");
	//System.out.println(fileName);
	//设置文件MIMe类型
	response.setContentType(getServletContext().getMimeType(fileName));
	//设置Content-Disposition
	response.setHeader("Content-Disposition", "attachment;filename="+fileName);
	//读取目标文件，通过response将目标文件写到客户端
	//获取文件的觉得路径
	 String path = request.getSession().getServletContext().getRealPath("\\Upload\\"+fileName);
	InputStream in=null;
	OutputStream out=null ;
	try {
		in = new FileInputStream(path);
		 out = response.getOutputStream();
		 int b ;
			while(-1!=(b=in.read())){
				out.write(b);
				out.flush();
			}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("文件读入出错！");
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("文件下载出错！");
	}finally{
		try {
			out.close();
			in.close();	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

public void exportCsv(HttpServletRequest request, HttpServletResponse response){
	//System.out.println("进入导出方法");
	String sql="select b.id,a.username, b.message,b.inserttime from userinfo  a, message b"+ 
			" where a.id=b.userid and b.status = '0' order by inserttime desc";
	Message[] msg =MessageDao.getMessages(sql);
	//设置文件MIMe类型
		response.setContentType(getServletContext().getMimeType("alldatas.csv"));
		//设置Content-Disposition
		response.setHeader("Content-Disposition", "attachment;filename=alldatas.csv");
		//设置输入流的编码格式，解决乱码问题；
		response.setCharacterEncoding("GBK");
	Writer out =null;
	BufferedWriter bfout = null;
	try {
		out = response.getWriter();
		bfout = new BufferedWriter(out);
		String head="Id ,Message,Username,Time";
		bfout.write(head);
		bfout.newLine();
		for(Message m:msg){
		//调用方法去掉message内容里面的换行符，以便于输出格式控制
		String message = this.delEnterKey(m.getMessage()).toString();
		String s=m.getId()+","+message+","+m.getUsername()+","+m.getInserttime()+"\r";
		bfout.write(s);
		bfout.flush();
		}
		//System.out.println("完成输出");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	public StringBuilder delEnterKey(String s){
		char[] newstr = s.toCharArray();
		StringBuilder str = new StringBuilder();
		for(char c: newstr){
			if(13==(int)(c)||10==(int)(c)){
				
			}else{
				str=str.append(c);
			}
		}
		
		return str;
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
		
			 //System.out.println("进入if语句");
			List<FileItem> items = null;
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
						 System.out.println("文件上传成功！");
						 //将文件名存入数据库filename表中
							FileNameDao f = new FileNameDao();
							if(f.setPath(it.getName())){
								System.out.println("文件名存入数据库成功！");
							}
				
						// 如果文为csv，将文件类容存在数据库里面；
						 if(it.getName().endsWith(".csv")){
						this.importCsv(uploadFile);
					 	}
						 
						 request.setAttribute("cont", "yes");
						 request.getRequestDispatcher("jsp/AddMessage.jsp").forward(request,response);
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
			
		
	}

	public void importCsv(File importFile) {
		
		 Reader in = null;
		 BufferedReader bfin = null;
		 String str = null;
		 String s = null;
		
		 ArrayList<String> arrlist=new ArrayList<>();
		  try {
			in = new FileReader(importFile);
			 bfin = new BufferedReader(in);
			  while((str=bfin.readLine())!=null){
			  s=str.trim();
				  arrlist.add(s);
			  	}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("没找到导入的文件");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("导入文件读入错误");
			e.printStackTrace();
		}
		 
		  System.out.println(arrlist.size());
		  String[][] strarr=new String[arrlist.size()][3];
			 for(int i=1;i<strarr.length;i++){			
					 strarr[i]=arrlist.get(i).split(",");	
					 for(String s1:strarr[i]){
						 System.out.println(s1);
					 }
					 int userid = Integer.parseInt(strarr[i][2]);
					 String message = strarr[i][1];
					 String inserttime= strarr[i][3];
					mj.insertMsg(message, userid,inserttime);
					 //System.out.println("userid"+userid);
					 //System.out.println("message"+message);
					 //System.out.println("insertime"+inserttime);
			 }
			 System.out.println("文件内容存入数据库成功！");
		
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
