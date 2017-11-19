package com.edmund.web;



public class Image {
	private String imgName;
	private String intro;
		
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String name) {
		this.imgName = name;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String toString(){
		return this.imgName+"\t"+this.intro;
	}
	
}
