package com.Edmund_7_27;

import javax.rmi.CORBA.Tie;

import com.Edmund_7_25.Test1;

public class Test_teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javateacher t1 = new Javateacher("James", "������");
		t1.intruction();
		t1.giveLesson();
		UIteacher t2 = new UIteacher("����ʦ", "TI");
		t2.giveLesson();
	}

}
