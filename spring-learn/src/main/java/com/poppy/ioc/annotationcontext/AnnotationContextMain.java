package com.poppy.ioc.annotationcontext;

import com.poppy.ioc.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: 基于注解的Spring Ioc容器
 * @author: Poppy
 * @create: 2021-05-19 16:16
 **/
public class AnnotationContextMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.poppy.ioc");
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService.getUserName("poppy"));
	}
}
