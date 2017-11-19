package com.Edmund_7_28_Shangji;

public class Employee {
	private String EmployeeNO;
	private double Basepay;
	private double bonus;
	private int overTime;
	public Employee(String employeeNO, double basepay, double bonus,
			int overTime) {
		EmployeeNO = employeeNO;
		Basepay = basepay;
		this.bonus = bonus;
		this.overTime = overTime;
	}
	public String getEmployeeNO() {
		return EmployeeNO;
	}
	public void setEmployeeNO(String employeeNO) {
		EmployeeNO = employeeNO;
	}
	public double getBasepay() {
		return Basepay;
	}
	public void setBasepay(double basepay) {
		Basepay = basepay;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public int getOverTime() {
		return overTime;
	}
	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}
	
	public double getFinalSalary(){
		return (Basepay+bonus+overTime*40)*0.82*0.85;	
	}
	
	public double getPersonalTax(){
		return (Basepay+bonus+overTime*40)*0.18;
	}
	public double getCompanyTax(){
		return (Basepay+bonus+overTime*40)*0.43;
	}
	
	
}
