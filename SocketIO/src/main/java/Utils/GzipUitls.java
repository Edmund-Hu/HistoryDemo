package Utils;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GzipUitls {
	public static byte[] gzip(byte[] data) throws IOException{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		GZIPOutputStream gzip = new GZIPOutputStream(bos);
		gzip.write(data);
		gzip.finish();
		gzip.close();
		byte[] result = bos.toByteArray();
		bos.flush();
		bos.close();
		return result;
		
	}
	public static byte[] ungzip(byte[] data) throws IOException{
		ByteArrayInputStream bip = new ByteArrayInputStream(data);
		GZIPInputStream gzip = new GZIPInputStream(bip);
		byte[] buf = new byte[1024];
		int num = -1;
		ByteArrayOutputStream bos= new ByteArrayOutputStream();
		while((num=gzip.read(buf,0,buf.length))!=-1){
			bos.write(buf,0,num);
		}
		gzip.close();
		bip.close();
		byte[] result = bos.toByteArray();
		bos.flush();
		bos.close();
		return result;
	}
	public static void main(String[] args) throws IOException {

		String readPath=System.getProperty("user.dir")+File.separator+"sources"+File.separator+"006.jpg";
		System.out.println(readPath);
		File file = new File(readPath);
		InputStream inputStream = new FileInputStream(file);
		BufferedInputStream bin = new BufferedInputStream(inputStream);
		 byte[] data = new byte[bin.available()];
		 bin.read(data);
		 inputStream.close();
		 bin.close();
		 System.out.println("文件原始大小："+data.length);
		 byte[] zipData = GzipUitls.gzip(data);
		 System.out.println("文件压缩后大小："+zipData.length);
		 byte[] unZipData = GzipUitls.ungzip(zipData);
		 System.out.println("文件解压后大小："+unZipData.length);
		 String writePath = System.getProperty("user.dir")+File.separator+"receive"+File.separator+"006.jpg";
		 OutputStream out = new FileOutputStream(writePath);
		 out.write(zipData);
		 out.flush();
		 out.close();
		 
		
	}
}
