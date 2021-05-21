package com.poppy.ioc.annotationcontext;

import com.poppy.ioc.service.UserService;
import com.poppy.ioc.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: Poppy
 * @create: 2021-05-19 16:14
 **/
@Configuration
public class AnnotationConfig {
	@Bean
	public UserService userServiceImpl(){
		return new UserServiceImpl();
	}
}
