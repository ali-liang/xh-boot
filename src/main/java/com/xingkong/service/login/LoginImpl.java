package com.xingkong.service.login;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xingkong.dao.UserDao;
import com.xingkong.pojo.User;
@Service
public class LoginImpl implements ILogin{
	@Autowired
	private UserDao userDao;

	public User findByName(String userName, String password){
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("userName",userName);
		param.put("password",password);
		User user = userDao.findByNamePassword(param);
		return user;
	}

}