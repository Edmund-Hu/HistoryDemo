package HelloWord;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClientTestProxyIP {
	public static void main(String[] args) throws InterruptedException {
		
		//可关闭的httpClient
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet get = new HttpGet("http://www.baidu.com");
//		HttpGet get = new HttpGet("http://www.xdaili.cn/ipagent//privateProxy/getDynamicIP/MF20175224862TGNKhs/03df45821ddb11e79ff07cd30abda612?returnType=2");
//		HttpGet get = new HttpGet("http://www.xdaili.cn/ipagent//newExclusive/getIp?spiderId=f70db1f072a54189943a68c2490fde20&orderno=MF20175227333xeOH8h&returnType=2&count=1");
		//模拟浏览器设置header信息
		get.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.110 Safari/537.36");
		HttpHost proxy = new HttpHost("182.34.22.45",35569);//代理IP和端口
		RequestConfig  config = RequestConfig.custom()
				.setProxy(proxy)
				.setConnectTimeout(1000) 
				.setSocketTimeout(1000)
				.build();
		get.setConfig(config);
		CloseableHttpResponse response = null;
		try {
//			for(int i=0;i<1000;i++){
			response = httpClient.execute(get);
			HttpEntity  entity = response.getEntity(); //放回相应实体
			if(entity != null){
				System.out.println("响应状态"+response.getStatusLine());
				System.out.println("响应类型"+entity.getContentType().getValue() );
				System.out.println("网页内容"+EntityUtils.toString(entity,"UTF-8"));
				
			}
		
//			}
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
