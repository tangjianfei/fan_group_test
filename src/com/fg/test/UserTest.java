package com.fg.test;

import net.sf.json.JSONObject;

import com.fg.client.ClientServer;


public class UserTest {
	public static void main(String[] args) {
		try {
			//3.1.1	发送短信验证码
//			sendValidateCode();
			//3.1.2	校验验证码(验证码登陆)
//			checkValidateCode();
			//3.1.3	新注册用户
			registerUser();
			//3.1.4	密码登录
//			doLogin();
			//3.1.5	注销登录
//			doLogout();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * 3.1.1	发送短信验证码
	 * @Title: sendValidateCode   
	 * @Description: TODO  
	 * @author: 唐建飞
	 * @throws Exception  
	 * @return void  
	 * @throws
	 */
	public static void sendValidateCode() throws Exception {
		JSONObject fields = new JSONObject();
		
		fields.put("phone", "18623149838");
		
		ClientServer.clientServer("/v1/user/send_validate_code", fields);
	}
	
	/**
	 * 3.1.2	校验验证码(验证码登陆)
	 * @Title: checkValidateCode   
	 * @Description: TODO  
	 * @author: 唐建飞
	 * @throws Exception  
	 * @return void  
	 * @throws
	 */
	public static void checkValidateCode() throws Exception {
		JSONObject fields = new JSONObject();
		
		fields.put("phone", "18623149838");
		fields.put("validateCode", "1234");
		
		ClientServer.clientServer("/v1/user/check_validate_code", fields);
	}
	
	/**
	 * 3.1.3	新注册用户
	 * @Title: registerUser   
	 * @Description: TODO  
	 * @author: 唐建飞
	 * @throws Exception  
	 * @return void  
	 * @throws
	 */
	public static void registerUser() throws Exception {
		JSONObject fields = new JSONObject();
		
		fields.put("phone", "18623149838");
		fields.put("userName", "印第安囚徒");
		
		ClientServer.clientServer("/v1/user/register_user", fields);
	}
	
	/**
	 * 3.1.4	密码登录
	 * @Title: doLogin   
	 * @Description: TODO  
	 * @author: 唐建飞
	 * @throws Exception  
	 * @return void  
	 * @throws
	 */
	public static void doLogin() throws Exception {
		JSONObject fields = new JSONObject();
		
		String phone = "18623149838";
		
		fields.put("phone", phone);
		fields.put("password", "msjf_"+phone+"_bigfans");
		
		ClientServer.clientServer("/v1/user/do_login", fields);
	}
	
	/**
	 * 3.1.5	注销登录
	 * @Title: doLogout   
	 * @Description: TODO  
	 * @author: 唐建飞
	 * @throws Exception  
	 * @return void  
	 * @throws
	 */
	public static void doLogout() throws Exception {
		JSONObject fields = new JSONObject();
		
		fields.put("phone", "");
		
		ClientServer.clientServer("/v1/user/do_logout", fields);
	}
	
}
