/**    
 * 文件名：UseGeeTestDemo.java    
 *    
 * 版本信息：    
 * 日期：2017年3月30日    
 * Copyright 民生电商 Corporation 2017     
 * 版权所有    
 *    
 */
package com.santbbd.gsxt.server;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HTMLParserListener;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.santbbd.entity.TypeNameEnum;
import com.santbbd.gsxt.util.HttpUtils;
import com.santbbd.gsxt.util.RedisHelper;
import com.santbbd.gsxt.util.SysUtil;
//import com.sun.jna.platform.win32.WinDef.ULONG;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/**
 * 
 * 项目名称：GsxtCompany 类名称：UseGeeTestDemo 类描述： 创建人：dengchao 创建时间：2017年3月30日
 * 上午10:06:34 修改人：dengchao 修改时间：2017年3月30日 上午10:06:34 修改备注：
 * 
 * @version
 * 
 */
@Controller
public class GsxtInfoGetServerController {

	private Logger logger = LoggerFactory.getLogger(GsxtInfoGetServerController.class);
	// private static AtomicInteger count = new AtomicInteger(0);

	@RequestMapping(value = "/gsxt/info", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Object list(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "detailUrl", required = true) String detailUrl) {
		// count.incrementAndGet();
		 System.out.println("进来了");
		JMSProducer.SendMsg("172.18.71.75_CCB");
		logger.info("detailUrl:" + detailUrl);
		JSONObject basic_info = new JSONObject();
		JSONObject result = new JSONObject();
		boolean cacheFlag = false;
		String key = detailUrl.replaceAll("http://www.gsxt.gov.cn/", "");
		String info = RedisHelper.get(key);

		if ("nil".equals(info) || info == null) {
			logger.info("缓存未命中");
			if (detailUrl.contains("qyxy.baic.gov.cn")) {
				// 属于北京地区的网址，调用北京当地工商局网址爬虫程序
				try {
					basic_info = (JSONObject) BeijingGs(detailUrl);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					result.put("code", "00001");
					result.put("message", "失败");
					result.put("data", "在线抓取工商信息失败，请手动输入公司名称！");
					return result;
				}
			}
		} else {
			logger.info("缓存命中" + info);
			basic_info = JSONObject.fromObject(info);
			cacheFlag = true;
		}

		String msg = "";
		String daymicIP = "{'data':''}";
		try {
			daymicIP = HttpUtils.doGet("http://172.18.71.75:8090/ali-server/ali/server/getIp.do", "UTF-8");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// String daymicIP ="{'data':''}";
		boolean flag = false;
		logger.info("IP是：" + daymicIP);
		if (daymicIP.contains("data") && "{".equals(daymicIP.substring(0, 1))) {
			JSONObject ipObject = JSONObject.fromObject(daymicIP);
			if ("0000".equals(ipObject.get("status")) && !"".equals((String) ipObject.get("data"))) {
				daymicIP = (String) ipObject.get("data");
				// daymicIP="www.gsxt.gov.cn";
				flag = true;
				// System.out.println("动态IP:"+daymicIP);
			} else {
				flag = false;
				msg = "获取动态IP失败";
				logger.warn("获取IP失败");
			}
		} else {
			flag = false;
			msg = "获取动态IP失败";
			logger.warn("获取IP失败");
		}
		// Gson gson = new Gson();

		// JSONArray share_info = new JSONArray();
		// 如果获取到动态IP
		if (flag == true && !basic_info.containsKey("companyName")) {
			if (detailUrl.contains("http://www.gsxt.gov.cn/")) {
				detailUrl = detailUrl.replaceAll("www.gsxt.gov.cn", daymicIP);
				// System.out.println("1111111111");
			} else {
				detailUrl = "http://" + daymicIP + "/" + detailUrl;
				// System.out.println("2222222222222");
			}
			logger.info("详情地址：" + detailUrl);
			final WebClient webclient = new WebClient(BrowserVersion.CHROME);
			// webclient.getOptions().setJavaScriptEnabled(true);
			webclient.getOptions().setCssEnabled(false);
			webclient.getOptions().setJavaScriptEnabled(false);
			webclient.getOptions().setThrowExceptionOnFailingStatusCode(true);
			webclient.getOptions().setTimeout(20000);

			HtmlPage htmlpage = null;
			URL url = null;
			int statuscode = 200;
			try {
				URL murl = new URL(detailUrl);
				WebRequest webRequest = new WebRequest(murl);
				WebResponse webResponse = webclient.loadWebResponse(webRequest);
				statuscode = webResponse.getStatusCode();
				logger.info("响应状态：" + statuscode);
				if (statuscode == 200) {
					htmlpage = webclient.getPage(detailUrl);
				} else {
					throw new Exception("IP error");
				}

				logger.info("状态：" + htmlpage.getReadyState());
				url = htmlpage.getUrl();
				// System.out.println("url:"+url);
				String xmlStr = "";
				if (url.getPath().contains("blackList")) {
					logger.warn("未获取到网页内容，IP可能被封,已申请更换IP，请稍后重试！");
					msg = "未获取到网页内容，IP可能被封,已申请更换IP，请稍后重试！";
					HttpUtils.doGet("http://172.18.71.75:8090/ali-server/ali/server/changeIp.do", "UTF-8");
				} else {
					// System.out.println(url.getPath());
					webclient.waitForBackgroundJavaScript(10000);
					DomElement dom = htmlpage.getElementById("primaryInfo");
					if (dom != null) {
						xmlStr = dom.asXml();
						// System.out.println(xmlStr);
						// 去掉部分经营范围有换行的情况
						xmlStr = xmlStr.replaceAll("<br/>", "");
						XMLSerializer xmlSerializer = new XMLSerializer();
						JSON json = xmlSerializer.read(xmlStr);
						JSONObject object = JSONObject.fromObject(json.toString());
						JSONArray array = object.getJSONArray("div");
						JSONArray array2 = JSONArray.fromObject(array.get(1));
						for (int i = 0; i < array2.size(); i++) {
							JSONObject data = array2.getJSONObject(i);
							String a = data.getString("dt").trim();
							a = a.substring(0, a.length() - 1);
							if (TypeNameEnum.getExamType(a) != null) {
								a = TypeNameEnum.getExamType(a).getTypeCode();
								String b = data.getString("dd").trim();
								if (b.contains("@title")) {
									JSONObject obj = JSONObject.fromObject(b);
									b = obj.getString("@title").trim();
								}
								if (basic_info == null || basic_info.isNullObject()) {
									basic_info = new JSONObject();
								}
								basic_info.put(a, b);
							}

						}
					} else {
						logger.warn("传送的详情地址已失效！请重新生成地址");
						msg = "传送的详情地址已失效！请重新生成地址";
					}

				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				String error = e.getLocalizedMessage();

				if (error.contains("timed out")) {
					msg = "服务器访问超时！！！";
				} else if (error.contains("IP error")) {
					msg = "未获取到网页内容，IP可能被封,已申请更换IP，请稍后重试！";
					HttpUtils.doGet("http://172.18.71.75:8090/ali-server/ali/server/changeIp.do", "UTF-8");
				} else {
					logger.error("错误信息是：" + error);
					msg = "服务异常！！！";
				}
				;

			}

		} else if (basic_info.containsKey("companyName")) {
			logger.info("使用缓存数据！");
		} else {
			logger.warn("服务器正在更换IP，请稍后再试！");
			msg = "服务器正在更换IP，请稍后再试！";
		}

		// 最后的格式处理
		if (basic_info.containsKey("companyName")) {
			String scope = (String) basic_info.get("operateScope");
			scope = scope.replace('\n', ' ');
			basic_info.put("operateScope", scope.replaceAll("\\s*", ""));
			String esDate = (String) basic_info.get("esDate");
			esDate=esDate!=null?esDate:"";
			String startDate = (String) basic_info.get("credentialStartDate");
			startDate=startDate!=null?startDate:"";
			String endDate = (String) basic_info.get("creditNoEndDate");
			endDate=endDate!=null?endDate:"";
			if (esDate.matches("^\\d{4}[年]\\d{2}[月]\\d{2}[日]$") || esDate.matches("^\\d{4}[-]\\d{2}[-]\\d{2}$")) {
				esDate = SysUtil.transDateFormat(esDate);
				basic_info.put("esDate", esDate);
			}
			if (startDate.matches("^\\d{4}[年]\\d{2}[月]\\d{2}[日]$") || startDate.matches("^\\d{4}[-]\\d{2}[-]\\d{2}$")) {
				startDate = SysUtil.transDateFormat(startDate);
				basic_info.put("credentialStartDate", startDate);
			}
			if (endDate.matches("^\\d{4}[年]\\d{2}[月]\\d{2}[日]$") || endDate.matches("^\\d{4}[-]\\d{2}[-]\\d{2}$")) {
				endDate = SysUtil.transDateFormat(endDate);
				basic_info.put("creditNoEndDate", endDate);
			}

			result.put("code", "00000");
			result.put("message", "成功");
			result.put("data", basic_info);
			if (!cacheFlag) {
				RedisHelper.set(key, basic_info.toString(), 60 * 10);
				logger.info("redis缓存设置成功！");
			}

		} else {
			result.put("code", "00001");
			result.put("message", "失败");
			result.put("data", msg);
		}
		return result;
	}

	public static void main(String[] args) {
		String endDate = "2016-02-25";
		System.out.println(endDate.matches("^\\d{4}[年]\\d{2}[月]\\d{2}[日]$"));
		System.out.println(endDate.matches("^\\d{4}[-]\\d{2}[-]\\d{2}$"));
		RedisHelper.set("name","Edmund" , 60 * 10);
		
	}

	public Object BeijingGs(String detailUrl) throws IOException {
		JSONObject basic_info = new JSONObject();
		URL murl;
		WebClient webclient = new WebClient();
		webclient.getOptions().setJavaScriptEnabled(true);
		webclient.getOptions().setCssEnabled(false);
		webclient.getOptions().setJavaScriptEnabled(false);
		webclient.getOptions().setTimeout(10000);
		murl = new URL(detailUrl);
		WebRequest webRequest = new WebRequest(murl);
		webRequest.setAdditionalHeader("User-Agent",
				"Mozilla/5.0 (iPhone; CPU iPhone OS 9_1 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Version/9.0 Mobile/13B143 Safari/601.1");
		webRequest.setCharset("UTF-8");
		WebResponse webResponse;
		webResponse = webclient.loadWebResponse(webRequest);
		int statuscode = webResponse.getStatusCode();
		logger.info("响应状态：" + statuscode);

		HtmlPage htmlpage = webclient.getPage(webRequest);

		// System.out.println(htmlpage.asXml());
		DomNodeList<DomElement> dom = htmlpage.getElementsByTagName("dl");
		DomElement dom1 = dom.get(0);
		String xml = dom1.asXml();
		// System.out.println(xml);
		XMLSerializer xmlSerializer = new XMLSerializer();
		JSON json = xmlSerializer.read(xml);
		JSONObject object = JSONObject.fromObject(json.toString());
		JSONArray dtArray = object.getJSONArray("dt");
		JSONArray ddArray2 = object.getJSONArray("dd");
		JSONArray ddnew = new JSONArray();
		if (ddArray2.size() > dtArray.size()) {
			for (int i = 0; i < dtArray.size(); i++) {
				if (i >= 1) {
					ddnew.add(i, ddArray2.get(i + 1));
				} else {
					ddnew.add(i, ddArray2.get(i));
				}

			}

		} else {
			ddnew = ddArray2;
		}
		// System.out.println(object);
		// System.out.println(dtArray);
		// System.out.println(ddArray2);

		String property = "";
		String name = "";
		String key = "";
		for (int i = 0; i < dtArray.size(); i++) {
			name = (String) dtArray.get(i);
			name = name.replaceAll("\\s*", "").replaceAll("\\n", "").replaceAll("\\t", "");

			property = (String) ddnew.get(i);
			property = property.replaceAll("\\s*", "").replaceAll("\\n", "").replaceAll("\\t", "");
			char lastChar = property.charAt(property.length() - 1);
			if ((int) lastChar == 160) {
				property = property.substring(0, property.length() - 1);
			}
			// System.out.println(property);
			// System.out.println(lastChar+":"+(int)lastChar);
			if (TypeNameEnum.getExamType(name) != null) {
				key = TypeNameEnum.getExamType(name).getTypeCode();
				basic_info.put(key, property);
			}

		}

//		System.out.println(basic_info);

		// System.out.println(json);

		return basic_info;

	}
}
