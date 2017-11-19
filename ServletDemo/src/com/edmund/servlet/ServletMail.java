	package com.edmund.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.mail.util.MailSSLSocketFactory;


/**
 * Servlet implementation class ServletMail
 */
@WebServlet("/ServletMail")
public class ServletMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//从哪个邮箱开始发送邮件，发件人
		String from ="695330092@qq.com";
		//收件人的邮箱地址
		String to ="vhudp@163.com";
		//发件服务器
		String host = "smtp.qq.com";
		Properties properties = new Properties();
		properties.setProperty("mail.host", host);
		properties.setProperty("mail.transport.protocol","smtp");  
		properties.setProperty("mail.smtp.auth","true");  
		//QQ邮箱要开启SSL加密协议
		MailSSLSocketFactory sf =null;
		try {
			sf = new MailSSLSocketFactory();
		} catch (GeneralSecurityException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		sf.setTrustAllHosts(true);
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.ssl.socketFactory", sf);
		
		//邮件缓存
		Session session = Session.getInstance(properties);
		//开启调试模式，会打印出发送过程的详细信息
		session.setDebug(true);
		
		 response.setContentType("text/html;charset=UTF-8");
	      PrintWriter out = response.getWriter();
	      Transport transport = null;
	      String path = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getRequestURI();
	      try {
	    	 transport = session.getTransport();
	    	 transport.connect(host,"695330092@qq.com", "nobkyvshpuimbbjb");
	    	 
	    	MimeMessage message = new MimeMessage(session);
	    	//设置收件人
			message.setFrom(new InternetAddress(from));
			//message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("你好，我是来自java的邮件");
			message.setContent("这是一封通过Java发送的邮件！！不用回复！这里是我们项目的地址<a href='"+path+"' >"+path+"</a>","text/html;charset=utf-8");
			transport.sendMessage(message,new Address[] { new InternetAddress(to) });  
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
