package com.edmund.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.edmund.entity.Student;

public interface StudentMapper {
	@Insert("insert into stu values(null,#{name},#{age})")
	public int insertStu(Student student);
	
	@Delete("delete from stu where id =#{id}")
	public int deleteStu(int id);
	
	@Update("update stu set name=#{name},age=#{age} where id=#{id} ")
	public int updateStu(Student student);
	
	@Select("select * from stu where id =#{id}")
	public Student selectStuById(int id);
	
	@Select("select * from stu")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="name",property="name"),
		@Result(column="age",property="age")
	})
	public List<Student> selectAllStu();
	
	@Select("select * from stu")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="name",property="name"),
		@Result(column="age",property="age"),
		@Result(column="departid",property="depart",one=@One(select="com.edmund.mappers.DepartMapper.findDepartById"))
	})
	public List<Student> selStuWithDepart();
	
	
	@Select("select * from stu where departid=#{departid}")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="name",property="name"),
		@Result(column="age",property="age")
	
	})
	public List<Student> selStuByGrageId(int departid);
	

}
