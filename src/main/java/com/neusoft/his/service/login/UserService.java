package com.neusoft.his.service.login;

import com.neusoft.his.entity.User;

public interface UserService {
//	用于登录，按登录名和密码查询用户
	public User selectUserByUserNameByPassword(User user);

}
