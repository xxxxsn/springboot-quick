package com.xiesn.springboot.exception;

import lombok.Data;

/**
 * 自定义异常
 */
@Data
public class CustomException extends Exception{

    /**
	 * 
	 */
	private static final long serialVersionUID = -8204265181793605055L;
	private int code;
	private String msg;
	/**
	 * 异常出现后是否需要发送信息
	 */
	private boolean alert = false;
	/**
	 * 异常出现后是否需要保存起来
	 */
	private boolean persistent = false;
	
	public CustomException(int errCode, String errMsg){
		super(errMsg);
		this.code = errCode;
		this.msg = errMsg;
	}
	
	


	
}
