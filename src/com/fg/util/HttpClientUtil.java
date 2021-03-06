package com.fg.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;

import com.fg.comm.ClientException;

/**
 * http请求工具类
 * @ClassName: HttpClientUtil   
 * @Description: TODO  
 * @author: 唐建飞  
 * @date:2015年2月26日 下午1:46:52
 */
public class HttpClientUtil {

	//private static final Log log = LogFactory.getLog(SendMessageUtil.class);
	private static final int TIMEOUT=5*1000*60;
	private static final int CONNECTION_TIMEOUT=5*1000*60;
	private static final int SO_TIMEOUT=5*1000*60;
	
	private HttpClientUtil(){}
	
	private static HttpClient httpClient ;
	
	private static synchronized HttpClient getHttpClient(String charset){
		if(null == httpClient){
			HttpParams httpParams = new BasicHttpParams();
			httpParams.setParameter("http.method.retry-handler", new DefaultHttpRequestRetryHandler());
			httpParams.setBooleanParameter("http.connection.stalecheck", false);
			//参数设置
			HttpProtocolParams.setVersion(httpParams, HttpVersion.HTTP_1_1);
			HttpProtocolParams.setContentCharset(httpParams, charset);
			HttpProtocolParams.setUseExpectContinue(httpParams, true);
			//超时设置
			ConnManagerParams.setTimeout(httpParams, TIMEOUT);
			//连接超时
			HttpConnectionParams.setConnectionTimeout(httpParams, CONNECTION_TIMEOUT);
			//请求超时
			HttpConnectionParams.setSoTimeout(httpParams, SO_TIMEOUT);
			
			//设置支持HTTP和HTTPS
			SchemeRegistry schemeReg = new SchemeRegistry();
			schemeReg.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
			schemeReg.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
			//使用线程安全的连接创建HttpClient
			ClientConnectionManager conManager = new ThreadSafeClientConnManager(httpParams, schemeReg);
			httpClient = new DefaultHttpClient(conManager,httpParams);
		}
		return httpClient;
	}
	
	public static String sendHttpMessageXml(String url,Map<String, String> map,String charset) throws ClientException{
		return sendHttpMessage(url, map, charset, "text/xml");
	}
	
	public static String sendHttpMessageJson(String url,Map<String, String> map,String charset) throws ClientException{
		return sendHttpMessage(url, map, charset, "application/json");
	}
	
	public static String sendHttpMessageText(String url,Map<String, String> map,String charset) throws ClientException{
		return sendHttpMessage(url, map, charset, "text/html");
	}
	
	private static String sendHttpMessage(String url,Map<String, String> map,String charset,String type) throws ClientException{
		try {
			if(StringUtil.isEmpty(url) || null == map || map.isEmpty()){
				return null;
			}
			//创建POST请求
			HttpPost post = new HttpPost(url);
			post.setHeader("Content-type", (new StringBuilder()).append("application/x-www-form-urlencoded; charset=").append(charset).toString());
	        post.setHeader("Accept",new StringBuffer(type+";charset=").append(charset).toString());
	        post.setHeader("Cache-Control", "no-cache");
	        
	        List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>();
	        //请求参数
			for(String key : map.keySet()){
				params.add(new BasicNameValuePair(key,map.get(key))); 
			}
	        post.setEntity(new UrlEncodedFormEntity(params, charset));
	        
			//发送请求
			HttpClient client = getHttpClient(charset);
			HttpResponse response = client.execute(post);
			System.out.println("请求结果："+response.getStatusLine().getStatusCode());
			if(response.getStatusLine().getStatusCode() != HttpStatus.SC_OK){
				throw new ClientException("请求失败！");
			}
			
			HttpEntity resEntity = response.getEntity();
			return null == resEntity ? "" : EntityUtils.toString(resEntity,charset);
		} catch (UnknownHostException e) {
			e.printStackTrace();
			throw new ClientException(e.getMessage());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new ClientException(e.getMessage());
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			throw new ClientException(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			throw new ClientException(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new ClientException(e.getMessage());
		}
	}
	
}
