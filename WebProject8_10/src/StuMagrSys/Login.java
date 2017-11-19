package StuMagrSys;

import java.util.Scanner;

import com.Edmund_8_11.mj;

public class Login {
	
	
	public void logggin(){
		System.out.println("\t" + "                         欢迎使用学生管理系统，请登录");
		if(this.login()){
			MainPage.MianPage();
		}else{
			System.out.println("登录失败");
			logggin();
		}
	}
		
	public boolean login(){
	Scanner SC=new Scanner(System.in);
	System.out.println("请输入用户名");
	String name=SC.next();
	System.out.println("请输入密码");
	String Password= SC.next();

		if(name.equals(mj.USER) && Password.equals(mj.PW)){
			return true;
		}else{
			return false;
		}
	

	}
}
