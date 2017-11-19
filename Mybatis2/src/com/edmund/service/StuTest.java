package com.edmund.service;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.edmund.entity.Student;
import com.edmund.entity.User;
import com.edmund.mappers.StudentMapper;
import com.edmund.mappers.UserMapper;
import com.edmund.util.SqlSessionFactoryUtil;

public class StuTest {
	private static Logger log = Logger.getLogger(StuTest.class);
	SqlSession sqlSession = null;
	StudentMapper stuMapper = null;
	/**
	 * 测试方法前调用
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		stuMapper = (StudentMapper) sqlSession.getMapper(StudentMapper.class);
	}
	/**
	 * 测试方法后调用
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}

	//@Test
	public void insertStu() {
		log.info("使用注解插入学生");
		Student student = new Student("Edmund",22);
		int result = stuMapper.insertStu(student);
		sqlSession.commit();
		if(result==1){
			System.out.println("插入成功！");
		}
	
	}
	//@Test
	public void updateStu() {
		log.info("使用注解更新学生");
		Student student = new Student(2,"Edmund",23);
		int result = stuMapper.updateStu(student);
		sqlSession.commit();
		if(result==1){
			System.out.println("更新成功！");
		}
	
	}
	
	//@Test
	public void deleteStu() {
		log.info("使用注解删除学生");
		int result = stuMapper.deleteStu(4);
		sqlSession.commit();
		if(result==1){
			System.out.println("删除成功！");
		}
	
	}
	
	//@Test
		public void selectStu() {
			log.info("使用注解查找学生");
			Student student = stuMapper.selectStuById(6);
			System.out.println(student);
		
		}
	
		//@Test
		public void selectAllStu() {
			log.info("使用注解查找学生");
			List<Student> list = stuMapper.selectAllStu();
			for (Student student2 : list) {
				System.out.println(student2);
			}
			
		}
		
		@Test
		public void selectAllStuWith() {
			log.info("使用注解查找学生带部门");
			List<Student> list = stuMapper.selStuWithDepart();
			for (Student student2 : list) {
				System.out.println(student2);
			}
			
			
		}


}
