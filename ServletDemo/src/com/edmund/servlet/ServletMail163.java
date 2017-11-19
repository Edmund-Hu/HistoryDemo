	package com.edmund.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class ServletMail
 */
@WebServlet("/ServletMail163")
public class ServletMail163 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMail163() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/**
		 * 使用163邮箱的相关设置和发送一封复杂邮件
		 * @author Edmund
		 */
		//收件人邮箱
		String to ="695330092@qq.com";
		//发件人邮箱
		String from ="vhudp@163.com";
		//163邮箱服务器地址
		String host = "smtp.163.com";
		//配置属性对象
		Properties properties = new Properties();
		  // 设置邮件服务器主机名
		properties.setProperty("mail.host", host);
		  // 发送邮件协议名称
		properties.setProperty("mail.transport.protocol","smtp");  
		// 发送服务器需要身份验证
		properties.setProperty("mail.smtp.auth","true");  
		 // 发送服务器端口，可以不设置，默认是25
	    properties.setProperty("mail.smtp.port", "25");
	
	    // 环境信息
		Session session = Session.getInstance(properties);
        // 开启debug调试 ，打印信息
		session.setDebug(true);
		
	      Transport transport = null;
	      String path = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getRequestURI();
	      try {
	    	  
	 
	    	 //邮件对象
	    	MimeMessage message = new MimeMessage(session);
	    	//设置发送人
			message.setFrom(new InternetAddress(from));
			message.setSubject("你好, 这是这周的工作报告!");
		       //整封邮件的MINE消息体
			          MimeMultipart messageMultipart = new MimeMultipart("mixed");//混合的组合关系
			          //设置邮件的MINE消息体
			          message.setContent(messageMultipart);
			          
			          //附件1
			          MimeBodyPart attch1 = new MimeBodyPart();
			          //附件2
			          MimeBodyPart attch2 = new MimeBodyPart();
			          //正文内容
			          MimeBodyPart content = new MimeBodyPart();
			          
			          //把内容，附件1，附件2加入到 MINE消息体中
			          messageMultipart.addBodyPart(attch1);
			          messageMultipart.addBodyPart(attch2);
			          messageMultipart.addBodyPart(content);
			          
			          //把文件，添加到附件1中
			          //数据源
			          DataSource ds1 = new FileDataSource(new File("D:/logFile1.txt"));
			          //数据处理器
			          DataHandler dh1 = new DataHandler(ds1 );
			          //设置第一个附件的数据
			          attch1.setDataHandler(dh1);
			          //设置第一个附件的文件名
			          attch1.setFileName(ds1.getName());
			          
			          //把文件，添加到附件2中
			          DataSource ds2 = new FileDataSource(new File("D:/paris.jpg"));
			          DataHandler dh2 = new DataHandler(ds2 );
			          attch2.setDataHandler(dh2);
			          attch2.setFileName(ds2.getName());
			          
			          //正文（图片和文字部分）
			          MimeMultipart bodyMultipart  = new MimeMultipart("related");
			          //设置内容为正文
			          content.setContent(bodyMultipart);
			         
			         //html代码部分
			         MimeBodyPart htmlPart = new MimeBodyPart();
			         //html中嵌套的图片部分
			         MimeBodyPart imgPart = new MimeBodyPart();
			         
			         //正文添加图片和html代码
			          bodyMultipart.addBodyPart(htmlPart);
			         bodyMultipart.addBodyPart(imgPart);
			          
			        //把文件，添加到图片中
			         DataSource imgds = new FileDataSource(new File("D:/yan5.jpg"));
			         DataHandler imgdh = new DataHandler(imgds );
			         imgPart.setDataHandler(imgdh);
			        //说明html中的img标签的src，引用的是此图片
			         imgPart.setContentID("yancopy.jpg");
			     
			         
			        //html代码
			        htmlPart.setContent("<span style='color:red'>这是来自Java Eclipse的邮件，我觉得应该不错吧</span><img src= \"cid:yancopy.jpg\">","text/html;charset=utf-8");
			         
			         //生成文件邮件
			         message.saveChanges();
	        message.writeTo(new FileOutputStream("E:\\ImageMail.eml"));  
	        
	        
	      	 transport = session.getTransport();
	      	 transport.connect(host,from, "hudepeng121298");
			transport.sendMessage(message,new Address[] { new InternetAddress(to) });  

			response.setContentType("text/html;charset=UTF-8");
		    PrintWriter out = response.getWriter();
			String title = "发送电子邮件";
	         String res = "成功发送消息...";
	         String docType = "<!DOCTYPE html> \n";
	         out.println(docType +
	         "<html>\n" +
	         "<head><title>" + title + "</title></head>\n" +
	         "<body bgcolor=\"#f0f0f0\">\n" +
	         "<h1 align=\"center\">" + title + "</h1>\n" +
	         "<p align=\"center\">" + res + "</p>\n" +
	         "</body></html>");
			
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}finally {
			try {
				transport.close();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	      	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
