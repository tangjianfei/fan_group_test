package com.fg.util;

/**
 * 接口信息验证类
 * @author Administrator
 *
 */
public class Validate {
	/**
	 * 邮编验证
	 * @param zip
	 * @return
	 */
	public static boolean isZipValid(String zip){
	    boolean retval = false;
	    String zipCodePattern = "[1-9]\\d{5}(?!\\d)";
	    retval = zip.matches(zipCodePattern);
	    return retval;
	}
	
	/**
	 * 邮箱验证
	 * @param email
	 * @return
	 */
	public static boolean isEmail(String email){
	    boolean retval = false;
	    String emailPattern = "^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+[.]([a-zA-Z0-9_-])+";
	    retval = email.matches(emailPattern);
	    return retval;
	}

}
