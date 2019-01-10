package com.xingkong.controller;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xingkong.dao.UserDao;
import com.xingkong.pojo.User;
import com.xingkong.result.ReturnObject;

@RestController
public class Test {
	@Autowired
	private UserDao userDao;
	/*@GetMapping(value="/hello")
	public Object findAllTest(){
		PageHelper.startPage(2,3);
		//List<User> list = userDao.findAll();
		//PageInfo<User> pageInfo = new PageInfo<User>(list);
		//return list;
	}*/
	@GetMapping("/save")
	public void save(){
		User user = new User();
		String userId = UUID.randomUUID().toString().replace("-","");
		System.out.println(userId);
		user.setUserId(userId);
		user.setUserName("唐僧");
		user.setPhone("18834830167");
		Date date = new Date();
		int i = userDao.insert(user);
		System.out.println(i);
	}
	@GetMapping(value="/getInfo")
	public void previewPdf(String filePath,HttpServletResponse response){
		System.out.println(filePath);
		filePath = "d:\\瑞信业务接入平台通讯录导入及更新接口1.0.pdf";
		File file = new File(filePath);
		byte[] data = null;
		try {
			FileInputStream fis = new FileInputStream(file);
			data = new byte[fis.available()];//创建了一个和文本大小的缓冲区
			fis.read(data);
			response.getOutputStream().write(data);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * 根据用户名查询相应个人信息
	 */
	@GetMapping(value="/findByName")
	public ReturnObject findByName(@RequestParam("userName") String userName){
		System.out.println("------------");
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("userName", userName);
		 User data = userDao.findByNamePassword(param);
		 return ReturnObject.ok(data);
	}
	/**
	 * 查询全部
	 */
	@GetMapping(value="/findAll")
	public ReturnObject findAll(){
		System.out.println("测试");
		List<Map<String,Object>> data = userDao.findAll();
		return ReturnObject.ok(data);
	}
}
