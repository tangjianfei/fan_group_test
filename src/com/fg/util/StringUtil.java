package com.fg.util;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.json.JSONObject;

/**
 * 字符串工具类
 * @ClassName: StringUtil   
 * @Description: TODO  
 * @author: 唐建飞  
 * @date:2014年11月4日 下午3:56:50
 */
public class StringUtil {

	/**
	 * 检查字符串是否为null或空值
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		if(null == str || "".equals(str) || "".equals(str.trim())){
			return true;
		}
		return false;
	}
	
	/**
	 * 检查字符串是否为邮箱格式
	 * @param email
	 * @author liuhaibo
	 * @return
	 */
	public static boolean isEmail(String email){
		if(isEmpty(email))return false;
		boolean bool = true;
		String regex = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(!matcher.matches()){
			bool = false;
		}
		return bool;
	}
	
	/**
	 * 检查字符串是否为数值类型
	 * @param number
	 * @author liuhaibo 
	 * @return
	 */
	public static boolean isNumeric(String number){
		if(number.matches("//d*")){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 如果参数为空就返回空字符串
	 * @Title: isNullStr   
	 * @Description: TODO  
	 * @author: 唐建飞
	 * @param str
	 * @return  
	 * @return String  
	 * @throws
	 */
	public static String isNullStr(Object str) {
		return str!=null?str.toString():"";
	}
	
	/**
	 * 拼接xml，如果参数为空就返回空字符串
	 * @Title: isNullStr   
	 * @Description: TODO  
	 * @author: 唐建飞
	 * @param str
	 * @return String  
	 */
	public static String isNullXml(Object obj,String field) {
		StringBuffer result = new StringBuffer();
		if(obj!=null) {
			result.append("<"+ field +">");
			result.append(obj);
			result.append("</"+ field +">");
		}
		
		return result.toString();
	}
	
	/**
	 * 拼接xml，如果为空抛出异常
	 * @Title: isNullXmlException   
	 * @Description: TODO  
	 * @author: 唐建飞
	 * @param obj
	 * @param field
	 * @param exception
	 * @throws Exception  
	 * @return String  
	 */
	public static String isNullXmlException(Object obj,String field,String exception) throws Exception {
		StringBuffer result = new StringBuffer();
		if(obj!=null) {
			result.append("<"+ field +">");
			result.append(obj);
			result.append("</"+ field +">");
		} else {
			throw new Exception(exception);
		}
		
		return result.toString();
	}
	
	/**
	 * url转码
	 * @Title: encoderStr   
	 * @Description: TODO  
	 * @author: 唐建飞
	 * @param str
	 * @return  
	 * @return String  
	 * @throws
	 */
	public static String encoderStr(String str) {
		String result = "";
		try {
			result = URLEncoder.encode(str, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * 设置json数据
	 * @Title: setJsonStrNotNull   
	 * @Description: TODO  
	 * @author: 唐建飞
	 * @param jobj
	 * @param key
	 * @param obj  
	 * @return void  
	 */
	public static void setJsonStrNotNull(JSONObject jobj,String key,Object obj) {
		if(obj!=null) {
			jobj.put(key, obj);
		}
	}
	
	/**
	 * 设置json数据，如果为空抛出异常
	 * @Title: setJsonStrNotNullException   
	 * @Description: TODO  
	 * @author: 唐建飞
	 * @param jobj
	 * @param key
	 * @param obj
	 * @param exception
	 * @throws Exception  
	 * @return void  
	 */
	public static void setJsonStrNotNullException(JSONObject jobj,String key,Object obj,String exception) throws Exception {
		if(obj!=null && !"".equals(obj.toString())) {
			jobj.put(key, obj);
		} else {
			throw new Exception(exception);
		}
	}
}
