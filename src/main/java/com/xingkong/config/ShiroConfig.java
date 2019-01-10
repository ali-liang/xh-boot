package com.xingkong.config;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;


public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //必须设置SecurityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //setLoginUrl如果不设值，默认会自动寻找web工程根目录下的"login.jsp"页面或"/login"映射
        shiroFilterFactoryBean.setLoginUrl("/notLogin");
        //设值无权限时跳转的url
        shiroFilterFactoryBean.setUnauthorizedUrl("/notRole");
        //设置拦截器
        Map<String,String> filterChain = new LinkedHashMap<String,String>();
        //游客，开发权限
        filterChain.put("/guest/**","anon");
        //用户，需要角色权限 "user"
        filterChain.put("/user/**","roles[user]");
        //管理员，需要角色权限 "admin"
        filterChain.put("/admin/**","roles[admin]");
        //开放登录接口
        filterChain.put("/login","anon");
        //其余接口一律拦截
        //主要这行代码必须放在所有权限设置的最后，不然会导致所有 url 都被拦截
        filterChain.put("/**","authc");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChain);
        System.out.println("Shiro拦截器工厂类注入成功");
        return shiroFilterFactoryBean;

    }
    /**
     * 自定义身份认证 realm;
     * <p>
     * 必须写这个类，并加上 @Bean 注解，目的是注入 CustomRealm，
     * 否则会影响 CustomRealm类 中其他类的依赖注入
     */
    /*public CustomRealm customRealm(){
        return new CustomRealm();
    }*/
}
