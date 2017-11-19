package WebDriverTest;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;





public class WebDriverIE {
	   private static Logger logger = LoggerFactory.getLogger(WebDriverIE.class);
	  public static String getLinUrl(String conmpanyName) {
	        InternetExplorerDriverService service = null;
	        WebDriver driver = null;
	        String detailUrl = "";
	        String  gsIP = "172.18.131.95:8089/stams/";
//	        String  gsIP = "www.gsxt.gov.cn";
//	        String  gsIP = "123.57.25.115";

	        try {

	            System.setProperty("webdriver.chrome.driver", "C:\\resources\\chromedriver.exe");
//	            System.setProperty("webdriver.ie.driver", "C:\\resources\\IEDriverServer.exe");
	         
	            DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
	            ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//	            driver = new InternetExplorerDriver();
	            driver = new ChromeDriver();
	           driver.get("http://"+gsIP);
	       
          Thread.sleep(300);
	           String  page = driver.getPageSource();
	           WebElement name=null;
	           WebElement psw=null;
	          try {
	        	   name = driver.findElement(By.xpath("//*[@id=\"loginName\"]"));
	        	   psw = driver.findElement(By.xpath("//*[@id=\"passWord\"]"));
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}  
	     
	            name.sendKeys("admin");
	            psw.sendKeys("admin123");
	            
	            WebElement btn = driver.findElement(By.xpath("//*[@id=\"loginBtn\"]"));
	            btn.click();
	            Thread.sleep(800);
	    /*     Set<Cookie> ckSet=  driver.manage().getCookies();
	            
	               Iterator<Cookie> it=   ckSet.iterator();
		           while(it.hasNext()){
		        	   System.out.println(it.next());
		           }*/
//	          Cookie cookie= driver.manage().getCookieNamed("JSESSIONID");
//	          System.out.println(cookie);
	    /*      
	          Cookie cookie1 = new Cookie("JSESSIONID", "6C9422B2B1043EE77FCE62D4E3398B08");
	          Cookie cookie2 = new Cookie("__jsluid", "d4895ec440878073e3b60ed81b727adc");
	          Cookie cookie3 = new Cookie("UM_distinctid", "15c7b52b52f2a-0aa8cca4dca14b-4e45062e-100200-15c7b52b5305c");
	          Cookie cookie4 = new Cookie("Hm_lvt_cdb4bc83287f8c1282df45ed61c4eac9", "1496717638");
	          Cookie cookie5 = new Cookie("td_cookie", "18446744071809552525");
	          Cookie cookie6 = new Cookie("CNZZDATA1261033118", "784700768-1496712341-%7C1497257746");
	          
	          driver.manage().deleteAllCookies();
	          driver.manage().addCookie(cookie1);
	          driver.manage().addCookie(cookie2);
	          driver.manage().addCookie(cookie3);
	          driver.manage().addCookie(cookie4);
	          driver.manage().addCookie(cookie5);
	          driver.manage().addCookie(cookie6);
	          Thread.sleep(600);*/
	           String currentWindow = driver.getWindowHandle();  
	           System.out.println("当前窗口"+currentWindow);
	          //得到所有窗口的句柄  
	     
	            
	       
	            
	            driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	           driver.switchTo().frame("mainframe");
	           String currentWindow2 = driver.getWindowHandle();  
	           System.out.println("当前窗口"+currentWindow2);
//	            driver.get("http://172.18.131.95:8089/stams/getOperateLog.action");
//	            ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//	            driver.switchTo().window(tabs.get(1)); //switches to new tab
	            JavascriptExecutor executor = (JavascriptExecutor) driver;
	            executor.executeScript("document.getElementById('maindiv').src='getOperateLog.action'");
	           Set<String> handles = driver.getWindowHandles();  
		          Iterator<String> it = handles.iterator();  
		          while(it.hasNext()){  
		        	  System.out.println(it.next());
//		          if(currentWindow == it.next()) continue;  
//		          WebDriver window = driver.switchTo().window(it.next());  
//		          window.get("http://172.18.131.95:8089/stams/getOperateLog.action");
//		          System.out.println("title,url = "+window.getTitle()+","+window.getCurrentUrl());  
		          }
	          
	            
	            
	            

//	          driver.get("http://172.18.131.95:8089/stams/getOperateLog.action");
		   
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           // driver.quit();
	        }
	        return detailUrl;
	    }
	  public static void main(String[] args) {
		  
		  getLinUrl("三泰电子");
	}
}
