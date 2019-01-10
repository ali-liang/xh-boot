package com.xingkong.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomRealm /*extends AuthorizingRealm*/ {
    /*private UserMapper userMapper;
    @Autowired
    private void setUserMapper(UserMapper userMapper){
        this.userMapper = userMapper;
    }
    *//**
     * 获取身份验证信息
     * Shiro中，最终是通过 Realm 来获取应用程序中的用户、角色及权限信息的。
     *
     * @param authenticationToken 用户身份信息 token
     * @return 返回封装了用户信息的 AuthenticationInfo 实例
     *//*

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("-----身份认证方法-----");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //从数据库获取对应用户名密码的用户
        String password = userMapper.getPassword(token.getUsername());
        if(null == password){
            throw new AccountException("用户名不正确");
        }
        return null;
    }
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }*/
}
