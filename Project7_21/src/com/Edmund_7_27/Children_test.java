package com.Edmund_7_27;

public class Children_test {

	public static void main(String[] args) {
		Children child= new Children("Alex", 12);
		ToyCar car = new ToyCar("�������", "��ɫ");
		ToyPlane plane = new ToyPlane("��߷ɻ�", "��ɫ");
		child.getinfo(car);
		child.play(car);
		child.play(plane);
				
		

	}

}
