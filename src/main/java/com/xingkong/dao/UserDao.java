package com.xingkong.dao;

import java.util.List;



import java.util.Map;


import com.xingkong.pojo.User;


public interface UserDao {
    int deleteByPrimaryKey(Long testId);

    int insert(User record);

    int insertSelective(User record);
    
    User findByNamePassword(Map<String,Object> hashMap);
    User findOne(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    List<Map<String,Object>> findAll();
}