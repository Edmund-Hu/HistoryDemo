package com.Edmund_7_21;

public class Cycle7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double HS;
		int CS = 0;
		int count = 0;
		System.out.println("…„ œ∂»"+"   "+"ª™ œ∂»");	
		do {
			HS = CS * 9 / 5.0 + 32;
			count += 1;
			if (count % 20 == 0) {
				System.out.println(" " + CS + "    " + (int) HS );
				System.out.println("-------------------");
			} else {
				System.out.println(" " + CS + "    " + (int) HS );
			}
			CS += 1;
		} while (CS <= 250);
	}

}
