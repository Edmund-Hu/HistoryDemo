package Randomletter;

import java.util.Random;

public  class giveRandomLetter {
	static char iN;
	public static void giveLetter(){
		Random R =new Random();
		int r =R.nextInt();
		int num=Math.abs(r);
		int num1=num%26+97;
		iN=(char)num1;
		System.out.print(iN);
	}

}
