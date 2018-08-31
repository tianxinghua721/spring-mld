package com.mld.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mld.manage.mapper.UserMapper;
import com.mld.manage.pojo.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> FindUserList() {
		
		return userMapper.FindAll();
	}

}
