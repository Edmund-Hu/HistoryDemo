package StuMagrSys;

import java.util.Scanner;

public class Login {
	
	
	public void logggin(){
		System.out.println("\t" + "                         ��ӭʹ��ѧ������ϵͳ�����¼");
		if(this.login()){
			MainPage.MianPage();
		}else{
			System.out.println("��¼ʧ��");
			logggin();
		}
	}
	
	
	
	
	public boolean login(){
	Scanner SC=new Scanner(System.in);
	System.out.println("�������û���");
	String name=SC.next();
	System.out.println("����������");
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
