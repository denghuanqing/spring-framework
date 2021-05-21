package com.poppy.ioc.xmlcontext;

import com.poppy.ioc.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 基于xml配置的Spring Ioc容器
 * @author: Poppy
 * @create: 2021-05-19 10:50
 **/
public class MainConfig {
	public static void main(String[] args) {
		/**
		 * 启动IOC容器
		 */
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-ioc.xml");
		/**
		 * 从Ioc容器中取出Bean
		 */
		UserService userServiceImpl = ctx.getBean(UserService.class);
		System.out.println(userServiceImpl.getUserName("Poppy"));
	}
}
