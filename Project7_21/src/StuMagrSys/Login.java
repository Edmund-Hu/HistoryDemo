package StuMagrSys;

import java.util.Scanner;

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
	for(int i=0;i<userDB.uc.length;i++){
		if(name.equals(userDB.uc[i].getName()) && Password.equals(userDB.uc[i].getPassword())){
			return true;
		}else{
			//return false;
		}
	}
	return false;		
	}
	

	
}
