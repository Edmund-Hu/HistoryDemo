package com.edmund.dao;

import java.util.List;
import java.util.Map;

import com.edmund.tool.mj;

import com.edmund.web.Image;

public class imageDao {

	 public static Image[] getImgs(){
			mj.dConn();
			String sql="select * from image";
			List<Map<String,Object>> list=mj.executeQuery(sql);
				Image[] image =new Image[list.size()];
				for(int i=0;i<list.size();i++){
					image[i] = new Image();
					image[i].setImgName((String)(list.get(i).get("imgName")));
					image[i].setIntro((String)(list.get(i).get("intro")));
				
				}
				return image;
			
		}
	 
	 public static void main(String[] args) {
		 imageDao iDao= new imageDao();
		 Image[] image=iDao.getImgs();
		 for(Image m:image){
			 System.out.println(m);
		 }
	}
	
}
