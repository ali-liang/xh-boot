package com.xingkong.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xingkong.pojo.User;
import com.xingkong.result.ReturnObject;
import com.xingkong.service.login.LoginImpl;

@RestController
public class Login {
	@Autowired
	private LoginImpl loginService;
	@PostMapping("/loginByName")
	public Map validateLogin(@Param("userName") String userName,@Param("password") String password) throws Exception{
		User user = loginService.findByName(userName, password);
		Map<String,Object> map = new HashMap<String,Object>();
		if(user !=null){
			map.put("status",0);
			return map;
		}else{
			map.put("status",-1);
		}
		return map;
	}
}
