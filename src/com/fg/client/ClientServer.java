package com.fg.client;

import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;

import net.sf.json.JSONObject;

import com.fg.comm.ClientException;
import com.fg.util.HttpClientUtil;
import com.fg.util.Md5Util;

/**
 * 请求服务器
 * @ClassName: ClientServer   
 * @Description: TODO  
 * @author: 唐建飞  
 * @date:2015年5月19日 下午2:30:27
 */
public class ClientServer {
	
	public static String clientServer (String method,JSONObject fields) throws Exception {
		String resultMsg = "";
		try {
			HashMap<String, String> param = new HashMap<String, String>();
			
			ClientConfig testConfig = new ClientConfig();
			//客户端id
			String appid = testConfig.getAppid();
			param.put("appid", appid);
			//密钥
			String key = testConfig.getKey();
			param.put("key", key);
			//时间戳(13位)
			String timestamp = new Date().getTime()+"";
			param.put("timestamp", timestamp);
			//请求参数
			param.put("fields", fields.toString());
			//版本号
			String version = testConfig.getVersion();
			param.put("version", version);
			//来源
			String source = testConfig.getSource();
			param.put("source", source);
			//签名
			String enc = "UTF-8";
			String validateStr = URLEncoder.encode(appid, enc)+
					URLEncoder.encode(key, enc)+
					URLEncoder.encode(method, enc)+
					URLEncoder.encode(fields.toString(), enc)+
					timestamp+
					version+
					URLEncoder.encode(source, enc)+
					URLEncoder.encode("", enc);
			
			System.out.println("签名前字符串："+validateStr);
			
			String sign = Md5Util.getMD5ofStr(validateStr);
			sign = URLEncoder.encode(sign,enc);
			param.put("sign", sign);
			System.out.println("生成签名："+sign);
			
			//扩展信息
			param.put("ext", "");

			String url = testConfig.getUrl()+method;
			System.out.println("请求url："+url);
			resultMsg = HttpClientUtil.sendHttpMessageJson(url,param,"UTF-8");
			System.out.println("请求报文："+fields.toString());
			System.out.println("返回报文："+resultMsg);
		} catch (ClientException e) {
			e.printStackTrace();
		}
		return resultMsg;
	}
	
}
