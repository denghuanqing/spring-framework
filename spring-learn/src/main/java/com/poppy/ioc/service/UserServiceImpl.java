package com.poppy.ioc.service;

import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Poppy
 * @create: 2021-05-19 10:48
 **/
public class UserServiceImpl implements UserService {
	@Override
	public String getUserName(String userId) {
		return userId.toUpperCase();
	}
}
