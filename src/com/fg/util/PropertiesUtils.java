package com.fg.util;

import java.net.URL;
import java.util.Properties;

public class PropertiesUtils {
	
	/**
	 * 获取根据文件名获取classpath下的properties文件信息
	 * @Title: loadConfigFile   
	 * @Description: TODO  
	 * @author: 唐建飞  
	 * @param fileName
	 * @param classInfo
	 * @return
	 * @throws Exception  
	 * @return Properties  
	 * @throws
	 */
	public static Properties loadConfigFile(String fileName) throws Exception {
		URL url = new PropertiesUtils().getClass().getResource("/" + fileName);
		Properties props = new Properties();
		try {
			props.load(url.openStream());
		} catch (Exception e) {
			
			System.out.println("不能读取属性文件，请确保" + fileName + "在CLASSPATH指定的路径中" + e);
			throw e;
		}
		return props;
	}
}
