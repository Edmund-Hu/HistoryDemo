package com.Edmund_7_27;

public class Juicer_test {

	public static void main(String[] args) {
		Juicer j= new Juicer();
		Banala b= new Banala("���", "�㽶", "����");
		Apple a= new Apple("Բ��", "ƻ��", "�ӱ�");
		j.makeJuice(a);
		j.makeJuice(b);		
				

	}

}
