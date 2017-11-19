package com.Edmund_7_27;

public class Dog {
	String name;    //名字
	int age;         //年龄
	String color;	//颜色
	double weight;	//体重
	void born(String n){    //小狗诞生
		name = n;
		age = 0;
		weight=0.5;
		color="黄色";
		System.out.println(name + "诞生了"+"刚生下来有"+weight+"斤重"+"它是"+color+"的");
	}
	void liveForYears(int years){   //活了多少年
		for(int i=0; i<years; i++){
			System.out.println("汪汪，一年过去了");
			age ++;
			System.out.println(name + age + "岁了");
		}
	}
	void play(){
		System.err.println("今天和"+name+"玩了一天，它非常高兴");
	}
	void die(){    //死亡
		System.out.println(name + "生活了" + age + "年");
		System.out.println(name + "你安息吧！");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.born("小黄");
		dog.liveForYears(7);
		dog.play();
		dog.die();
	}

}