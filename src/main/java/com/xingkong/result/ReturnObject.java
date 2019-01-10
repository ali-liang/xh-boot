package com.xingkong.result;

import java.util.List;

public class ReturnObject {
	private String status;
	private String info;
	private Object data;
	
	public ReturnObject(String status, String info, Object data) {
		super();
		this.status = status;
		this.info = info;
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public static ReturnObject ok(Object data){
		return new ReturnObject("ok","操作成功",data);
	}
	public static ReturnObject error(Object data){
		return new ReturnObject("error","操作失败",data);
	}
	@Override
	public String toString() {
		return "ReturnObject [status=" + status + ", info=" + info + ", data="
				+ data + "]";
	}
}