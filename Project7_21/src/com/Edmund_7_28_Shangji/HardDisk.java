package com.Edmund_7_28_Shangji;

public class HardDisk {
	int capacity; //����
	// ���ڴ洢����ת��
	int rotationSpeed;
	// ���ڱ�ʾ����������
	String manufacturer;
	// ��ʾ����ʣ��ռ�
	int freeSpace;
	// ���̷���4��
	int[] partitions = new int[4];
	// ���캯��
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
	// ���ô��̷�������
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
	// ƴװ������Ϣ�ַ�����������
	public String displayInfo() {
		String info = "";
		info += "��Ӳ������Ϊ��" + capacity + "G";
		info += "\n��Ӳ��ת��Ϊ��" + rotationSpeed + "RPM";
		info += "\n��Ӳ�������̣�" + manufacturer + "";
		info += "\nʣ����ÿռ䣺" + freeSpace + "G";
		info += "\nӲ�̷�����Ϣ��";
		for (int cnt = 0; cnt < partitions.length; cnt++) {
			info += this.partitions[cnt] + "G ";
		}
		info += "\n------------------------------";
		return info;
	}
}


