package com.Edmund_7_27;

public class InstrumentTest {
	public void testplay(Intrument I){
		I.play();
	}
	
	public static void main(String[] args) {
		Piano P = new Piano("∏÷«Ÿ");
		Vilolin V =new Vilolin("–°Ã·«Ÿ");
		InstrumentTest T = new InstrumentTest();
		T.testplay(P);
		System.out.println("------------");
		T.testplay(V);
				

	}

}
