package com.Edmund_7_28_Shangji;

public class Disk {
	public static void main(String[] args) {
		System.out.println("购买一个固定硬盘：");
		HardDisk hd = new HardDisk(320, 7200, "迈拓");
		hd.setPartition(0, 80);
		hd.setPartition(1, 100);
		System.out.println(hd.displayInfo());

		System.out.println("购买一个移动硬盘：");
		HardDisk mobileDisk = new HardDisk(160, 5400, "三星");
		for (int i = 0; i < 4; i++) {
			mobileDisk.setPartition(i, 50);
		}
		System.out.println(mobileDisk.displayInfo());
	}

}
