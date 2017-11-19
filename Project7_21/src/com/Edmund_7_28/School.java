package com.Edmund_7_28;

public class School implements PCM {
	public String detail(){
		return "我是中心";
	}
	private PrintInterface p;
	
	/*public void  print(Teacher t) {
		p.print(t.detail());
	}
	
	public void  print(Students s) {
		p.print(s.detail());
	}*/
	public void setprinter(PrintInterface p){
		this.p =p;
	}
	public void print(PCM I){
		p.print(I.detail());
	}
}
