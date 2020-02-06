package com.neusoft.his.mapper.login;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.his.entity.User;

@Mapper
public interface UserMapper {
//	用于登录，按登录名和密码查询用户
	@Select("select * from user where userName = #{userName} and password = #{password}")
	public User selectUserByUserNameByPassword(User user);

}
