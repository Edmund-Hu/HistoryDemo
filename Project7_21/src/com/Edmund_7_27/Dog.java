package com.Edmund_7_27;

public class Dog {
	String name;    //����
	int age;         //����
	String color;	//��ɫ
	double weight;	//����
	void born(String n){    //С������
		name = n;
		age = 0;
		weight=0.5;
		color="��ɫ";
		System.out.println(name + "������"+"����������"+weight+"����"+"����"+color+"��");
	}
	void liveForYears(int years){   //���˶�����
		for(int i=0; i<years; i++){
			System.out.println("������һ���ȥ��");
			age ++;
			System.out.println(name + age + "����");
		}
	}
	void play(){
		System.err.println("�����"+name+"����һ�죬���ǳ�����");
	}
	void die(){    //����
		System.out.println(name + "������" + age + "��");
		System.out.println(name + "�㰲Ϣ�ɣ�");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.born("С��");
		dog.liveForYears(7);
		dog.play();
		dog.die();
	}

}