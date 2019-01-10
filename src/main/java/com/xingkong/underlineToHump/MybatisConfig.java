package com.xingkong.underlineToHump;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MybatisConfig {
	@Bean
	public ConfigurationCustomizer mybatisConfigurationCustomizer(){
		return new ConfigurationCustomizer(){
			public void customize(org.apache.ibatis.session.Configuration configuration){
				configuration.setObjectWrapperFactory(new MapWrapperFactory());
			}
		};
	}
}
