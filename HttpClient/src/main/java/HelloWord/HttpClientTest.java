package HelloWord;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.CookieStore;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
/**
 * 
 * 
 * @author Edmund
 *
 */
public class HttpClientTest {
	 static CookieStore cookieStore = null;
	  static HttpClientContext context = null;
	public static void main(String[] args) throws Exception {
		
		CloseableHttpClient httpClient = new SSLClient();
//		HttpPost post = new HttpPost("http://47.92.90.237");
//		HttpPost post = new HttpPost("http://127.0.0.1:8080/com.santbbd.gsxt.server");
		HttpPost post = new HttpPost("http://127.0.0.1:8080/com.santbbd.gsxt.server");
		post.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:52.0) Gecko/20100101 Firefox/52.0");
		/* Map<String,String> paramMap  = new HashMap<String, String>();
		List<NameValuePair> list = new ArrayList<NameValuePair>();  
          Iterator iterator = paramMap.entrySet().iterator();  
          while(iterator.hasNext()){  
              Entry<String,String> elem = (Entry<String, String>) iterator.next();  
              list.add(new BasicNameValuePair(elem.getKey(),elem.getValue()));  
          }
          if(list.size() > 0){  
              UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list,"UTF-8");  
              post.setEntity(entity);  
          } 
		 */



//		post.setEntity(postEntity);
//		reqentity = new StringEntity("{'loginName':'admin','passWord':'admin123'}");
//		
		CloseableHttpResponse response = null;
//		CloseableHttpResponse response2 = null;
		try {
			response = httpClient.execute(post);//
			HttpEntity  entity = response.getEntity(); //
			System.out.println("返回的网页内容是："+EntityUtils.toString(entity,"GBK"));
	
		
			System.out.println("返回的状态码"+response.getStatusLine());
			//System.out.println("shemksjdjagkj");
			/*HttpGet get = new HttpGet("http://172.18.131.95:8080/stams-new/CusSummary.action");
			response2 = httpClient.execute(get);//閹笛嗩攽get鐠囬攱鐪�
			HttpEntity entity2 = response2.getEntity();
			System.out.println("返回的网页内容是："+EntityUtils.toString(entity2,"UTF-8"));*/
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
