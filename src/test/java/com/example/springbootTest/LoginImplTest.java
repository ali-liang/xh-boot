package com.example.springbootTest;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xingkong.XhApplication;
import com.xingkong.pojo.User;
import com.xingkong.service.login.LoginImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = XhApplication.class)
public class LoginImplTest {
	@Autowired
	private LoginImpl loginService;
	@Test
	public void findOneTest(){
		User user = loginService.findByName("刘备","123456");
		Assert.assertEquals("12345678",user.getPhone());
	}
}
