package com.Edmund_7_28;

public class School_test {
	public static void main(String[] args) {
		School S = new School();
		Teacher t= new Teacher();
		Students stu = new Students();
		ColorPrinter CP =new ColorPrinter();
		BlackPrinter BP = new BlackPrinter();
		S.setprinter(CP);//设置打印机
		S.print(t);
		S.setprinter(BP);//设置打印机
		S.print(stu);
	}
}
