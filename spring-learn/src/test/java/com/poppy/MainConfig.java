package com.poppy;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: DENGHUANQING1
 * @create: 2021-05-18 16:47
 **/
public class MainConfig {

	@Test
	public void test() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");
		User user = ctx.getBean(User.class);//此处打断点
		System.out.println("user = " + user);
	}
}
