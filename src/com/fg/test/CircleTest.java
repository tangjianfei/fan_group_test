package com.fg.test;

import net.sf.json.JSONObject;

import com.fg.client.ClientServer;

public class CircleTest {
	
	public static void main(String[] args) {
		try {
			//获取粉逗圈消息列表
			get_circle_list();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取粉逗圈消息列表
	 * @Title: get_circle_list   
	 * @Description: TODO  
	 * @author: 唐建飞
	 * @throws Exception  
	 * @return void  
	 * @throws
	 */
	public static void get_circle_list() throws Exception {
		JSONObject fields = new JSONObject();
		
		fields.put("pageNum", "1");
		fields.put("pageSize", "10");
		
		ClientServer.clientServer("/v1/circle/get_circle_list", fields);
	}
}
