package StuMagrSys;

import java.util.Scanner;

public class InputJuage {
	Scanner sc=new Scanner(System.in);
	public boolean inputJg() {
		try {
			Input.ans=sc.nextInt();
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean ScoreJg() {
		try {
		Input.score=sc.nextDouble();
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	

}
