package com.Edmund_7_27;

public class Juicer_test {

	public static void main(String[] args) {
		Juicer j= new Juicer();
		Banala b= new Banala("弯的", "香蕉", "海南");
		Apple a= new Apple("圆的", "苹果", "河北");
		j.makeJuice(a);
		j.makeJuice(b);		
				

	}

}
