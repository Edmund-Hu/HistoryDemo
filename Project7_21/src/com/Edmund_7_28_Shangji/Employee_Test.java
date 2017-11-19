package com.Edmund_7_28_Shangji;

public class Employee_Test {
	 public static void main(String[] args) {
		 Employee a1= new Employee("001", 3000, 620, 36);
		 Employee a2= new Employee("002", 4500, 230, 12);
		 Employee a3= new Employee("003", 6000, 1000, 0);
		 Employee a4= new Employee("004", 3500, 200, 22);
		 
		System.out.print( "a1的最终工资为："+a1.getFinalSalary()+"\t");
		System.out.print( "a1的缴纳的四金为："+a1.getPersonalTax()+"\t");
		System.out.println( "公司为a1的缴纳的四金为："+a1.getCompanyTax()+"\t");
		
		System.out.print( "a2的最终工资为："+a2.getFinalSalary()+"\t");
		System.out.print( "a2的缴纳的四金为："+a2.getPersonalTax()+"\t");
		System.out.println( "公司为a2的缴纳的四金为："+a2.getCompanyTax()+"\t");
		
		System.out.print( "a3的最终工资为："+a3.getFinalSalary()+"\t");
		System.out.print( "a3的缴纳的四金为："+a3.getPersonalTax()+"\t");
		System.out.println( "公司为a3的缴纳的四金为："+a3.getCompanyTax()+"\t");
		
		System.out.print( "a4的最终工资为："+a4.getFinalSalary()+"\t");
		System.out.print( "a4的缴纳的四金为："+a4.getPersonalTax()+"\t");
		System.out.println( "公司为a4的缴纳的四金为："+a4.getCompanyTax()+"\t");
	 }
}
