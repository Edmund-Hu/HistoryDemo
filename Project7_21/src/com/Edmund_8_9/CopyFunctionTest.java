package com.Edmund_8_9;

import java.io.File;

public class CopyFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File orignalFile=new File("D:\\test\\test");
		File copyFile=new File("D:\\test\\"+"copy"+orignalFile.getName());
		//System.out.println(copyFile.getAbsolutePath());
		fileinput(orignalFile, copyFile);
		System.out.println("¸´ÖÆ³É¹¦");
	}
		
		public static void fileinput(File orignalFile,File copyFile ){
			if(orignalFile.isFile()){
				CopyFunction.copy(orignalFile, copyFile);
			}else if(orignalFile.isDirectory()){
				copyFile.mkdir();
				File[] sourceFile=orignalFile.listFiles();
				for(int i=0;i<sourceFile.length;i++){
					File targetFile=new File(copyFile.getAbsolutePath()+File.separator+sourceFile[i].getName());
					if(sourceFile[i].isFile()){
						CopyFunction.copy(sourceFile[i], targetFile);
					}else{
						fileinput(sourceFile[i],  targetFile);
					}
				}
				
			}
		}
	

}
