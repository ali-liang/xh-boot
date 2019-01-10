package com.xingkong.service.login;

import com.xingkong.pojo.User;

public interface ILogin {
	public User findByName(String userName,String password) throws Exception;
}
