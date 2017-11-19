package com.Edmund_7_28;

public class Assembler {
	public static void main(String[] args) {
		PCI nc =new NetCard();
		PCI sc =new Sond();
		nc.start();
		sc.stop();
	}
}
