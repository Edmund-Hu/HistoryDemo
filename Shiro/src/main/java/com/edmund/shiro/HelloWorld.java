package com.edmund.shiro;



import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.util.Factory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//读取配置文件，初始化SecurityManager工厂
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
		//获取SecurityManager实例
		SecurityManager securityManager = factory.getInstance();
		//把SecurityManager实例绑定到SecurityUtils
		SecurityUtils.setSecurityManager(securityManager);
		//得到当前执行的用户
		Subject currentUser = SecurityUtils.getSubject();
		//新建Token实例
		UsernamePasswordToken token = new UsernamePasswordToken("Edmund","123456");
		try {
			currentUser.login(token);
			System.out.println("登录成功");
		} catch (AuthenticationException e) {
			// TODO: handle exception			
			System.out.println("登录失败");
		}
		currentUser.logout();
		
		
		
	}

}
