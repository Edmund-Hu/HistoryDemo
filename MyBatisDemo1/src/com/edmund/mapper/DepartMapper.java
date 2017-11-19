package com.edmund.mapper;



import com.edmund.entity.Depart;


public interface DepartMapper{
	public Depart findDepartById(int id);
	public Depart findDepartWithUsers(int id);

}
