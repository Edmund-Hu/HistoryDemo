package com.Edmund_7_28_Shangji;

public class Employee_Test {
	 public static void main(String[] args) {
		 Employee a1= new Employee("001", 3000, 620, 36);
		 Employee a2= new Employee("002", 4500, 230, 12);
		 Employee a3= new Employee("003", 6000, 1000, 0);
		 Employee a4= new Employee("004", 3500, 200, 22);
		 
		System.out.print( "a1�����չ���Ϊ��"+a1.getFinalSalary()+"\t");
		System.out.print( "a1�Ľ��ɵ��Ľ�Ϊ��"+a1.getPersonalTax()+"\t");
		System.out.println( "��˾Ϊa1�Ľ��ɵ��Ľ�Ϊ��"+a1.getCompanyTax()+"\t");
		
		System.out.print( "a2�����չ���Ϊ��"+a2.getFinalSalary()+"\t");
		System.out.print( "a2�Ľ��ɵ��Ľ�Ϊ��"+a2.getPersonalTax()+"\t");
		System.out.println( "��˾Ϊa2�Ľ��ɵ��Ľ�Ϊ��"+a2.getCompanyTax()+"\t");
		
		System.out.print( "a3�����չ���Ϊ��"+a3.getFinalSalary()+"\t");
		System.out.print( "a3�Ľ��ɵ��Ľ�Ϊ��"+a3.getPersonalTax()+"\t");
		System.out.println( "��˾Ϊa3�Ľ��ɵ��Ľ�Ϊ��"+a3.getCompanyTax()+"\t");
		
		System.out.print( "a4�����չ���Ϊ��"+a4.getFinalSalary()+"\t");
		System.out.print( "a4�Ľ��ɵ��Ľ�Ϊ��"+a4.getPersonalTax()+"\t");
		System.out.println( "��˾Ϊa4�Ľ��ɵ��Ľ�Ϊ��"+a4.getCompanyTax()+"\t");
	 }
}
