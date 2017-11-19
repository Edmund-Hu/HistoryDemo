package com.edmund.rolesTest;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.apache.shiro.subject.Subject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.edmund.common.ShiroUtil;
import com.mysql.fabric.xmlrpc.base.Array;

public class shiropermissionTest {



	@Test
	public void testisPermitted() {
		Subject currentUser =ShiroUtil.login("classpath:shiro_permission.ini", "vhudp", "123");
		//Subject currentUser =ShiroUtil.login("classpath:shiro_permission.ini", "Edmund", "123456");
		System.out.println(currentUser.isPermitted("user:select")?"有user:select的权限":"没有user:select的权限");
		boolean[] result =currentUser.isPermitted("user:select","user:update","user:delete");
		System.out.println(result[0]?"有user:select的权限":"没有user:select的权限");
		System.out.println(result[1]?"有user:update的权限":"没有user:update的权限");
		System.out.println(result[2]?"有user:delete的权限":"没有user:delete的权限");
		System.out.println(currentUser.isPermittedAll("user:select","user:update")?"有所有的权限":"不全有的权限");
		currentUser.logout();
	}
	
	@Test
	/**
	 * checkRole 返回值为空，如果没有相应的权限就会报错
	 */
	public void testcheckPermissions() {
		Subject currentUser =ShiroUtil.login("classpath:shiro_permission.ini", "vhudp", "123");
		//Subject currentUser =ShiroUtil.login("classpath:shiro_permission.ini", "Edmund", "123456");
		currentUser.checkPermission("user:update");
		boolean[] result =currentUser.isPermitted("user:select","user:update","user:delete");
		System.out.println(result[0]?"有user:select的权限":"没有user:select的权限");
		System.out.println(result[1]?"有user:update的权限":"没有user:update的权限");
		System.out.println(result[2]?"有user:delete的权限":"没有user:delete的权限");
		System.out.println(currentUser.isPermittedAll("user:select","user:update")?"有所有的权限":"不全有的权限");
		currentUser.logout();
	}

}
