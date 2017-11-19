package com.edmund.common;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class ShiroUtil {

		public static Subject login(String shiroConfig,String userName,String password){
			
			Factory<SecurityManager> factory = new IniSecurityManagerFactory(shiroConfig);
			//获取SecurityManager实例
			SecurityManager securityManager = factory.getInstance();
			//把SecurityManager实例绑定到SecurityUtils
			SecurityUtils.setSecurityManager(securityManager);
			//得到当前执行的用户
			Subject currentUser = SecurityUtils.getSubject();
			//新建Token实例
			UsernamePasswordToken token = new UsernamePasswordToken(userName,password);
			try {
				currentUser.login(token);
				System.out.println("登录成功");
			} catch (AuthenticationException e) {
				
				// TODO: handle exception			
				e.printStackTrace();
				System.out.println("登录失败");
			}
			return currentUser;
		}
}
