package com.neusoft.his.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.his.entity.User;
import com.neusoft.his.service.login.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
//	用于登录，按登录名和密码查询用户
	@RequestMapping("/selectUserByUserNameByPassword")
	public User selectUserByUserNameByPassword(@RequestBody User user)throws Exception {
		return userService.selectUserByUserNameByPassword(user);
	}
	

}
