package com.Edmund_8_3;

import java.util.Date;

public class NewsTitle {
	private int id;
	private String titleName;
	private String creater;
	private Date creatDate;
	public NewsTitle(int id,String titleName,String creater,Date creatDate){
		this.id=id;
		this.titleName=titleName;
		this.creatDate=creatDate;
		this.creater=creater;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public Date getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}
	
	
}
