package com.neusoft.his.service.login.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.entity.User;
import com.neusoft.his.mapper.login.UserMapper;
import com.neusoft.his.service.login.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

//	用于登录，按登录名和密码查询用户
	@Override
	public User selectUserByUserNameByPassword(User user) {
		return userMapper.selectUserByUserNameByPassword(user);
	}
	

}
