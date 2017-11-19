package HelloWord;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClientTestGif {
	public static void main(String[] args) {
		//创建httpClient实例
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet get = new HttpGet("http://www.java1234.com/gg/dljd4.gif");
		//设置用户代理，用的是火狐浏览器的版本号，模拟浏览器行为
		get.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:52.0) Gecko/20100101 Firefox/52.0");
		CloseableHttpResponse response = null;
		try {
			response = httpClient.execute(get);//执行get请求
			HttpEntity  entity = response.getEntity(); //获取返回实体
			if(entity != null){
				System.out.println("获取content-type："+entity.getContentType().getValue() );
				InputStream inputStream = entity.getContent();//将返回实体的内容读入
				FileUtils.copyToFile(inputStream, new File("D://HttpClient.gif"));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				response.close();
				httpClient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
