package com.edmund.rolesTest;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.apache.shiro.subject.Subject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.edmund.common.ShiroUtil;
import com.mysql.fabric.xmlrpc.base.Array;

public class shiroRoelsTest {



	@Test
	public void testHasRoles() {
		//Subject currentUser =ShiroUtil.login("classpath:shiro_roles.ini", "vhudp", "123");
		Subject currentUser =ShiroUtil.login("classpath:shiro_roles.ini", "Edmund", "123456");
		//System.out.println(currentUser.hasRole("role1")?"有role1的角色":"没有role1的角色");
		boolean[] result = currentUser.hasRoles(Arrays.asList("role1","role2","role3"));
		System.out.println(result[0]?"有role1的角色":"没有role1的角色");
		System.out.println(result[1]?"有role2的角色":"没有role2的角色");
		System.out.println(result[2]?"有role3的角色":"没有role3的角色");
		System.out.println(currentUser.hasAllRoles(Arrays.asList("role1","role2","role3"))?"有所有的角色":"不全有role1，2，3的角色");
		
	}
	
	@Test
	/**
	 * checkRole 返回值为空，如果没有相应的角色就会报错
	 */
	public void testcheckRoles() {
		//Subject currentUser =ShiroUtil.login("classpath:shiro_roles.ini", "vhudp", "123");
		Subject currentUser =ShiroUtil.login("classpath:shiro_roles.ini", "Edmund", "123456");
	currentUser.checkRole("role3");
		boolean[] result = currentUser.hasRoles(Arrays.asList("role1","role2","role3"));
		System.out.println(result[0]?"有role1的角色":"没有role1的角色");
		System.out.println(result[1]?"有role2的角色":"没有role2的角色");
		System.out.println(result[2]?"有role3的角色":"没有role3的角色");
		System.out.println(currentUser.hasAllRoles(Arrays.asList("role1","role2","role3"))?"有所有的角色":"不全有role1，2，3的角色");
	}

}
