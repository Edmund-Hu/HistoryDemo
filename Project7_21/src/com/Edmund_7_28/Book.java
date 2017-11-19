package com.Edmund_7_28;

public class Book {
	private String title;
	private int pageNum;
	
	public void setTitle(String title){
		this.title =  title;
	}
	public String getTitle(){
		return title;
	}
	
	public void setpageNum(int pageNum){
		if(pageNum>=200){
			this.pageNum =  pageNum;
		}else{
			this.pageNum=200;
			System.out.println("输入页数小于200");
		}
	}
	public int getpageNum(){
		return pageNum;
	}
	

	public Book(String title, int pageNum) {
		this.title = title;
		if(pageNum>=200){
			this.pageNum = pageNum;
		}else{
			this.pageNum=200;
		}
	}
	public Book(){
		
	}

	public void detail(){
		System.out.println("书名为："+this.title+",页数为："+this.pageNum);
	}
	
}
