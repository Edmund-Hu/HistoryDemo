package com.santbbd.gsxt.server;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.santbbd.gsxt.util.HttpClientUtils;

public class ShareholderGet {

    public JSONArray GetShareholder(String url) {
        ShareholderGet j = new ShareholderGet();
        String name, invType, blicType_CN, bLicNo;
        JSONArray array = new JSONArray();
        // 任意赋值，在下面程序中算出最终的页数
        Integer total = 100;
        Integer parm = 0;
        for (Integer page = 0; page < total; page++) {
            HttpClientUtils jsonData = new HttpClientUtils();
            // url = "http://www.gsxt.gov.cn/%7BV5ajPe7PNn5zEEirLpG4pKDzhnlGIql7VoAJZUtjtvCjqHbXCmaHSs-X_X3AqpsHdV4QaoMcMgF9qZg6ZqHszl3513LaZa4V7YhB8JWNqI-pM76w8j5mWYkW6sRIo8qx-1493190754911%7D";

            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            nvps.add(new BasicNameValuePair("draw", "1"));
            nvps.add(new BasicNameValuePair("start", parm.toString()));
            parm = parm + 5;
            nvps.add(new BasicNameValuePair("length", "5"));

            String jsondata = jsonData.post(url, nvps);
            JSONObject json = JSONObject.fromObject(jsondata);
            JSONArray jsonArray = JSONArray.fromObject(json.get("data"));
            Integer number = Integer.parseInt(json.get("recordsTotal").toString());
            total = number / 5 + 1;
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject object = jsonArray.getJSONObject(i);
                name = object.get("inv").toString();
                invType = j.regxChinese(object.get("invType_CN").toString());
                blicType_CN = object.get("blicType_CN").toString();
                bLicNo = object.get("bLicNo").toString();
                JSONObject keepObject = new JSONObject();
                keepObject.put("partnerPeople", name);
                keepObject.put("invType_CN", invType);
                keepObject.put("blicType_CN", blicType_CN);
                keepObject.put("bLicNo", bLicNo);
                array.add(keepObject);
            }
        }
        return array;
    }

    public String regxChinese(String source) {
        // 匹配的字符串的正则表达式
        String result = "";
        String regexStr = "[\u4E00-\u9FA5]";
        Pattern p = Pattern.compile(regexStr);
        Matcher m = p.matcher(source);
        while (m.find()) {
            result = result + m.group();
        }
        return result;
    }

}
