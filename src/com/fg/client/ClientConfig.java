package com.fg.client;

import java.util.Properties;

import com.fg.util.PropertiesUtils;

/**
 * 配置文件
 * @ClassName: TestConfig   
 * @Description: TODO  
 * @author: 唐建飞  
 * @date:2015年5月19日 下午1:59:50
 */
public class ClientConfig {
	//秘钥
	private String key;
	//客户端id 
	private String appid;
	//访问地址
	private String url;
	//版本号
	private String version;
	//来源
	private String source;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ClientConfig() {
		try {
			Properties prop = new Properties();
			prop = PropertiesUtils.loadConfigFile("client/clientConfig.properties");
			//接口地址
			this.url = prop.getProperty("url").trim();
			//秘钥
			this.key = prop.getProperty("key").trim();
			//客户端id
			this.appid = prop.getProperty("appid").trim();
			//客户端id
			this.version = prop.getProperty("version").trim();
			//客户端id
			this.source = prop.getProperty("source").trim();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}
	
}
