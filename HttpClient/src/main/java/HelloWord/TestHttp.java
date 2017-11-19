package HelloWord;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.jsoup.Connection.Response;

public class TestHttp {
//	 private String url = "https://eapply.abchina.com/entapply/GetSmsCaptcha";  //提交手机号
//	 private String url2 = "https://eapply.abchina.com/entapply/ValidateCaptcha";  //验证码校验
//	 private String url = "https://eapply.abchina.com/entapply/InfromationRegSubmit";//提交预约信息
	 private String url = "https://eapply.abchina.com/entapply/ModalInfoSubmit";//提交股东信息
	 private String url2 = "https://eapply.abchina.com/entapply/AccountInfoSubmit";//签约产品
//	 private String url = "https://eapply.abchina.com/entapply/ProductInfoSubmit";//保存产品
	 
	    private String charset = "utf-8";  
	    private HttpClientUtil httpClientUtil = null;  
	      
	    public TestHttp(){  
	        httpClientUtil = new HttpClientUtil(HttpClients.createDefault());  
	    }  
	      
	    public void test() throws ClientProtocolException, IOException{  
	        String httpOrgCreateTest = url;  
	        Map<String,String> createMap = new HashMap<String,String>();  
//	       createMap.put("TrnMobNum","18628130430");  
	       /*   createMap.put("ExtIpTypCod","610005");  
	        createMap.put("ExtIpId","222222222");  
	        createMap.put("IsCustomer","0");  
	        createMap.put("Captcha","0000");  
	        createMap.put("PrvNo","22"); */ 
	        
	        createMap.put("IpNam","德州仪器成都有限公司");
	        createMap.put("OrgIpId","7239791hud");
	        createMap.put("OrgIpEndDat","2117-06-25");
	        createMap.put("NtlPrfNum","028");
	        createMap.put("PhoNum","87936654");
	        createMap.put("MobNum","18628130430");
	        createMap.put("NatyCod","156");//注册国别地
	        createMap.put("RegCcyCod","CNY");
//	        String httpOrgCreateTestRtn = httpClientUtil.doPost(url2,createMap,charset);  
//	        System.out.println("result:"+httpOrgCreateTestRtn);  
	      Map<String,String> createMap2 = new HashMap<String,String>();  
	        String shareholder = "{\"ShrhldInd\":0,\"ShrhldTyp\":1,\"ShrOrgIpId\":\"79SDHIJ9277263\",\"ShrLcnCod\":\"610005\",\"ShrLcnNum\":\"79SDHIJ9277263\",\"ShrLcnEndDat\":\"2020-12-31\",\"ShrNatyCod\":156,\"ShrhldNam\":\"Edmund\",\"CapCcyCod\":\"CNY\",\"CapAmt\":150000,\"CapWay\":1,\"Stake\":30}";
	        System.out.println(shareholder);
	        /*     createMap2.put("shareholderToJson", shareholder);
//	        createMap2.put("taxToJson", "{}");
//	        createMap2.put("registerDocToJson", "{}");
	        String httpOrgCreateTestRtn2 = httpClientUtil.doPost(url,createMap2,charset);  
	        System.out.println("result:"+httpOrgCreateTestRtn2); */ 
	        System.out.println("{\"shareholderToJson\":"+shareholder+"}");
	    	HttpPost post = new HttpPost("https://eapply.abchina.com/entapply/ModalInfoSubmit");
			post.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:52.0) Gecko/20100101 Firefox/52.0");
			post.setEntity(new StringEntity("{\"shareholderToJson\":"+shareholder+"}", HTTP.UTF_8));  
			CloseableHttpResponse response  = httpClientUtil.httpClient.execute(post);
			HttpEntity entity =  response.getEntity();
	        String result2 = EntityUtils.toString(entity,"GBK");
	    System.out.println(result2);
	    }  
	      
	    public static void main(String[] args) throws ClientProtocolException, IOException{  
	    	TestHttp main = new TestHttp();  
	        main.test();  
	    }  
}
