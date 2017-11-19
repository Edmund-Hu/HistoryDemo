package com.Edmund_Homework;

import java.util.ArrayList;
import java.util.List;

public class Bootchy {
	  int bootch;
  String snootch;
  public Bootchy() {
     this("snootchy");
     System.out.print("first ");
  }
  public Bootchy(String snootch) {
     this(420, "snootchy");
     System.out.print("second ");
  }
  public Bootchy(int bootch, String snootch) {
     this.bootch = bootch;
     this.snootch = snootch;
     System.out.print("third ");
  }
  
  
 public static void main(String[] args) {
 Bootchy b = new Bootchy();
  System.out.print(b.snootch + " " + b.bootch);
  List<Integer> list = new ArrayList<Integer>();
 // list.remove(5);
  for(int i=0;i<10;i++){   list.add(i);   }
  List<Integer> subList  = list.subList(4, 9);
  subList.clear();
  System.out.println(list);

  
  
}
}

