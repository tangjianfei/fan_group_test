package com.fg.comm;

/**
 * 客户端异常类
 * @ClassName: ClientException   
 * @Description: TODO  
 * @author: 唐建飞  
 * @date:2015年2月26日 下午2:28:28
 */
public class ClientException extends Exception{

	private static final long serialVersionUID = -2155382375819767054L;

	private String errorCode;

	public ClientException(String errorCode) {
		super(errorCode);
		this.errorCode = errorCode;
	}

	public ClientException(Throwable cause, String errorCode) {
		super(cause);
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}
}
