package StuMagrSys;

public class Input {
	public static int ans;
	public static Double score;
	public void input(){
		InputJuage inputJuage=new InputJuage();
		if(inputJuage.inputJg()){
			
		}else{
			System.out.println("输入数据有误，请重新输入");
			this.input();
		}
	}
	
	public  void Score(){
		InputJuage inputJuage=new InputJuage();
		if(inputJuage.ScoreJg()){
			
		}else{
			System.out.println("成绩只能为数字,请重新输入");
			this.Score();
		}
	}
}