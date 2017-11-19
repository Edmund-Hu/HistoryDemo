package com.Edmund_7_28_Shangji;

public class HardDisk {
	int capacity; //容量
	// 用于存储磁盘转速
	int rotationSpeed;
	// 用于表示磁盘制造商
	String manufacturer;
	// 表示磁盘剩余空间
	int freeSpace;
	// 磁盘分区4个
	int[] partitions = new int[4];
	// 构造函数
	public HardDisk(int capacity, int rotationSpeed, String manufacturer) {
		this.capacity = capacity;
		this.manufacturer = manufacturer;
		this.rotationSpeed = rotationSpeed;
		this.freeSpace = capacity;
	}
	public int getCapacity() {
		return capacity;
	}
	public int getRotationSpeed() {
		return rotationSpeed;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getFreeSpace() {
		return freeSpace;
	}
	public int[] getPartitions() {
		return partitions;
	}
	// 设置磁盘分区容量
	public void setPartition(int index, int value) {
		if (freeSpace == 0) {
			return;
		}
		if (index >= partitions.length || index < 0) {
			return;
		}
		if (freeSpace < value) {
			partitions[index] = freeSpace;
			freeSpace = 0;
		} else {
			partitions[index] = value;
			freeSpace -= value;
		}
	}
	// 拼装磁盘信息字符串，并返回
	public String displayInfo() {
		String info = "";
		info += "本硬盘容量为：" + capacity + "G";
		info += "\n本硬盘转速为：" + rotationSpeed + "RPM";
		info += "\n本硬盘制造商：" + manufacturer + "";
		info += "\n剩余可用空间：" + freeSpace + "G";
		info += "\n硬盘分区信息：";
		for (int cnt = 0; cnt < partitions.length; cnt++) {
			info += this.partitions[cnt] + "G ";
		}
		info += "\n------------------------------";
		return info;
	}
}


