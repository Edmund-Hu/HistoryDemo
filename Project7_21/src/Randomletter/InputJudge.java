package Randomletter;

import java.util.Scanner;

public class InputJudge {
	public static void judge(){
		Scanner SC = new Scanner(System.in);
		String a=SC.next();
		char c=a.charAt(0);
		if(c==giveRandomLetter.iN){
			giveRandomLetter.giveLetter();
			judge();
		}else if(c=='0'){
			System.out.println("测试完成，程序结束");
			System.exit(0);
		}else if(c!=giveRandomLetter.iN){
			System.out.println("输入错误，继续");
			giveRandomLetter.giveLetter();
			judge();
		}
	}
}
