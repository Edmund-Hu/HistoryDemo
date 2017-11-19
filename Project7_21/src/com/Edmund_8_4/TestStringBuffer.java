package com.Edmund_8_4;

public class TestStringBuffer {
	
	public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("wish");
        System.out.println(buffer.toString());
        for(int i=0;i<15;i++){
        	buffer.append(i);
        	System.out.println("长度为：" + buffer.length());
            System.out.println("容量为：" + buffer.capacity());
        }
        
        buffer.setCharAt(0, 'W');
        buffer.append('!');
        buffer.append(" Here we are!");
        buffer.insert(0, "Hello ");
        System.out.println(buffer.toString());
        int start = buffer.indexOf("Wish");
        if (start != -1) {
			int end = start + "Wish".length();
			buffer.replace(start, end, "Java");
			System.out.println(buffer);
        }
        System.out.println("长度为：" + buffer.length());
        System.out.println("容量为：" + buffer.capacity());
    }
	
}
