package com.Edmund_7_27;

public class InstrumentTest {
	public void testplay(Intrument I){
		I.play();
	}
	
	public static void main(String[] args) {
		Piano P = new Piano("����");
		Vilolin V =new Vilolin("С����");
		InstrumentTest T = new InstrumentTest();
		T.testplay(P);
		System.out.println("------------");
		T.testplay(V);
				

	}

}
