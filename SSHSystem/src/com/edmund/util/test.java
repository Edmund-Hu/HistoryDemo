package com.edmund.util;



public class test {
	public static String convert(String a){
		/*1234*/
		String nu = String.valueOf(a).trim();
		String []str = nu.split("\\.");
		System.out.println(nu);
		System.out.println(str[0]);
		System.out.println(str[1]);
		String num = str[0];
	
		String bb[]={"Ô²","Ê°","°Û","Çª","Íò","Ê°","°Û","Çª","ÒÚ","Ê°","°Û","Çª","Íò","Ê°","°Û","Çª"};
		
		String bbed[]={"½Ç","·Ö"};
		String num2 = con(num);
		String num4 = con(str[1]);
		
		char cc[] = num2.toCharArray();
		String num3 ="";
		boolean flag= true;
		for (int i = cc.length-1; i >=0; i--) {
				
			num3=num3+cc[cc.length-i-1]+bb[i];
			
			}
		
		
		
		char dd[] = num4.toCharArray();
		String num5="";
		
		for (int i = 0; i <dd.length; i++) {
			num5=num5+dd[i]+bbed[i];
		}
		
		if(Integer.parseInt(str[1])==0){
			return num3+"Õû";
		}else{
			return num3+num5;
		}
		
	
		
	 
}
	
	public static String con(String num){
		char arr[]={'Ò¼','·¡','Èþ','ËÁ','Îé','Â½','Æâ','°Æ','¾Á','Áã'};
		char aa[] = num.toCharArray();
		String num2 = "";
		for (int i = 0; i < aa.length; i++) {
			if(aa[i]=='0'){
				num2=num2+arr[9];
				//break;
			}
			if(aa[i]=='1'){
				num2=num2+arr[0];
				//break;
			}
			if(aa[i]=='2'){
				num2=num2+arr[1];
				//break;
			}
			if(aa[i]=='3'){
				num2=num2+arr[2];
				//break;
			}
			if(aa[i]=='4'){
				num2=num2+arr[3];
				//break;
			}
			if(aa[i]=='5'){
				num2=num2+arr[4];
				//break;
			}
			if(aa[i]=='6'){
				num2=num2+arr[5];
				//break;
			}
			if(aa[i]=='7'){
				num2=num2+arr[6];
				//break;
			}
			if(aa[i]=='8'){
				num2=num2+arr[7];
				//break;
			}
			if(aa[i]=='9'){
				num2=num2+arr[8];
				//break;
			}
			
		}
		return num2;
	}
	
	public static void main(String[] args) {
		System.out.println(convert("1234232.23"));
	}
}
