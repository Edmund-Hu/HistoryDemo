package com.santbbd.gsxt.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

public class HttpUtils {

    private static Logger logger = Logger.getLogger(HttpUtils.class);

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static String doPost(String url, Map<String, String> map, String charset) {
        logger.info("url:" + url + "   params:" + map);
        HttpClient httpClient = null;
        HttpPost httpPost = null;
        String result = null;
        try {
            httpClient = HttpClientBuilder.create().build();
            httpPost = new HttpPost(url);
            //设置参数
            List<NameValuePair> list = new ArrayList<NameValuePair>();
            Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> elem = (Map.Entry<String, String>) iterator.next();
                list.add(new BasicNameValuePair(elem.getKey(), elem.getValue()));
            }
            if (list.size() > 0) {
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list, charset);
                httpPost.setEntity(entity);
            }
            HttpResponse response = httpClient.execute(httpPost);
            if (response != null) {
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    result = EntityUtils.toString(resEntity, charset);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public static String doGet(String sendUrl, String charset) {
        logger.info("url:" + sendUrl);
        HttpClient httpClient = null;
        HttpGet httpPost = null;
        String result = null;
        try {
            httpClient = HttpClientBuilder.create().build();
            httpPost = new HttpGet(sendUrl);
            HttpResponse response = httpClient.execute(httpPost);
            if (response != null) {
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    result = EntityUtils.toString(resEntity, charset);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public static HashMap<String,Object> doForm(String url,Object data,String chartSet) {
        GetMethod getMethod = new GetMethod(url);
        // 填入各个表单域的值 ,设置表头信息
        getMethod.setRequestHeader("Accept", "application/json, text/javascript, */*; q=0.01");
        getMethod.setRequestHeader("Accept-Encoding", chartSet);
        getMethod.setRequestHeader("Accept-Charset", chartSet);
        getMethod.setRequestHeader("Accept-Language", chartSet);
        getMethod.setRequestHeader("Connection", "keep-alive");
        getMethod.setRequestHeader("Content-Length", "0");
        getMethod.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset="+chartSet);
        getMethod.setRequestHeader("Referer", "http://www.gsxt.gov.cn/affiche-query-info-paperall.html?areaId=130000&FKID=0&subTab=tabZ11");
        getMethod.setRequestHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.59 Safari/537.36");
        // 将表单的值放入postMethod中  
        getMethod.setQueryString((org.apache.commons.httpclient.NameValuePair[]) data);
        // 执行postMethod  
        int statusCode = 0;
        org.apache.commons.httpclient.HttpClient httpClient=new org.apache.commons.httpclient.HttpClient();
        try {
            statusCode = httpClient.executeMethod(getMethod);
        } catch (HttpException e) {
            
        } catch (IOException e) {
            
        }
        // HttpClient对于要求接受后继服务的请求，象POST和PUT等不能自动处理转发  
        if (statusCode == HttpStatus.SC_MOVED_PERMANENTLY || statusCode == HttpStatus.SC_MOVED_TEMPORARILY) {
            // 从头中取出转向的地址  
            Header locationHeader = getMethod.getResponseHeader("location");
            String location = null;
            if (locationHeader != null) {
                location = locationHeader.getValue();
                System.out.println("diandianLogin:" + location);
            } else {
                System.err.println("Location field value is null.");
            }
            getMethod.releaseConnection();
            return new HashMap<String,Object>();
        } else {
            System.out.println(getMethod.getStatusLine());
            String str = "";
            try {
                str = getMethod.getResponseBodyAsString();
            } catch (IOException e) {
                
            }
            getMethod.releaseConnection();
            HashMap<String, Object> returnMap=new HashMap<String,Object>();
            returnMap.put("status", getMethod.getStatusLine().getStatusCode());
            returnMap.put("result", str);
            return returnMap;
        }
    }
}
