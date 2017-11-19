package StuMagrSys;

public class StuMagrSYS {
	public static void main(String[] args) {
		userDB userDB=new userDB();
		userDB.initUser();
		Login login= new Login();
		login.logggin();
		
	}
}
