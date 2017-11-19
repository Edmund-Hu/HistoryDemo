package com.Edmund_7_27;

public class Intrument {
	private String name;

	public Intrument(String name) {
		this.name = name;
	}

	public void play() {
		System.out.println("我是" + name + "，开始弹奏前，摆好弹奏姿势");
	}
}
