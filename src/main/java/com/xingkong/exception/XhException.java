package com.xingkong.exception;

public class XhException extends RuntimeException{
	private Integer code;
	
	public XhException(Integer code,String message) {
		super(message);
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
}
