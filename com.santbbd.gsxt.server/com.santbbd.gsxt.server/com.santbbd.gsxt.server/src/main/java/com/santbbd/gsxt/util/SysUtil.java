package com.santbbd.gsxt.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;


/**
 * 系统工具类
 * @author yuantingting
 * @date 2017年2月6日上午8:59:12
 * Copyright (c) 2017, www.santbbd.com All Rights Reserved. 
 */
public class SysUtil {
	/**
	 * @description 比较数组中的字符 串是否全部相同
	 * @param strlist 需要比较的字符串数组
	 * @return 全部相同返回true 至少有两个不相同返回false 数组只有一个值时返回false
	 */
	public static boolean isEqual(List<String> strlist){
		boolean flag = true;
		if(strlist.size()==1){
			flag = false;
			return flag;
		}
		for(int i = 0; i < strlist.size() ;i++){
			for(int z = i+1; z < strlist.size() ;z++){
				if(!strlist.get(i).equals(strlist.get(z))){
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
	/**
	 * @description 获取当前时间的时间戳
	 * @return 时间戳字符串
	 */
	public static String timeStamp(){  
        long time = System.currentTimeMillis();  
        String t = String.valueOf(time/1000);  
        return t;  
     }  
	/**
	 * @description 将目标数字字符串转换成固定位数的数字字符串
	 * @param strformat 数字字符串位数  例如："000000"
	 * @param sourceStr 需要处理的数字字符串
	 * @return
	 */
	public static String showFormatStr(String strformat , String sourceStr){
		 DecimalFormat df=new DecimalFormat(strformat);
		 String desStr =df.format(Integer.parseInt(sourceStr));
		 return desStr;
	}
	
	/**
	 * 这是年-月-日 时:分:秒  */
	public static String dateFormat(Date date){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateFormat = df.format(date);
		return dateFormat;
	}
	/**
	 * 这是年-月-日  */
	public static String dateFormat1(Date date){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dateFormat = df.format(date);
		return dateFormat;
	}
	
	/**
	 * 这是月-日-年 时:分:秒  */
	public static String dateFormat2(Date date){
		SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		String dateFormat = df.format(date);
		return dateFormat;
	}
	
	/**
	 * 将地址转化为  本系统 国家、省、市区、地址 间隔的格式
	 * @param address
	 * @return
	 */
	public static String transAddress(String address){
		String result = "";
		int index = 0;
		if(address==null||StringUtils.isBlank(address)){
			return ",,,";
		}
		result = ",";
		if(address.contains("省")){
			result += address.substring(index,address.indexOf("省")+1)+",";
			index = address.indexOf("省")+1;
		}
		if(address.contains("市")){
			if(index==0){//没有省 暂时认为  为直辖市
				result += address.substring(index,address.indexOf("市")+1)+",";
				index = address.indexOf("市")+1;
			}else{
				result += address.substring(index,address.indexOf("市")+1)+",";
				index = address.indexOf("市")+1;
			}
		}else{
			result += ",";
		}
/*		if(address.contains("区")){
			result += address.substring(index,address.indexOf("区")+1)+",";
			index = address.indexOf("区")+1;
		}else{
			result += ",";
		}*/
		result += address.substring(index,address.length());
		return result;
	}
	/**
	 * 
	 * 
	 * @param oldDate 2016年12月03日 -----> 2016-12-03
	 */
	public static String transDateFormat(String oldDate){
		String year = oldDate.substring(0, 4);
		String month = oldDate.substring(5, 7);
		String day = oldDate.substring(8, 10);
		String newDate = year+month+day;
		return newDate;
		
	}
	public static void main(String[] args) {
	System.out.println(SysUtil.transAddress("福建省三明市梅列区徐碧二村40幢502室"));
	}
}
