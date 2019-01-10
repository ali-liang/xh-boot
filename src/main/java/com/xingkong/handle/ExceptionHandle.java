package com.xingkong.handle;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xingkong.result.ReturnObject;

@ControllerAdvice
public class ExceptionHandle {
	private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ReturnObject handle(Exception e){
		logger.error("【系统异常】{}",e);
		return ReturnObject.error(e.getMessage());
	}
}